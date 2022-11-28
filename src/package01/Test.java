import java.util.List;

public class Test {
    public static void main(String[] args) {
        leetcode53 l = new leetcode53();
        int[] a = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sum = l.maxSubArray(a);
        System.out.println(sum);
    }
}
