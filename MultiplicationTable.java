import java.util.Scanner;
import java.lang.Math;

public class MultiplicationTable {

    public static void main(String[] args) {
        
        // Scannar input = new Scanner(System.in);

        final int totalRow = 10;
        final int totalCol = totalRow;

        System.out.println("                    Multiplication Table");

        System.out.print("        ");


        for(int col = 1; col <= totalCol; col++) {
            System.out.printf("%5d", col);
        }




        System.out.println("\n   --------------------------------------------------------");

        for(int row = 1; row <= totalRow; row++) {

            System.out.printf("%5d | ", row);


            for(int col = 1; col <= totalCol; col++) {
                System.out.printf("%5d", row * col);
            }
    
            System.out.println("");

        }

        System.out.println("   --------------------------------------------------------");


    }


    
}
