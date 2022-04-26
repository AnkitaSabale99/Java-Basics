import java.util.Scanner;


public class one_dimensional_array

{
    public static void main(String args[])
    {
        int a[] = new int[8];
        
        System.out.print("\nEnter array elements");

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 8; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("\n Enter array elements: ");
        for( int b: a)
        {
            System.out.println(b+ " ");
        }
    }
}
