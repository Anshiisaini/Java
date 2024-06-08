import java.util.Scanner;

public class CheckVowel {
    public static void main(String [] args)
    {
        char arr[] = new char[256];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<265; i++)
        {
            arr[i] = sc.next().toCharArray();
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 'a' || arr[i] == 'e'|| arr[i] == 'i'|| arr[i] == 'o'|| arr[i] == 'u'|| arr[i] == 'A'|| arr[i] == 'E'|| arr[i] == 'I'|| arr[i] == 'O' || arr[i] == 'U')
            {
                System.out.println("Yes");
            }
            System.out.print("No");
        }
    }
}
