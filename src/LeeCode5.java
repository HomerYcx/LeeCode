import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class LeeCode5 {
    public static void main(String[] args) {
       String a = "abbbb";        LeeCode5 leeCode1 = new LeeCode5();
        String re = leeCode1.longestPalindrome(a);
        System.out.println(re);
    }


    public String longestPalindrome(String s) {
        int begin = 0;
        int end = 0;
        for(int i =0;i<s.length() && (end - begin)<s.length()-i;++i){
            for(int j =0;j<s.length()-i && (end - begin)<s.length()-j-i;++j){
                boolean is = true;
                for(int m=0;m<s.length()-1-j-i-m;++m){
                    if(s.charAt(m+i)!=s.charAt(s.length()-1-j-m)){
                        is = false;
                        break;
                    }
                }
                if(is && end - begin < s.length()-j-i){
                    begin = i;
                    end = s.length() -j;
                }
            }
        }
       return  s.substring(begin,end);
    }

    public static String findLongestPalindrome1(String s){
        int len = s.length();
        int start = 0;
        int maxlength = 0;
        boolean p[][] = new boolean[s.length()][s.length()];
        // 子串长度为1和为2的初始化
        for(int i = 0; i < len; i++){
            p[i][i] = true;
            if(i < len - 1 && s.charAt(i) == s.charAt(i + 1)){
                p[i][i + 1] = true;
                start = i;
                maxlength = 2;
            }
        }
        // 使用上述结果可以dp出子串长度为3~len -1的子串
        for(int strlen = 3; strlen < len; strlen ++){
            for(int i = 0; i <=len - strlen; i++){
                int j = i + strlen - 1; // 子串结束的位置
                if(p[i + 1][j - 1] && s.charAt(i) == s.charAt(j)){
                    p[i][j] = true;
                    maxlength = strlen;
                    start = i;
                }
            }
        }
        if(maxlength > 0)
            return s.substring(start, start + maxlength);
        return null;
    }
}
