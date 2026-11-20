import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(test(nums,target)));
//Output: [0,1]
    }
    public static int[] test(int arr[],int k)
    {
     for(int i=0;i<arr.length-1;i++)
     {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]+arr[j]==k)
            {
                return new int[]{i,j};
            }
        }
     }
        return null;
    }
}
