public class LargestEle {
    public static int largestEle(int arr[])
    {
        int max = arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]>max)
            max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,5,3};
        System.out.println(largestEle(arr));
        
    }
    
}
