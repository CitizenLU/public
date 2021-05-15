package org.example.leetcode;

import java.util.Map;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) {
//            return "";
//        }
//        if (strs.length == 1) {
//            return strs[0];
//        }
//        char[][] chars = new char[strs.length][];
//        int len = 200;
//        for (int i = 0; i < strs.length; i++) {
//            if (strs[i].length() < len) {
//                len = strs[i].length();
//            }
//            chars[i] = strs[i].toCharArray();
//        }
//
//        String result = "";
//        int i = 0;
//        for (; i < len; i++) {
//            char c = chars[0][i];
//            for (int j = 1; j < chars.length; j++) {
//                if (chars[j][i] == c) {
//                    continue;
//                } else {
//                    result = String.valueOf(chars[0]).substring(0, i);
//                    return result;
//                }
//            }
//        }
//        result = String.valueOf(chars[0]).substring(0, i);
//        return result;
        if (strs == null || strs.length == 0) {
            return "";
        }
        String match = strs[0];
        for (String target : strs) {
            if (match.length() == 0) {
                return "";
            }
            match = longestCommonPrefix(match, target);
        }
        return match;
    }

    public String longestCommonPrefix(String match, String target) {
        if (match.length() == 0 || target.length() == 0) {
            return "";
        }
        int len = Math.min(match.length(), target.length());
        int i = 0;
        while (i < len && match.charAt(i) == target.charAt(i)) {
            i++;
        }
        return match.substring(0, i);
    }
}
