class MinStack {
    Stack <Integer> normal;
    Stack <Integer> min;
    public MinStack() {
        normal = new Stack<>();
        min = new Stack<>();
    }
    public void push(int value) {
        normal.push(value);
        if(min.isEmpty() || min.peek()>=value){
            min.push(value);
        }
    }
    public void pop() {
        int temp = normal.pop();
        if(temp==min.peek()){
            min.pop();
        }
    }
    public int top() {
        return normal.peek();
    } 
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */