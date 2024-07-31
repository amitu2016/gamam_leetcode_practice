package Day2;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbersOptimized2 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        boolean[] isAvailable = new  boolean[nums.length];

        for (int i = 0; i < isAvailable.length; i++) {
            isAvailable[nums[i] - 1] = true;
        }

        for (int i = 0; i < isAvailable.length; i++) {
            if (!isAvailable[i]){
                ans.add(i+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }
}
