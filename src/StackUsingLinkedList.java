import java.util.Stack;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class StackUsingLinkedList {

	/**
	 * @param args
	 */
	/*
	 * 
	 * Implement stack operations on using Linked list
	 * 
	 * 
	 */
	static class Node{
		int data;
		Node next,prev;
		public Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}	
		public void displayNode(){
			System.out.println(data);
			System.out.println(" ");
		}
	}
	static Node head;
	static StackUsingLinkedList stack;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stack = new StackUsingLinkedList();
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.displayStack();
		System.out.println(isEmpty());
	}
	private static void insertFirst(int data){
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	private static Node deleteFirst(){
		Node temp = head;
		head  = head.next;
		return temp;
	}
	private void displayList(){
		Node current = head;
		while(current != null){
			System.out.println(current.data);
			current.displayNode();
			current = current.next;
		}
		
	}
	private static boolean isEmpty(){
		if(head == null)
			return true;
		return false;
	}
	private static int isPeek(){
		
		return 0;
	}
	private static void pop(){
		while(!stack.isEmpty()){
			stack.deleteFirst();
		}
	}
	private void displayStack(){
		System.out.println(" ");
		stack.displayList();
	}
	private static void push(int data){
		if(isEmpty()){
			head = new Node(data);
		}
	}
}
