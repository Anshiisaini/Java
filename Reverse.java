import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size??");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int s = 0;
        int e = n-1;
        while(s<e)
        {
            int temp;
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        System.out.println("Reversed array is ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
