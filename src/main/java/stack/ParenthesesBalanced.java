package stack;

public class ParenthesesBalanced {
    /**
     * Stack: Parentheses Balanced ( ** Interview Question)
     * Check to see if a string of parentheses is balanced or not.
     * By "balanced," we mean that for every open parenthesis, there is a matching closing parenthesis in the
     * correct order. For example, the string "((()))" has three pairs of balanced parentheses,
     * so it is a balanced string. On the other hand, the string "(()))" has an imbalance,
     * as the last two parentheses do not match, so it is not balanced.
     * Also, the string ")(" is not balanced because the close parenthesis needs to follow the open parenthesis.
     */

    public static boolean isBalanced(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }

        StackFromArrayList<Character> stack = new StackFromArrayList<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            stack.push(c);
        }
        for (int i = 0; i<s.length()/2; i++) {
            if (charArray[i] == (char) stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
