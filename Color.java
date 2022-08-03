package homeW1;

public class Color {
    int r, g, b;
    public int [] convHSL(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
        float var_R = ( r / 255f );
        float var_G = ( g / 255f );
        float var_B = ( b / 255f );

        float var_Min;
        float var_Max;
        float del_Max;

        if (var_R > var_G)
        { var_Min = var_G; var_Max = var_R; }
        else
        { var_Min = var_R; var_Max = var_G; }

        if (var_B > var_Max) var_Max = var_B;
        if (var_B < var_Min) var_Min = var_B;

        del_Max = var_Max - var_Min;

        float H = 0, S, L;
        L = ( var_Max + var_Min ) / 2f;

        if ( del_Max == 0 ) { H = 0; S = 0; } // gray
        else {                                //Chroma
            if ( L < 0.5 )
                S = del_Max / ( var_Max + var_Min );
            else
                S = del_Max / ( 2 - var_Max - var_Min );

            float del_R = ( ( ( var_Max - var_R ) / 6f ) + ( del_Max / 2f ) ) / del_Max;
            float del_G = ( ( ( var_Max - var_G ) / 6f ) + ( del_Max / 2f ) ) / del_Max;
            float del_B = ( ( ( var_Max - var_B ) / 6f ) + ( del_Max / 2f ) ) / del_Max;

            if ( var_R == var_Max )
                H = del_B - del_G;
            else if ( var_G == var_Max )
                H = ( 1 / 3f ) + del_R - del_B;
            else if ( var_B == var_Max )
                H = ( 2 / 3f ) + del_G - del_R;
            if ( H < 0 ) H += 1;
            if ( H > 1 ) H -= 1;
        }
        return new int []{((int)(360*H)),((int)(S*100)),((int)(L*100))};

    }

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void print(int []d){
        for (int i = 0; i <d.length ; i++) {
            System.out.println(d[i]);
        }
    }
}

