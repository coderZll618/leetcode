

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class leetcode347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[][] helper = new int[map.size()][2];
        int index = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            // helper[index][0]接收数
            // helper[index][1]接收数出现的次数
            helper[index][0] = entry.getKey();
            helper[index][1] = entry.getValue();
            index++;
        }
        // 重写排序方法，根据数出现的次数进行排序
        Arrays.sort(helper,
                new Comparator<int[]>(){
                    @Override
                    public int compare(int[] o1, int[] o2){
                        return o1[1]-o2[1];
                    }
                });
        // 开一个数组，接收前K个高频元素
        int[] res = new int[k];
        int indexRes = 0;
        for(int i = helper.length-1;i>=helper.length-k;i--){
            res[indexRes] = helper[i][0];
            indexRes++;
        }
        return res;
    }
}
