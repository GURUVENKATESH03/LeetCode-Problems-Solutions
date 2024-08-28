class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean state = false;
        if(checkSimilar(mat,target)){ state = true;}
        else{
        for(int i = 0; i< mat.length +1 ;i++){
            rotate(mat);
            if(checkSimilar(mat,target)){ state = true; break;}
        }}
        return state;
    }
    static boolean checkSimilar(int nums[][] , int target[][]){
        for(int i = 0 ; i < nums[0].length ; i++){
            for(int j = 0 ; j < nums[0].length ;j++){
                if(nums[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
    static void rotate(int[][] matrix) {
            for(int i = 0 ; i < matrix[0].length ;i++){
                for(int j = i; j < matrix[0].length ;j++ ){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            for(int i = 0 ;i < matrix[0].length ;i++){
                int start = 0 ;
                int end = matrix[0].length - 1;
                while(start < end){
                    int temp = matrix[i][start];
                    matrix[i][start] = matrix[i][end];
                    matrix[i][end] = temp;
                    start++;
                    end--;
                }
            }

        }
}