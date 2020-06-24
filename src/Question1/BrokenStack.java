package Question1;

public class BrokenStack implements StackInterface{
	private int size = 8;

	@Override
	public void push(Object t) {
		// TODO Auto-generated method stub
		size +=2;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
