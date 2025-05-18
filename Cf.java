package zuj.std.cp;

import java.util.Scanner;

public class Cf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("enter c : ");
        double celsius = scanner.nextDouble();

       
        double fahrenheit = (celsius * 9/5) + 32;

       
        System.out.println("f=: " + fahrenheit);
        
      scanner.close();
       
        System.out.println("goodbay");
        
        
       
               
      }
                
        
    }

