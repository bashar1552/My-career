package zuj.std.cp;

import java.util.Scanner;

public class HH_22_4_p2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter time 1:");
        int time1 = scanner.nextInt();
        System.out.print("enter time 2:");
        int time2 = scanner.nextInt();
        System.out.print("enter time 3:");

        int time3 = scanner.nextInt();
        System.out.println("choice");
        System.out.println("A = MAX TIME ");
        System.out.println(
                "B = AVG TIME");
        System.out.println("H = min time ");

        char choice = scanner.next().charAt(0);

        switch (choice) {

            case 'A':
                int max = (time1 + time2 + time3);
                System.out.print("max time=" + max);
                break;

            case 'B':
                int avg = (time1 + time2 + time3 / 3);
                System.out.print("avg time=" + avg);
                break;

            case 'H':

                int min = time1;
                if (time2 < min) {

                    min = time2;

                }
                if (time3 < min) {

                    min = time3;

                }
                System.out.println("min=:" + min);

            default:
                System.out.println("erorr a input");

        }

    }
}
