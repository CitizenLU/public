package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        char[] ns = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<Character, Character>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};

        for (char item : ns) {
            if (map.containsKey(item)) {
                stack.add(item);
            } else if (!stack.empty() && item == map.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
