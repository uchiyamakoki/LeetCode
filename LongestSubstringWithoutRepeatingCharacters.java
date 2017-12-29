package LeetCode;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s="pwwkew";
        int r=lengthOfLongestSubstring(s);
        System.out.println(r);
    }

    //别忘了static 还有子字符串和子序列
   public static int lengthOfLongestSubstring(String s){
    /*
    判断非空
     */
       if(s==null){
           return 0;
       }
    /*
    判断1和0的特殊情况
     */
        if(s.length()==0||s.length()==1){
            return s.length();
        }

        /*
        正式篇
         */
        char[] c=s.toCharArray();
        //barrier：0~i中，第一个不重复字符的位置
       int barrier=0;
       int maxLen=1;

       for(int i=1;i<c.length;i++){
            for (int j=i-1;j>=barrier;j--){
                if(c[i]==c[j]){
                    // 第一个不重复字符的位置为j+1，因为每次j从i-1递减到barrier
                    barrier=j+1;
                    break;
                }
            }
            maxLen=Math.max(maxLen,i-barrier+1);
       }
       return maxLen;
   }

}
