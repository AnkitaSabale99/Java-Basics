import java.util.Scanner;
import java.util.Arrays;
public class Sortedarray
 {
    public static void main(String[] args)
    {
        int a[] = new int[6];
        System.out.print("Enter array elemnets: ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i< 6; i++)
        {
            a[i] = sc.nextInt();
            

        }
        Arrays.sort(a);
        {
            System.out.println("Sorted array elements:\n");
            for(int b : a)
            {
                System.out.println(b+" ");
            }
        }
    }
}
