package Day2;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbersOptimized {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        //Looping through the array and marking
        //the numbers which are already present as negative
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -1 * Math.abs(nums[index]);
        }

        //The numbers which are not presents on the array at their index
        //will be the only positive elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                //Adding the missing numbers in the arraylist
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
