class Solution {
    public static int getLucky(String s, int k) {
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            rev.append((int) s.charAt(i) - 96);
        }
        String number = rev.toString();
        int result = digitplussum(number, k);
        return result;
    }

    public static int digitplussum(String n, int k) {
        int sum = 0;

        // Repeat the process k times
        while (k > 0) {
            sum = 0;  // Reset sum for each iteration
            for (int i = 0; i < n.length(); i++) {
                sum += n.charAt(i) - '0';  // Sum the numeric value of each character
            }
            n = String.valueOf(sum);  // Update n to the new sum for the next iteration
            k--;
        }

        return sum;
    }
}