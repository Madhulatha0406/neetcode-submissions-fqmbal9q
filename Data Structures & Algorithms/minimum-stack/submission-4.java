class MinStack {

    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {

        if (stack.isEmpty()) {
            stack.push((long) val);
            min = val;
        }
        else if (val >= min) {
            stack.push((long) val);
        }
        else {
            // Store encoded value
            stack.push(2L * val - min);
            min = val;
        }
    }

    public void pop() {

        if (stack.isEmpty())
            return;

        long top = stack.pop();

        // Encoded value
        if (top < min) {
            min = 2 * min - top;
        }
    }

    public int top() {

        long top = stack.peek();

        // Encoded value means actual top is current minimum
        if (top < min)
            return (int) min;

        return (int) top;
    }

    public int getMin() {
        return (int) min;
    }
}