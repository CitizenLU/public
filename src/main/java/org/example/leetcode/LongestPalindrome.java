package org.example.leetcode;

public class LongestPalindrome {
    // 暴力破解
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int beginIndex = 0;
        // s.charAt(i) 每次都会检查数组下标越界，因此要先转换成字符数组
        char[] charArray = s.toCharArray();
        // 枚举所有长度严格大于1的字串 charArray[i...j]
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && validPalindromic(charArray, i, j)) {
                    maxLen = j - i + 1;
                    beginIndex = i;
                }
            }
        }
        return s.substring(beginIndex, beginIndex + maxLen);
    }

    /**
     * 验证字串 s[left...right]是否为回文串
     *
     * @param s
     * @return
     */
    private boolean validPalindromic(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 中心扩散
    public String longestPalindrome1(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int beginIndex = 0;
        // s.charAt(i) 每次都会检查数组下标越界，因此要先转换成字符数组
        char[] charArray = s.toCharArray();
        // 枚举所有长度严格大于1的字串 charArray[i...j]
        for (int i = 0; i < len - 1; i++) {
            int oddLen = expandAroundCenter(charArray, i, i);
            int evenLen = expandAroundCenter(charArray, i, i + 1);

            int curMaxLen = Math.max(oddLen, evenLen);
            if (curMaxLen > maxLen) {
                maxLen = curMaxLen;
                beginIndex = i - (maxLen - 1) / 2;
            }
        }
        return s.substring(beginIndex, beginIndex + maxLen);
    }

    private int expandAroundCenter(char[] charArray, int left, int right) {
        // left=right时，回文串长度奇数
        // right=left+1时，回文串长度偶数
        int len = charArray.length;
        int i = left;
        int j = right;
        while (i >= 0 && j < len) {
            if (charArray[i] == charArray[j]) {
                i--;
                j++;
            } else {
                break;
            }
        }
        // 跳出while循环时，恰好满足 s.charAt(i)!=s.charAt(j)，回文串长度是j-i+1-2=j-i-1
        return j - i - 1;
    }

    // 动态规划
    public String longestPalindrome2(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int beginIndex = 0;
        // dp[i][j] 表示s[i...j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        char[] charArray = s.toCharArray();
        // 左下角先填
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    dp[i][j] = j - i < 3 ? true : dp[i + 1][j - 1];
                }
                // 只要 dp[i][j]==true成立，那么s[i...j]是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    beginIndex = i;
                }
            }
        }
        return s.substring(beginIndex, beginIndex + maxLen);
    }

    // Manacher算法，专门用于查找最长回文字串，本题时间复杂度O(n)
    public String longestPalindrome3(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int beginIndex = 0;
        // dp[i][j] 表示s[i...j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        char[] charArray = s.toCharArray();
        // 左下角先填
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    dp[i][j] = j - i < 3 ? true : dp[i + 1][j - 1];
                }
                // 只要 dp[i][j]==true成立，那么s[i...j]是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    beginIndex = i;
                }
            }
        }
        return s.substring(beginIndex, beginIndex + maxLen);
    }

    public String longestPalindrome11(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int l = 0; l < n; l++) {
            for (int i = 0; i < n - l; i++) {
                int j = i + l;
                if (l == 0) {
                    dp[i][j] = true;
                } else if (l == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && l > ans.length() - 1) {
                    ans = s.substring(i, i + l + 1);
                }
            }
        }
        return ans;
    }
}
