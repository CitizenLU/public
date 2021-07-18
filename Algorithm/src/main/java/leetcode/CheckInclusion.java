package leetcode;

public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) {
            return false;
        }
        int[] cnt = new int[26];
        for (int i = 0; i < len1; ++i) {
            cnt[s1.charAt(i) - 'a']--;
            cnt[s2.charAt(i) - 'a']++;
        }
        int diff = 0;
        for (int c : cnt) {
            if (c != 0) {
                diff++;
            }
        }
        if (diff == 0) {
            return true;
        }
        for (int i = len1; i < len2; ++i) {
            int x = s2.charAt(i) - 'a';
            int y = s2.charAt(i - len1) - 'a';
            if (x == y) {
                continue;
            }
            if (cnt[x] == 0) {
                diff++;
            }
            cnt[x]++;
            if (cnt[x] == 0) {
                diff--;
            }
            if (cnt[y] == 0) {
                diff++;
            }
            cnt[y]--;
            if (cnt[y] == 0) {
                diff--;
            }
            if (diff == 0) {
                return true;
            }
        }
        return false;
    }

}
