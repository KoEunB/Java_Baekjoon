import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int hour = in.nextInt();
        int minute = in.nextInt();
        
        if(minute < 45){
            hour--;
            minute = 60 - (45 - minute);
            if(hour < 0){
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        } else if(minute >= 45){
            minute = minute - 45;
            System.out.println(hour + " " + minute);
        }
    }
}