package package01;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] in = {7,2,4};
        int k = 2;
        int[] res = leetcode239.maxSlidingWindow(in, k);
        System.out.println(Arrays.toString(res));
    }
}
