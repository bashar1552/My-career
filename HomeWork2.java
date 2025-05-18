package zuj.std.cp;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your choice");
        
        System.out.println("______________________");
        System.out.println("square"); 
        System.out.println("circle");
        System.out.println("rectangle");
        System.out.println("triangle");
        System.out.println("oval");
        System.out.println(":");
       String choice = s.nextLine();

        switch (choice) {
            case "square":

                System.out.println("Enter a length of sids: ");
                double lengthSquare = s.nextDouble();
                
                System.out.println("the Answer "+(lengthSquare*lengthSquare));
                break;
            case "rectangle":
                System.out.println("enter a length");
                double Lengthrectangle  = s.nextDouble();
                System.out.println("enter a width:");
                double  widthRectangle =s.nextDouble();
                System.out.println("the answer :"+(Lengthrectangle*widthRectangle));
                break;
            case "circle":
                System.out.println("enter a radius");
                double redius = s.nextDouble();
                double PI = 3.14;
                double area =redius*PI*redius;
                System.out.println("answer="+area);
                break;
            case "triangle":
                System.out.println("enter a base");
                double base = s.nextDouble();
                System.out.println("enter a height");
                double height =s.nextDouble();
                System.out.println("answer ="+(1/2*base*height));
                
                break;
            case "oval":
                System.out.println("enter  semi-major axis");
                double a =s.nextDouble();
                System.out.println("enter semi-minor axis");
                double b = s.nextDouble();
               
                System.out.println("answer is"+( 3.14*  a*b));
                break;
               default:
                   System.out.println("error");
        }
    }

}
