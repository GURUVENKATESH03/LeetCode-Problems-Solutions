class Solution {
    public String reverseVowels(String s) {
        
         String str1 = s;
        char[] charArray = str1.toCharArray();
        int start = 0;
        int end = str1.length()-1;

        while (end > start) {
            if (isVowel(charArray[start]) && isVowel(charArray[end])) {
                // Swap vowels
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            } else if (!isVowel(charArray[start])) {
                start++;
            } else if (!isVowel(charArray[end])) {
                end--;
            }
        }

        // Convert charArray back to string
        String result = new String(charArray);
        return result;
    }
    public static boolean isVowel(char letter) {
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        return hs.contains(letter);
    }
}