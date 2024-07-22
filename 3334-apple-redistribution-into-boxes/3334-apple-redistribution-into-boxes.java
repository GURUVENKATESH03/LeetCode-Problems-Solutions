class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = Arrays.stream(apple).sum();
        int count = 1;

        for(int i = capacity.length-1 ;i >=0 ; i--){
            sum -= capacity[i];
            if(sum > 0){
                count++;
            }else{
                break;
            }
        }

        return count;
    }
}