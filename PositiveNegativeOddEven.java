import java.util.Scanner;

public class PositiveNegativeOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int N = sc.nextInt();
        if(N>0)
        {
            System.out.print("Positive ");
            if(N%2 == 0)
            {
                System.out.print("Even\n");
            }
            else{
                System.out.print("Odd\n");
            }
        }
        else if(N<0)
        {
            System.out.print("Negative ");
            if(N%2 == 0)
            {
                System.err.print("Even\n");
            }
            else{
                System.out.print("Odd\n");
            }
        }
        else{
            System.out.println("Zero");
        }
        sc.close();
    }
}
