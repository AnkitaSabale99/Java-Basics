
import java.util.Scanner;

 class elseif_condition 
 {
    public static void main()
    {

        int marks;
        System.out.println("Enter marks: ");
        Scanner e = new Scanner(System.in);
        marks = e.nextInt();

        if(marks>=60 && marks <=100)
        {
            System.out.println("First Class");

        }
        else if(marks>40 && marks<=60)
        {
            System.out.println("Second Class");
        }
        else
        {
            System.out.println("Fail");
        }
        }
    }
}
