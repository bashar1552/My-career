

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double Salary = 0;
        System.out.println("enter j or s");
        char ch = S.next().charAt(0);
        if (ch == 's') {
            Salary = 5 * 50;
        } else if (ch == 'j') {
            Salary = 5 * 20;
        }
        System.out.println("s level =" + Salary);

    }
}
