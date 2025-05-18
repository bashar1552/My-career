
package zuj.std.cp;

import java.util.Scanner;

public class HomeWork2p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yesCount = 0; // عداد لإجابات yes

        for (int i = 1; i <= 20; i++) {
            System.out.print("Question #" + i + " (yes/no): ");
            String response = input.nextLine().trim(); // نقرأ الإجابة

            if (response.equalsIgnoreCase("yes")) {
                yesCount++; // نزيد العداد إذا كانت الإجابة yes
            }
        }

        System.out.println("Total 'yes' responses: " + yesCount);
        input.close();
    }
}
