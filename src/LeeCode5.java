import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class LeeCode5 {
    public static void main(String[] args) {
        String a = "cwziydanrqvsdtvnnqgjnbrvvwxwqojeqgxhwxdoktjktulemwpbeqscbbtbfvkxsrjetfdrovcrdwzfmnnihtgxybuairswfewvpuscocqifuwylhssldpjrawqdrbvkykpaggspbfrulcktpbofchzikhzxhpocgvdbwpewpywsgqbczmamprklaoovcfecwchhmsaqkhvuvvzjblmgvqpqtnlipgqsanvovylpmxlmxvymppdykphhaamtxjnnlsqfwjwhyywgurteaummwhvavxbcpgrfffxrowluqmqjaugryxdmwvyokdcfcvcytxpixbvwrdgzctejdoaavgtezexmvxgrkpnayvfarkyoruofqmpnsqdzojxqrjsnfwsbzjmaoigytygukqlrcqaxazvmytgfghdczvzphfdbnxtklaiqqsotavdmhiaermluafheowcobjqmrkmlzyas";
        LeeCode5 leeCode1 = new LeeCode5();
        String re = leeCode1.longestPalindrome(a);
        System.out.println(re);
    }


    public String longestPalindrome(String s) {
        String re = "";
        for(int i =0;i<s.length();++i){
            for(int j =0;j<s.length()-i;++j){
                String ss = s.substring(i,s.length()-j);
                if(isMax(ss,re.length())){
                    re = ss;
                }
            }
        }
       return  re;
    }

    private boolean isMax(String s,int max){
        for(int i=0;i<s.length()/2;++i){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return  false;
            }
        }
        if(s.length() >max)
            return  true;
        else
            return  false;
    };
}
