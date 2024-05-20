class Solution {
    public int[] sortedSquares(int[] nums) {
        int size=nums.length;
        for(int i=0;i<size;i++){
            nums[i] = nums[i] * nums[i];
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}