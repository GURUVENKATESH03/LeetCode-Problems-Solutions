class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int size = nums.length;
        int left = 0;
        int right = size - 1;

        while (left < right) {
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }
            
            while (left < right && nums[right] % 2 != 0) {
                right--;
            }

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }
}
