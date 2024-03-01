import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int h = in.nextInt();
        int m = in.nextInt();
        int p = in.nextInt();
        
        int hour;
        int min;
        
        min = h * 60 + m;
        min += p;
        
        hour = (min / 60) % 24;
        min = min % 60;
        
        System.out.println(hour + " " + min);
    }
}