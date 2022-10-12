
public class leetcode2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] ans = answerKey.toCharArray();
        return Math.max(get(ans,'T',k),get(ans,'F',k));
    }
    public int get(char[] ans,char aim,int k){
        int count = 0,l = 0, r = 0;
        while( r < ans.length ){
            if(ans[r++] != aim) count++;
            if(count > k){
                if(ans[l++] != aim) count--;
            }
        }
        return r - l;

    }
}