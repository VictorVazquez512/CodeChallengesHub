class MyQueue {

    private final Stack<Integer> s1;
    private final Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if (this.s2.isEmpty()) {
            while (!this.s1.isEmpty()) {
                s2.push(this.s1.pop());
            }
        }
        return s2.pop();
    }
    
    public int peek() {
        if (this.s2.isEmpty()) {
            while (!this.s1.isEmpty()) {
                s2.push(this.s1.pop());
            }
        }
        return s2.peek();
    }
    
    public boolean empty() {
        return Math.max(s1.size(), s2.size()) == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */