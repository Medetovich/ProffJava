package homeW1;

public class DateRealize {
    public static void main(String[] args) {
        Date dat = new Date(2001,2,9);
        System.out.println(dat.toString());
        dat.addDay(20);
        System.out.println(dat.toString());

    }

}
