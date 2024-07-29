package Day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        //Map to store already traversed elements
        Map<Integer, Integer> map = new HashMap<>();

        //Traverse each element in array find complement
        //If Complement is present, return the array, else store the
        //element with its index in map
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(map.containsKey(comp) && map.get(comp)!= i){
               return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }

        return  new int[2];
    }



    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);

        for(int a : ans){
            System.out.println(a);
        }
    }
}
