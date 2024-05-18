class Solution {
    public int reverse(int x) {
        int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;
            int newReversed = reversed * 10 + digit;
            
            // Check for integer overflow
            if ((newReversed - digit) / 10 != reversed) {
                return 0;
            }
            
            reversed = newReversed;
            x /= 10;
        }
        
        return reversed;
    }
}
