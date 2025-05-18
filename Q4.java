
package zuj.std.cp;

import java.util.Scanner;

public class Q4 { 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("plese enter height:");
        double  height =s.nextDouble();
        System.out.print("plese enter width");
        double width = s.nextDouble();
        double area = width * height;
        
        
            
        System.out.println("area="+area);
        
       if (area > 50 && area <200 ){
           
           System.out.println("the area is too small");
               }
        
        
    }
      
          
    
    
}
