class MinStack {
    ArrayList<Integer> stck;
    ArrayList<Integer> minStck;
    int min = -1;
    int top = -1;
    public MinStack() {
        stck = new ArrayList<>();
        minStck = new ArrayList<>();
        minStck.add(Integer.MAX_VALUE);
        min++;
    }
    
    public void push(int val) {
        stck.add(val);
        top++;
        if(stck.get(top) <= minStck.get(min)){
            minStck.add(stck.get(top));
            min++;
        }
    }
    
    public void pop() {
        if(minStck.get(min) == stck.get(top)){
            minStck.remove(min);
            min--;
        }
        stck.remove(top);
        top--;
        
    }
    
    public int top() {
        return stck.get(top);
    }
    
    public int getMin() {
        return minStck.get(min);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
