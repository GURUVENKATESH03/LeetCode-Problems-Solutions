import java.util.*;

class Solution {
    static int number;
    static Integer[] storage;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Stairs: ");
        number = sc.nextInt();

        storage = new Integer[number + 1];

        withOutMemo wom = new withOutMemo();
        wom.start();

        withMemo wm = new withMemo();
        wm.start();

    }
}

class withOutMemo extends Thread {
    public void run() {
        int result = numberOfStairs(Solution.number);
        System.out.println("Without Memo Tech --> " + result);
    }

    static int numberOfStairs(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return numberOfStairs(number - 1) + numberOfStairs(number - 2);
    }
}

class withMemo extends Thread {
    public void run() {
        int result = memoTech(Solution.number);
        System.out.println("With Memo Tech -- > " + result);
    }

    static int memoTech(int number) {
        
        if (Solution.storage[0] == null) {
            Solution.storage[0] = 1;
        }
        if (Solution.storage[1] == null) {
            Solution.storage[1] = 1;
        }
        for (int i = 2; i <= number; i++) {
            if (Solution.storage[i] == null) {
                Solution.storage[i] = Solution.storage[i - 1] + Solution.storage[i - 2];
            }
        }
        return Solution.storage[number];
    }
}
