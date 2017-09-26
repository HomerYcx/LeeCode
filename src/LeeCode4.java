import java.util.ArrayList;
import java.util.Collections;

public class LeeCode4 {
    public static  void main(String[] args){
        int[] a = {1,2};
        int[] b = {3,4};
        LeeCode4 leeCode1 = new LeeCode4();
        double re=leeCode1.findMedianSortedArrays(a,b);
        System.out.println(re);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i:nums1) {
            arrayList.add(i);
        }
        for (int l:nums2){
            arrayList.add(l);
        }
        Collections.sort(arrayList);
        int max = nums1.length + nums2.length;
        int mid =0;
        boolean midbolean =false;
        if(max%2 == 0){
            midbolean =true;
            mid = (max-1)/2;
        }else{
            mid = max/2;
        }
        if(midbolean){
            return  (arrayList.get(mid)+arrayList.get(mid+1))*1.0/2;
        }else{
            return arrayList.get(mid);
        }
    }
}
