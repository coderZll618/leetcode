import java.util.ArrayList;
import java.util.List;

public class leetcode17 {
    List<String> res = new ArrayList<>();
    String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits == "" || digits.length()==0){
            return res;
        }
        dfs(new StringBuffer(), digits, 0);
        return res;
    }

    public void dfs(StringBuffer sb, String digits, int index){
        if(sb.length() == digits.length()){
            res.add(sb.toString());
            return;
        }
        char num = digits.charAt(index);
        for(int i=0;i<mapping[num-'0'].length();i++){
            sb.append(mapping[num-'0'].charAt(i));
            dfs(sb, digits, index+1);
            sb.deleteCharAt(index);
        }
    }
}
