package Question1;

public class BrokenStackQuest3 implements StackInterface {
	private int size = 8;
	private int top;
	private Object[] stack;
	private int stackSize;

	public BrokenStackQuest3() {
		stackSize = 1000;
		stack = new Object[stackSize];
		top = 0;
	}

	@Override
	public void push(Object t) {

		// TODO Auto-generated method stub
		if (top == stackSize) {
			Object[] newStack = new Object[2 * stackSize];
			for (int i = 0; i < stackSize; i++) {
				newStack[i] = stack[i];
			}
			stack = newStack;
			top = stackSize - 1;
			stackSize = 2 * stackSize;
		}

		stack[top] = t;
		top++;
	}

	@Override
	//First In Last Out
	public Object pop() {
		if (top > 0) {
			top--;
			return stack[0];
		} else {
			return null;
		}
	}

	@Override
	public Object top() {
		if (top > 0) {
			return stack[top - 1];
		} else {
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top;
	}

}
