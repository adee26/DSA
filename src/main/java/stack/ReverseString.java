package stack;

public class ReverseString {

    public static String reverseString(String s) {
        if(s.length() < 1){
            return s;
        }

        String newString = "";
        StackFromArrayList<Character> stack = new StackFromArrayList<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            newString = newString + stack.pop();
        }

        return newString;
    }
}
