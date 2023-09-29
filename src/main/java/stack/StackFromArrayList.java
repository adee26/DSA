package stack;

import java.util.ArrayList;

public class StackFromArrayList<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T value) {
        stack.add(value);
    }

    public T peek() {
        if(!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public int size() {
        return stack.size();
    }

    public T pop() {
        if(stack.isEmpty()) {
            return null;
        }
        T element = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return element;
    }

    public ArrayList<T> getStack() {
        return stack;
    }


}
