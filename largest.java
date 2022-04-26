import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class largest
{
    public static void main(String[] args)
    {
  int n1, n2, n3, largestt;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number: ");
  n1 = sc.nextInt();
  System.out.println("Enter the second number: ");
  n2 = sc.nextInt();
  System.out.println("Enter the third number: ");
  n3 = sc.nextInt();



  if(n1 > n2 && n1 > n3)
  largestt = n1;
  else if(n2 > n1 && n2 > n3)
  largestt = n2;
  else
  largestt = n3;

  System.out.printf("Largestt among %d %d %d is %d", n1,n2,n3, largestt);
    }
}
