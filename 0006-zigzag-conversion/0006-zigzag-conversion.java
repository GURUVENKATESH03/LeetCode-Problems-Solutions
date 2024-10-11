class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 0 || s.isEmpty() || numRows == 1 || numRows >= s.length()) {
            return s; // No zigzag needed or invalid input
        }
        int cycleLength = 2 * numRows - 2; // Full cycle length
        int noOfCols = (s.length() / cycleLength) * (numRows - 1) + Math.min(s.length() % cycleLength, numRows) + (s.length() / cycleLength);
        
        //int noOfCols = s.length()/numRows + s.length() % numRows  + 1;
        char[][] result = new char[numRows][noOfCols];
        int row  = 0 ,col = 0 ;
        boolean diagonal = false;
        for (char c : s.toCharArray()) {
            // Place the character in the current row and column
            result[row][col] = c;

            // If we're going down
            if (!diagonal) {
                if (row + 1 < numRows) {
                    row++;
                } else {
                    // If we hit the bottom, switch to going up
                    diagonal = true;
                    row--;
                    col++;
                }
            } else { // We are going up
                if (row - 1 >= 0) {
                    row--;
                    col++;
                } else {
                    // If we hit the top, switch to going down
                    diagonal = false;
                    row++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < numRows ;i++){
            for(int j = 0 ; j < noOfCols ;j++){
                if(result[i][j] != '\u0000') sb.append(result[i][j]);
            }
        }
        return sb.toString();
    }
}