package queue;


import stack.StackFromArrayList;

public class QueueWithStacks {
    private StackFromArrayList<Integer> stack1;
    private StackFromArrayList<Integer> stack2;

    public QueueWithStacks() {
        stack1 = new StackFromArrayList<>();
        stack2 = new StackFromArrayList<>();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public void enqueue(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public Integer dequeue() {
        return stack1.pop();
    }
}
