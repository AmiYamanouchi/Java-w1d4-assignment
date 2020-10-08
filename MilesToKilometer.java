import java.util.Scanner;
import java.lang.Math;

public class MilesToKilometer {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int mile = 1;
        
        while(mile <= 10) {
            double kilo = mile * 1.609;
            System.out.println(mile + "   " + kilo );
            mile ++;
        }
    }
}