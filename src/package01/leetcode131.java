import java.util.ArrayList;
import java.util.List;

public class leetcode131 {
    List<List<String>> res = new ArrayList<>();
    List<String> temp = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backTrack(s, 0);
        return res;
    }
    public void backTrack(String s, int start){
        if(start == s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start+1;i<=s.length();i++){
            if(isHuiwen(s.substring(start,i)) != 1){
                continue;
            }
            temp.add(s.substring(start,i));
            backTrack(s,i);
            temp.remove(temp.size()-1);
        }

    }
    public int isHuiwen(String s) {
        int len = s.length();
        if(len == 1) return 1;
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return 0;
            }
        }
        return 1;
    }
}
