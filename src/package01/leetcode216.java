import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class leetcode216 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        traceback(k,n,new ArrayList<Integer>(),0);
        return ans;
    }
    public void traceback(int k, int n, List<Integer> list, int sum) {
        if(list.size() == k && sum == n) ans.add(new ArrayList<>(list));
        if(list.size() > k) return;
        int index = list.size() == 0 ? 0 : list.get(list.size()-1);
        int end = Math.min((n-sum),9);
        for(int i = index+1; i<=end; i++){
            list.add(i);
            traceback(k,n,list,sum+i);
            list.remove(list.size()-1);
        }
    }
}
