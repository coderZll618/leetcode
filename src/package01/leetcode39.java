import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class leetcode39 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length == 0) return res;
        Arrays.sort(candidates);
        int min = candidates[0];
//        for(int i=1;i<=target/min+1;i++){
//            backTrack(candidates,target,0,i,0,0);
//            temp.clear();
//        }
        backTrack2(candidates,target,0,0);
        return res;
    }
    public void backTrack(int[] candidates, int target, int curlen, int len, int sum, int index){
        if(curlen>len || sum >target) {
            return;
        }
        if(sum == target && curlen == len){
            ArrayList<Integer> list = (ArrayList<Integer>) new ArrayList<>(temp).clone();
            list.sort(Comparator.naturalOrder());
            if(!res.contains(list))
                res.add(list);
        }
        else{
            for(int j=index;j<candidates.length;j++){
                temp.add(candidates[j]);
                backTrack(candidates,target,curlen+1,len,sum+candidates[j],j);
                temp.remove(temp.size()-1);
            }
        }
    }
    public void backTrack2(int[] candidates, int target, int sum, int index){
        if(sum >target) {
            return;
        }
        if(sum == target){
            ArrayList<Integer> list = (ArrayList<Integer>) new ArrayList<>(temp).clone();
            list.sort(Comparator.naturalOrder());
            if(!res.contains(list))
                res.add(list);
        }
        else{
            for(int j=index;j<candidates.length;j++){
                temp.add(candidates[j]);
                backTrack2(candidates,target,sum+candidates[j],j);
                temp.remove(temp.size()-1);
            }
        }
    }
}