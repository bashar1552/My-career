package zuj.std.cp;

import java.util.Scanner;

public class password_cheke_long_small {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter your password:");

        String password = s.nextLine();

       if (password.length() ==12 ) 
           
       {System.out.println("pass is good");}
       if (password.length() > 12 ){
        
            System.out.println("pass is long");}else {System.out.println("pass is short");}
         
           
           
           
           
    }

}
