import java.util.Stack;

public class MinStack {

	int min = Integer.MAX_VALUE;
	Stack<Integer> origStack = new Stack<>();
	Stack<Integer> minimumStack = new Stack<>();
	
	public MinStack() {
    }
    
    public void push(int x) {
    	origStack.push(x);
    	if(minimumStack.isEmpty()) {
    		minimumStack.push(x);
    	}else {
    		minimumStack.push(Math.min(minimumStack.peek(), x));
    	}
    }
    
    public void pop() {
        origStack.pop();
        minimumStack.pop();
    }
    
    public int top() {
        return origStack.peek();
    }
    
    public int getMin() {
    	return minimumStack.peek();
    }
    
    public static void main(String[] args) {
    	MinStack obj = new MinStack();
    	 obj.push(2147483646);
    	 obj.push(2147483646);
    	 obj.push(2147483647);
    	 System.out.println("1." + obj.top());
    	 obj.pop();
    	 System.out.println("2." + obj.getMin());
    	 obj.pop();
    	 System.out.println("3." + obj.getMin());
    	 obj.pop();
    	 obj.push(2147483647);
    	 System.out.println("4." + obj.top());
    	 System.out.println("5." + obj.getMin());
    	 obj.push(-2147483648);
    	 System.out.println("6." + obj.top());
    	 System.out.println("7."+ obj.getMin());
    	 obj.pop();
    	 System.out.println("8." + obj.getMin());
	}
}
