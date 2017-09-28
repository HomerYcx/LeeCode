import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class LeeCode6 {
    public static void main(String[] args) {
       String a = "1234567890";
        LeeCode6 leeCode1 = new LeeCode6();
        String re = leeCode1.convert(a,2);
        System.out.println(re);
    }


    public String convert(String s, int numRows) {
        if(numRows==1){
            return  s;
        }

        String re ="";
        int length = s.length();
        int sum = 0;
        int num = length / ( 2*numRows-2);
        int so = length %( 2*numRows-2);
        if(so > 0){
            if(so > numRows){
                so = so-numRows;
                sum+= so;
            }
            sum++;
        }
        sum = sum+num*(numRows-1);
        Character[][] a = new Character[numRows][sum];
        int flag =0;
        int in = 0;
        int col =0;
        for (int i =0;i<s.length();++i){
            if(i >0 && i%( 2*numRows-2)==0){
                flag =0;
                --in;
                col++;
            }
            if(flag <numRows) {
                a[in][col] = s.charAt(i);
                if(numRows != 2 || in < numRows -1) {
                    ++in;
                }
                ++flag;
            }else{
                ++col;
                if(flag == numRows){
                    --in;
                }
                --in;
                a[in][col] =  s.charAt(i);
                ++flag;
            }
        }

        for (int i =0;i<numRows;++i) {
            for (int j =0;j<sum;++j) {
                if(a[i][j] !=null){
                    re += a[i][j];
                }
            }
        }
        return re;
    }
}
