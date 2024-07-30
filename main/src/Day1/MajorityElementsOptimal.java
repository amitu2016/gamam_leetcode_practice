package Day1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementsOptimal {

    //Using Boyer-Moore Majority Voting Algorithm
    //to find the majority element in array
    public static int majorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                candidate = nums[i];
                count = 1;
            } else {
                if (nums[i] == candidate)
                    count++;
                else
                    count--;
            }
        }


        //Checking if the candidate comes more than n/2 times
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate)
                count++;
        }

        if (count > ((nums.length)/2))
            return candidate;
        else
            return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
