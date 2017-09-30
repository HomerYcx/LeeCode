public class LeeCode8 {
    public static void main(String[] args) {
        LeeCode8 leeCode1 = new LeeCode8();
       int re = leeCode1.myAtoi("+-2");
        System.out.println(re);
    }
    public int myAtoi(String str) {
        int end =0;
        boolean hasNo = false;
        str = str.trim();
        boolean hasT =true;
        for (int i=0;i<str.length();++i){
            if(str.charAt(i)>'9'||str.charAt(i)<'0'){
                if(hasT && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                    hasT =false;
                    continue;
                }
                else{
                    end = i;
                    break;
                }
            }else {
                hasNo =true;
            }
        }
        if(!hasNo)
            return 0;
        if(end>0)
        str= str.substring(0,end);
        if (str.length() ==0){
            return 0;
        }
        try {
            int re = Integer.parseInt(str);
            return re;
        }catch (NumberFormatException ex){
            if(str.charAt(0) != '-')
            return 2147483647;
            else
            return  -2147483648;
        }
    }

    public int myAtoi2(String str) {
        boolean isT =true;
        int begin = -1;
        int end = -1;
        str = str.trim();
        for (int i=0;i<str.length();++i) {
            if (begin == -1 && str.charAt(i) < '9' && str.charAt(i) > '0') {
                begin = i;
            }
            else if (begin !=-1 && (str.charAt(i) > '9' || str.charAt(i) < '0')) {
                end = i;
            }
        }
        if(begin ==-1){
            return 0;
        }
        String s;
        if(end != -1) {
            s = str.substring(begin, end);
        }else{
            s = str.substring(begin);
        }
        if(begin >0 && str.charAt(begin-1) == '-'){
            isT = false;
        }
        try {
            int re = Integer.parseInt(s);
            if(!isT) {
                re =-re;
            }
            return re;
        }catch (NumberFormatException ex){
            return 0;
        }
    }
}
