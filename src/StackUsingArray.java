/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class StackUsingArray {

	/**
	 * @param args
	 */
	
	/*
	 * 
	 * Implementing stack using array.
	 * 
	 * 
	 */
	
	// Initializing the maximum space alloted for that array
	static final int MAX = 1000;
	
	// Initialize the array
	int[] array = new int[MAX];
	
	// initialize top variable to return top element
	static int top=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop()+"Popped element"+stack.pop()+stack.pop()+stack.push(20)+stack.isEmpty());
	}
	
	// Check whether the top element is < 0 if so return true
	static boolean isEmpty(){
		return (top < 0);
	}
	
	StackUsingArray(){
		top = -1;
	}
	
	// check if the stack is empty or not otherwise push on top of the peek element other wise return overflow
	
	boolean push(int x){
		if(top >= MAX){
			System.out.println("Stack Overflow");
			return false;
		}else{
			array[++top] = x;
			return true;
		}
		
	}
	
	// check if the stack is empty or not if it is return underflow otherwise pop out the top most element
	
	int pop(){
		if(top < 0){
			System.out.println("Stack UnderFlow:");
			return 0;
		}else{
			int x = array[top--];
			return x;
		}
	}

}
