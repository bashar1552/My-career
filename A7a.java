package zuj.std.cp;

import java.util.Scanner;


public class A7a {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("plase enter a day :");
        
                
        int day = scanner.nextInt();
        
    
        switch (day)  {
            case 1:
                 System.out.println("sanday");
                 
                break;
            case 2 : 
                System.out.println("monday");
                break;
                
            case 3:
                System.out.println("tuesday");
                break;
            case 4: 
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6: 
                System.out.println("friday");
                break;
            case 7: 
                System.out.println("saturday");
                break;
                
               
            default:
                System.out.println("day not found"); 
                
        
        
        }
    }
}
