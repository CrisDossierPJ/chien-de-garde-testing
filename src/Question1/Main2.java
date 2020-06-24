package Question1;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackInterface stack = new Stack();
		BrokenStackQuest2 stackBroken = new BrokenStackQuest2();
		// working test
		stack.push(8);
		stack.pop();
		// Failing Test
		
		stackBroken.push(5);
		stackBroken.pop();
		
		
	}

}
