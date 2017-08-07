import java.util.Stack;
public class StackSort{
	
	public static Stack sortStack(Stack <Integer> s){
			Stack <Integer> tempstack = new Stack<>();
			
			while(!s.isEmpty()){
				int currentData = s.pop();
				while(!tempstack.isEmpty() && tempstack.peek() > currentData){
					s.push(tempstack.pop());
					
				}
				tempstack.push(currentData);
				
			}
			return tempstack;
	}
	public static void main(String args[]){
		Stack <Integer> stack = new Stack<>();
		stack.push(40);
		stack.push(15);
		stack.push(45);
		
		
		
		System.out.println(sortStack(stack));
		
	
	
	}
}
