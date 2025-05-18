
package zuj.std.cp;

import java.util.Scanner;

 

public class Q5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
                System.out.println("enter radius:");
                

        double radius = s.nextDouble();
                
        double area = radius*radius*3.14;
        
        System.out.println("area = "+area);
    }
   
         
}
