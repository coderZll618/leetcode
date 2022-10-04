package package01;


public class leetcode239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1) return nums;
        int len = nums.length;
        int[] maxNums = new int[len-k+1];
        int lNode = 0;
        int rNode = k-1;
        int maxNode = 0;
        int temp = nums[0];
        while(rNode < len){
            System.out.println("maxNode:"+maxNode+" max:"+temp+" lNode:"+lNode);
            //上一次的最大值在窗口外，更新maxNode与temp
            if(maxNode < lNode || lNode == 0){
                temp = nums[lNode];
                for(int i=lNode;i<=rNode;i++){
                    if(temp <= nums[i]){
                        temp = nums[i];
                        maxNode = i;
                    }
                }
                maxNums[lNode] = temp;
                rNode++;
                lNode++;
                continue;
            }
            //最大值在窗口内，新加入窗口的值大于等于temp
            if(nums[rNode] >= temp){
                maxNode = rNode;
                temp = nums[rNode];
            }
            maxNums[lNode] = temp;
            lNode++;
            rNode++;
        }
        return maxNums;
    }
}
