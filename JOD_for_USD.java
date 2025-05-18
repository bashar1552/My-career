
import java.util.Scanner;

public class JOD_for_USD {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("please Enter price in JOD:");
        double JOD = s.nextDouble();
        
        double USD = JOD * 1.44;
        
System.out.println("price in USD = "+USD);         
        
        
    }
    
}
