import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("How many subjects: ");
        n = sc.nextInt();
        int marks[] = new int[n];
        System.out.print("Enter marks: ");
        for(int i=0; i<n; i++)
        {
            marks[i] = sc.nextInt();
        }
        System.out.print("Your marks are: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(marks[i]+ " ");
        }
        int tot = 0;
        for(int i=0; i<n;i++)
        {
            tot += marks[i];
        }
        System.err.println();
        System.out.println("Total marks is "+tot);
        float p = (float)tot/n;
        System.out.println("Percentage is "+ p);
        sc.close();

        
    }
}
