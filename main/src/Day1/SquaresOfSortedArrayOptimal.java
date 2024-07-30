package Day1;

public class SquaresOfSortedArrayOptimal {
    public static int[] sortedSquares(int[] nums) {
        //Using 2 pointers algorithm to optimize the solution
        int i = 0;
        int j = nums.length - 1;
        int[] ans = new int[nums.length];
        int index = nums.length - 1;

        //calculating the squared values of elements at both ends placing in
        //ans array in descending order
        while (i <= j){
            int iValue = nums[i] * nums[i];
            int jValue = nums[j] * nums[j];
            if (iValue < jValue){
                ans[index] = jValue;
                j--;
            }else {
                ans[index] = iValue;
                i++;
            }
            index--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] ans = sortedSquares(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
