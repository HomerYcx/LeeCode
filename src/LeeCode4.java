import java.util.ArrayList;
import java.util.Collections;

public class LeeCode4 {
    public static void main(String[] args) {
        int[] a = {2};
        int[] b = {1, 3};
        LeeCode4 leeCode1 = new LeeCode4();
        double re = leeCode1.findMedianSortedArrays2(a, b);
        System.out.println(re);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : nums1) {
            arrayList.add(i);
        }
        for (int l : nums2) {
            arrayList.add(l);
        }
        Collections.sort(arrayList);
        int max = nums1.length + nums2.length;
        int mid = 0;
        boolean midbolean = false;
        if (max % 2 == 0) {
            midbolean = true;
            mid = (max - 1) / 2;
        } else {
            mid = max / 2;
        }
        if (midbolean) {
            return (arrayList.get(mid) + arrayList.get(mid + 1)) * 1.0 / 2;
        } else {
            return arrayList.get(mid);
        }
    }


    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int max = nums1.length + nums2.length;
        int mid = 0;
        int choose = 0;
        int chooseBoolean = 0;
        boolean midbolean = false;
        if (max % 2 == 0) {
            midbolean = true;
            mid = (max - 1) / 2;
        } else {
            mid = max / 2;
        }
        if (midbolean) {
            mid = mid + 1;
        }
        for (int n = 0; n <= mid; ++n) {
            if (midbolean && n == mid) {
                chooseBoolean = choose;
            }
            if (i >= nums1.length) {
                choose = nums2[j];
                ++j;
            } else if (j >= nums2.length) {
                choose = nums1[i];
                ++i;
            } else if (nums1[i] > nums2[j]) {
                if (j < nums2.length) {
                    choose = nums2[j];
                    ++j;
                } else {
                    choose = nums1[i];
                    ++i;
                }
            } else {
                if (i < nums1.length) {
                    choose = nums1[i];
                    ++i;
                } else {
                    choose = nums2[j];
                    ++j;
                }
            }
        }
        if (midbolean) {
            return (choose + chooseBoolean) * 1.0 / 2;
        } else {
            return choose;
        }
    }
}
