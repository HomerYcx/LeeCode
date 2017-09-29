public class LeeCode7 {
    public static void main(String[] args) {
        LeeCode7 leeCode1 = new LeeCode7();
       int re = leeCode1.reverse(1534236469);
        System.out.println(re);
    }


    public int reverse(int x) {
        boolean isT = true;
        if(x<0){
            isT = false;
            x = -x;
        }
        String xs = String.valueOf(x);
        String re = new String();
        for (int i =0;i<xs.length();++i){
            if(re.length()==0&&xs.charAt(xs.length()-1-i)=='0') {
                continue;
            }else{
                re+=(xs.charAt(xs.length() - 1 - i));
            }
        }
        if(re.length()>0) {
            try {
                return isT ? Integer.parseInt(re.toString().trim()) : -1 * Integer.parseInt(re.toString());
            }catch (NumberFormatException ex){
                return 0;
            }
        }
        else {
            return 0;
        }
    }
}
