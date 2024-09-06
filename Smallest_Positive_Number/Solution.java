import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {61,-26,-10,2,1,23,32};
        Arrays.sort(nums);
        int min = 1;
        int prev = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || (i > 0 && nums[i] == nums[i - 1])) {
                continue;
            }
            if (nums[i] > min) {
                break;
            }
            if (nums[i] == min) {
                min++;
            }
        }

        System.out.println(min);
    }
}
