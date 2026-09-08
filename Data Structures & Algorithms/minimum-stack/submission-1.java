class MinStack {
    Stack<Integer> stack ;
    Stack<Integer> minValue;

    public MinStack() {
        this.stack = new Stack<>();
        this.minValue = new Stack<>();
    }
    
    public void push(int val) {
        if(minValue.isEmpty()){
           minValue.push(val);
           stack.push(val); 
        }else{
        minValue.push(Math.min(minValue.peek(), val));
        stack.push(val);
        }
    }
    
    public void pop() {
        stack.pop();
        minValue.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minValue.peek();
    }
}
