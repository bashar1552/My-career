package zuj.std.cp;

import java.util.Scanner;

public class HomeWork2p2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number #" + i + ": ");
            int number = input.nextInt(); 

            
            int result = 1; 

            for (int j = 1; j <= number; j++) {
                result = result * j; 
            }

            System.out.println("Factorial of " + number + " is: " + result);
        }

    }
}
