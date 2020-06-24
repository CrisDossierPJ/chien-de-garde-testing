package Question1;

import java.util.Collections;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrokenStackQuest3 stack = new BrokenStackQuest3();
		int sizeTest = 9;

		for (int i = 0; i < sizeTest; i++) {
			stack.push(i);
		}

		for (int i = 0; i < sizeTest; i++) {
			stack.pop();
		}

	}

}
