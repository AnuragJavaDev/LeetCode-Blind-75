import java.util.Arrays;

public class PrifixSum {
    public static void main(String[] args) {
           int arr[] = {2, 4, 1, 3};
           int prifix[]=new int[arr.length];
           prifix[0]=arr[0];
           for(int i=1;i<arr.length;i++)
           {
            prifix[i]=prifix[i-1]+arr[i];
           }
           System.out.println(Arrays.toString(prifix));
    }
}
