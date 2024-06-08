import java.util.Scanner;

public class sumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("Invalid input");
            return;
        }
        int sum = 0;
        sum = (n*(n+1)/2);
        System.out.println(sum);
        sc.close();

    }
}
