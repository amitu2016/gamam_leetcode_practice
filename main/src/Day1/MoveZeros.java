package Day1;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                swap(nums, l, r);
                l++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i : nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
