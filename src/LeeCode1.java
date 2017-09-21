import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LeeCode1 {
    public static  void main(String[] args){
        int[] a = {2,7,11,15};
        LeeCode1 leeCode1 = new LeeCode1();
        int[] re=leeCode1.twoSum(a,9);
        for (int r:re) {
            System.out.println(r);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result =new int[2];
        for (int i=0;i<nums.length;++i) {
            for (int j=i+1;j<nums.length;++j) {
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return  result;
    }

    public int[] twoSumMap(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length;++i){
            map.put(nums[i],i);
        }

        for (int i=0;i<nums.length;++i) {
            int n = target - nums[i];
            if(map.containsKey(n) && map.get(n)>i){
                return new int[]{i,map.get(n)};
            }
        }
        throw new IllegalArgumentException("no such");
    }

    public int[] twoSumHashTable(int[] nums, int target) {
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for (int i = 0; i < nums.length;++i){
            table.put(nums[i],i);
        }

        for (int i=0;i<nums.length;++i) {
            int n = target - nums[i];
            if(table.containsKey(n) && table.get(n)>i){
                return new int[]{i,table.get(n)};
            }
        }
        throw new IllegalArgumentException("no such");
    }
}
