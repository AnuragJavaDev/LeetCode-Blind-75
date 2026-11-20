import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[]= {1,2,3,1};
         //Output: true
         System.out.println(isDuplicate(nums));
    }
    public static boolean isDuplicate(int arr[])
    {
        HashSet<Integer> hs= new HashSet<>();
        for(int a:arr)
        {
            hs.add(a);
        }
        return hs.size()<arr.length;
    }
}
