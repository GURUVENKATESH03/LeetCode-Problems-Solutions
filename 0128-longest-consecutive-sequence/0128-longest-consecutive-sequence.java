class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;
        for (int num : nums) {
            if (!numSet.contains(num - 1)) { // Start of a sequence
                int current = 1;
                while (numSet.contains(num + current)) {
                    current++;
                }
                longest = Math.max(longest, current);
            }
        }

        return longest;
    }
}
