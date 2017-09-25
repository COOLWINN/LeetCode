import java.util.Stack;

/**
 * Problem 020. Valid Parentheses
 * --Description:
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.The brackets must close in the correct order,
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Problem020 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(s.charAt(i));
            }else{
                if (stack.empty()) {
                    return false;
                }
                if (c == ')' && stack.peek() == '('
                            || c == '}' && stack.peek() == '{'
                            || c == ']' && stack.peek() == '[') {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Problem020 test = new Problem020();
        String s = "()[]{}";
        System.out.println(test.isValid(s));
    }
}
