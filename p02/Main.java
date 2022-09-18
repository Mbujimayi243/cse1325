import java.time.LocalTime;
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Hour? ");
        int Hour=sc.nextInt();
        System.out.print("Minute? ");
        int Minute=sc.nextInt();
        System.out.print("Second? ");
        int Second=sc.nextInt();
        clock c=new clock(Hour,Minute,Second);
        System.out.println(c.toString());
        
        
    }
}
