import java.util.Scanner;
public class multiplication
 {
    public static void main(String[] args)
{
    int a, b, c, d, e;
    System.out.println("Enter the numbers: ");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    e = a*b*c*d;
    System.out.println("Multiplication of given numbers: " +e);

}
    
}
