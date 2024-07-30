package Day1;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;

        for (int i=0; i< n; i++){
            int val = nums[i];
            nums[i] = val * val;
        }

        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] ans = sortedSquares(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
