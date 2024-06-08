import java.util.Scanner;

public class arr1 {
    public static void main(String args[])
    {
        // int marks[]={50,55,75,88};
        // for(int i=0; i<4; i++)
        // {
        //     System.out.println(marks[i]);
        // }
        /*int marks[];
        marks = new int[5];
        marks[0]=50;
        marks[1]=60;
        marks[2]=70;
        marks[3]=80;
        for(int i=0; i<5; i++)
        {
            System.out.println(marks[i]);
        }*/


        //input from keyboard
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++)
        {
            marks[i] = sc.nextInt();
        }
        System.out.print("Array is ");
        for(int i=0; i<n; i++)
        {
            System.out.print(marks[i]+" ");
        }
        sc.close();

    }
    
}
