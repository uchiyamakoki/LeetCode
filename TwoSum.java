package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
       //GitHub测试
        int[] arr={3,2,4};
        int[] r=twoSum(arr,6);
        for (int i=0;i<r.length;i++){
            System.out.println(r[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        if (nums==null||nums.length<2){
            return new int[2];
        }
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            map.put(target-nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            Integer v=map.get(nums[i]);
            if (v!=null&&v!=i){
                return new int[] {i,v};
            }
        }
        return null;
    }


}
