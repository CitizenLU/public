package nowcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int calculator(final String input) {
        // 用String记录
        List<String> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        for (int i = 0; i < input.length(); i++) {
            // 本轮要遍历的字符
            char chr = input.charAt(i);
            if (isNum(chr)) {
                // 起始下标
                int start = i;
                // 如果i是最后一个字符，则自增1，以便于截取数字
                if (i == input.length() - 1) {
                    i++;
                } else {
                    // 获取完整的数字，例如'10'应当被认为是数字10而不是数字1和0
                    while (isNum(input.charAt(++i))) {

                    }
                }
                // 将数字塞进list
                list.add(input.substring(start, i));
                // 截取后将i退回
                i--;
            } else if (map.containsValue(chr)) {
                stack.push(chr);
            } else if (map.containsKey(chr)) {
                //  一直出栈直到遇到左括号
                while (map.get(chr).equals(stack.peek())) {
                    list.add(String.valueOf(stack.pop()));
                }
                // 左括号出栈扔掉
                stack.pop();
            } else if (chr == '-') {
                while (!greaterThan(chr, stack)) {
                    list.add(String.valueOf(stack.pop()));
                }
                stack.push(chr);
            } else if (chr == '+') {
                while (!greaterThan(chr, stack)) {
                    list.add(String.valueOf(stack.pop()));
                }
                stack.push(chr);
            } else if (chr == '*' || chr == '/') {
                while (!greaterThan(chr, stack)) {
                    list.add(String.valueOf(stack.pop()));
                }
                stack.push(chr);
            }
        }
        System.out.println(list);
        while (!stack.isEmpty()) {
            list.add(String.valueOf(stack.pop()));
        }
        return calculate(list);
    }

    public static int calculate(List<String> list) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            int n1;
            int n2;
            switch (s) {
                case "*":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n1 * n2);
                    break;
                case "/":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n2 / n1);
                    break;
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n2 - n1);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public static boolean isNum(char chr) {
        return chr >= '0' && chr <= '9';
    }

    // 比较运算符与栈顶运算符的优先级。优先级相同，返回false
    public static boolean greaterThan(char chr, Stack<Character> stack) {
        if (stack.isEmpty()) {
            return true;
        } else {
            char cstack = stack.peek();
            if (chr == '*' || chr == '/') {
                return !(cstack == '*' || cstack == '/');
            } else {
                return cstack == '(' || cstack == '{' || cstack == '[';
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int actual = solution.calculator("3-10*(10+3)-10");
    }
}
