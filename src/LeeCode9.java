public class LeeCode9 {
    public static void main(String[] args) {
        LeeCode9 leeCode1 = new LeeCode9();
       boolean re = leeCode1.isPalindrome(-21212);
        System.out.println(re);
    }
    public boolean isPalindrome(int x) {
        int re = 0;
        int a =x;
        while(a >0){
            int b = a%10;
            a= a/10;
            re = re*10+b;
        }
        return x == re?true:false;
    }
}
