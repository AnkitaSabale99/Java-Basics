import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class evenodd
{
    public static void main(String[] args)
    {

    
 int number , remainder;
 System.out.println("Enter no: ");
 Scanner sc = new Scanner(System.in);
 number = sc.nextInt();
 sc.close();

 remainder = number % 2;

 if(remainder == 0)
 
     System.out.println(number+ "Number is even ");
     else
     
         System.out.println(number+ "Number is odd ");
    
    }
}