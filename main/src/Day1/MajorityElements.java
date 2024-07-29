package Day1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxValue = 0;
        for (int i = 0; i < nums.length; i++) {
            int freq = 0;
            if (map.containsKey(nums[i])){
               freq = map.get(nums[i]);
               map.put(nums[i], ++freq);
            }else{
                map.put(nums[i], 1);
            }
        }

        System.out.println(map);

        int maxValueInMap = (Collections.max(map.values()));
        for (Map.Entry<Integer, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() == maxValueInMap) {

                // Print the key with max value
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
