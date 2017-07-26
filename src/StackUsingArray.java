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
	
	static final int MAX = 1000;
	int[] array = new int[MAX];
	static int top=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop()+"Popped element"+stack.pop()+stack.pop()+stack.push(20)+stack.isEmpty());
	}
	static boolean isEmpty(){
		return (top < 0);
	}
	StackUsingArray(){
		top = -1;
	}
	boolean push(int x){
		if(top >= MAX){
			System.out.println("Stack Overflow");
			return false;
		}else{
			array[++top] = x;
			return true;
		}
		
	}
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
