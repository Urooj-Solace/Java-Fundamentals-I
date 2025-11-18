import java.util.*;
public class Lab2Task3{
     public static void main(String[] args){
     Scanner console = new Scanner(System.in);

     int length;
     int width;
     int area;
     int perimeter;

     System.out.println("Enter the length: ");
     length = console.nextInt();

     System.out.println("Enter the width: ");
     width = console.nextInt();
     perimeter = 2 * (length + width);
     

     System.out.println();
     area = length * width;
     System.out.println("Area = " + area);
     System.out.println("Perimeter = " + perimeter);
     
   
     }
}
