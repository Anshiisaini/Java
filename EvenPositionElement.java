import java.util.Scanner;

public class EvenPositionElement {
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
        for(int i=0; i<n; i++)
        {
            if(i%2 == 0)
            {
                System.out.print(arr[i]);
            }
        }
        sc.close();
    }
}
