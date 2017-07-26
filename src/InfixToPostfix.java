import java.util.Stack;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
/*
 * 
 * A utility function to return precedence of a given operator 
 * Higher returned value means higher precedence
 * 
 */
public class InfixToPostfix {

	/**
	 * @param args
	 */
	static int operatorPre(char ch){
	
		switch(ch){
		case '+' : 
		case '-' : return 1;
		case '*' : 
		case '/' : return 2;
		case '^' : return 3;
		}
		return -1;
	}	
	/*
	 * The main method that converts given infix expression to post fix expression.
	 * 
	 */
	public static String infixToPostFix(String exp){
		
		String result = new String("");
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i < exp.length(); ++i){
			char ch = exp.charAt(i);
			
			if(Character.isLetterOrDigit(ch))
				result += ch;
			else if(ch == '(')
					stack.push(ch);
			else if(ch == ')'){
				while(!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();
				if(!stack.isEmpty() && stack.peek() != '(')
					return "Invalid Expression";
				else{
					while(!stack.isEmpty() && operatorPre(ch) <= operatorPre(stack.peek()))
						result += stack.pop();
					stack.push(ch);
				}
			}
		}
		while(!stack.isEmpty())
			result += stack.pop();
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(infixToPostFix(exp));
	}

}
