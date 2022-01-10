import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> ss = new Stack<>();
		ss.push("Dog");
		ss.push("Cat");
		ss.push("Horse");
		
		System.out.println(ss.pop());
		System.out.println(ss);
		
		
		

	}

}

// .push(value)
// .peek()
// .pop()
