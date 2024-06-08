import java.util.Scanner;

public class SmallestEle {
    public static int smaller(int arr[])
    {
        int min = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(min>arr[i])
            min = arr[i];
        }
        return min;
    }
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
        System.out.println("Min is" + smaller(arr));

        sc.close();
    }
}
