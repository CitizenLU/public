package leetcode;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String in = String.valueOf(x);
        int len = in.length();
        for (int i = 0; i < (len + 1) / 2; i++) {
            if (in.charAt(i) == in.charAt(len - i - 1)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalind(int x) {
        if (x < 0 || x % 10 == 0 & x != 0) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        if (x == rev || x == rev / 10) {
            return true;
        } else {
            return false;
        }
    }
}
