import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int ptr1 = 0; ptr1 < nums.length - 2; ptr1++) {
            // Avoid duplicates for ptr1
            if (ptr1 == 0 || (ptr1 > 0 && nums[ptr1] != nums[ptr1 - 1])) {
                int ptr2 = ptr1 + 1;
                int ptr3 = nums.length - 1;

                while (ptr2 < ptr3) {
                    int sum = nums[ptr1] + nums[ptr2] + nums[ptr3];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[ptr1], nums[ptr2], nums[ptr3]));
                        // Move ptr2 forward and ptr3 backward to find other solutions
                        ptr2++;
                        ptr3--;
                        // Avoid duplicates for ptr2 and ptr3
                        while (ptr2 < ptr3 && nums[ptr2] == nums[ptr2 - 1])
                            ptr2++;
                        while (ptr2 < ptr3 && nums[ptr3] == nums[ptr3 + 1])
                            ptr3--;
                    } else if (sum < 0) {
                        ptr2++;
                    } else {
                        ptr3--;
                    }
                }
            }
        }
        return result;
    }
}
