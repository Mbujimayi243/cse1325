import java.text.DecimalFormat;
import java.util.*;
class clock {
    int hour;
    int minute;
    int second;
    public clock(int hour,int minute,int second)
    {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
        rationalize();
    }
    public void rationalize()
    {
        if (this.second >= 60.0) {
            this.second -= 60.0;
            this.minute += 1;
        }
        if (this.minute >= 60) {
            this.minute -= 60;
            this.hour += 1;
        }
        if (this.hour >= 24) {
            this.hour -= 24;
        }
    }
    public String toString()
    {
        String h=twoDigit(this.hour);
        String m=twoDigit(this.minute);
        String s=twoDigit(this.second);
        String str=h+":"+m+":"+s;
        return str;
    }
    public String twoDigit(int number)
    {

        DecimalFormat formatter = new DecimalFormat("00");
        String str = formatter.format(number);
        return str;
    }
   
   
}
