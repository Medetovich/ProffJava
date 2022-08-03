package homeW1;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        autoChanging();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%4d-%02d-%02d", year, month, day);
    }
    public void addDay(int days){
        setDay(day+days);
        autoChanging();
    }
    public void autoChanging(){
        if(getDay()>31 & (getMonth()==1 || getMonth() == 3 || getMonth() == 5 || getMonth() == 7 || getMonth() == 8 || getMonth()== 10 || getMonth() ==12)){
            setMonth(getMonth()+getDay()/31);
            setDay(getDay()%31);
        }
        else if(getDay()>30 & (getMonth()==4 || getMonth() == 6 || getMonth() == 9 || getMonth() == 11)){
            setMonth(getMonth() + getDay() / 30);
            setDay(getDay()%30);
        }
        if(getMonth() == 2 && getDay()>=29){
            if((getYear()%4 == 0 && getYear() % 100 != 0) || (getYear()%4 == 0 && getYear() % 100 == 0 && getYear() % 400 == 0)){
                setMonth(getMonth() + getDay() / 29);
                setDay(getDay()%29);
            }
            else{
                setMonth(getMonth() + getDay() / 28);
                setDay(getDay()%28);
            }
        }

        if(getMonth() > 12){
            setYear(getYear() + getMonth() / 12);
            setMonth(getMonth()%12);
        }
    }
}
