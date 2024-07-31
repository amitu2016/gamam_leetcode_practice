package Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> set = new HashSet<>();

        //Creating a set of integers from 1 to n
        for (int i = 1; i <= nums.length; i++) {
            set.add(i);
        }

        //Iterating through the array. If array element is present in set, removing it from set
        for (int num : nums) {
            set.remove(num);
        }

        //Copying the Set in ArrayList and returning it
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }
}
