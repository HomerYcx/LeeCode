public class LeeCode13 {
    public static void main(String[] args) {
        LeeCode13 leeCode1 = new LeeCode13();
        int re = leeCode1.romanToInt("MCMXCVI");
        System.out.println(re);
    }
    public int romanToInt(String s) {
        char[] num = s.toCharArray();
        int sum = letterToNumber(num[0]);
        for(int i=0; i<num.length-1; i++){
            int before = letterToNumber(num[i]);
            int after = letterToNumber(num[i+1]);
            if(before >= after){
                sum += after;
            }
            else{
                sum = sum + after - 2*before;
            }
        }
        return sum;
    }
    private int letterToNumber(char letter)
    {
        switch (letter)
        {
            case 'I':  return 1;
            case 'V':  return 5;
            case 'X':  return 10;
            case 'L':  return 50;
            case 'C':  return 100;
            case 'D':  return 500;
            case 'M':  return 1000;
            default:   return -1;
        }
    }
}
