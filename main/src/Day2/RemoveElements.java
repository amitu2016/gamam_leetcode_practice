package Day2;

public class RemoveElements {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int ans = removeElement(nums,2);
        System.out.println(ans);
        for (int i : nums){
            System.out.print(i+" ");
        }
    }

}
