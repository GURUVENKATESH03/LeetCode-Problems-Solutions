class Solution {
    public void rotate(int[][] matrix) {
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
        
        for(int i =0 ;i < matrix[0].length ;i++){
            for(int row : matrix[i]) System.out.print(row+" ");
            System.out.println();
        }
        
    }
}