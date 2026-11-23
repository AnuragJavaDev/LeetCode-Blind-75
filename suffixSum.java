import java.util.Arrays;

public class suffixSum {
    public static void main(String[] args) {
          int arr[] = {2, 4, 1, 3};
        int suffix[] = new int[arr.length];
        suffix[suffix.length-1]=arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--)
        {
            suffix[i]=suffix[i+1]+arr[i];
        }
        System.out.println(Arrays.toString(suffix));
    }
}
