class Solution {
    public int singleNumber(int[] nums) {
        Solution1 sol=new Solution1();
        HashMap<Integer, Integer> hs = new HashMap<>();
        int min_Value = 999999;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int count = sol.same_num(temp, nums);
            hs.put(temp, count);
            if (count < min_Value) {
                min_Value = count;
            }
        }

        int key=getKeyByValue(hs, min_Value);
        return key;
    }

    // Method to get key from value in HashMap
    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
class Solution1 {
    public int same_num(int temp, int[] array) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (temp == array[j]) {
                count++;
            }
        }
        return count;
    }
}