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

/*

Only passes 187 testCases.

class Solution {
    public int getLucky(String s, int k) {
        return printTheSum(s,k);
    }
    static int printTheSum(String str,int k){
        int n = str.length();
        
        int sum = 0;
        for(int i = 0  ;i < n ;i++){
            if(str.charAt(i)!=' '){
                sum+=(int)( str.charAt(i)  - 'a' +1);
            }
        }
        System.out.println(sum);
        if(k > 1){
            for(int i = 0 ;i < k ;i++){
                int temp   = sum;
                int prev = 0;
                int newSum =0;
                while(temp!=0){
                    int dig = temp%10;
                    newSum += dig + prev;
                    temp/=10;
                }
                sum = newSum;
            }
        }
        return sum;
    }
}*/
