import java.util.Scanner;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter array size??");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed array: ");
        for(int i=n-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
