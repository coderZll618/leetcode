

class leetcode376 {
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if(len < 2) return len;
        int direction = 0;
        int sum = 2;
        for(int i=0;i<len-1;i++){
            if(nums[i] < nums[i+1]){
                direction = 1;
                break;
            }
            if(nums[i] > nums[i+1]){
                direction = -1;
                break;
            }
        }
        for(int i=1;i<len;i++){
            if(nums[i-1] == nums[i]) continue;
            if(nums[i-1] < nums[i] && direction == -1){
                sum++;
                direction = 1;
            }
            else if(nums[i-1] > nums[i] && direction == 1){
                sum++;
                direction = -1;
            }
        }
        return sum;
    }
}