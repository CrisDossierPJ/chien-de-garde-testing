package Question1;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackInterface stack = new Stack();
		if (stack.isEmpty()) {
			System.out.println("On met en place l'erreur avec une liste vide :");
			stack.pop();
			stack.top();
		} else {
			System.err.println("ERREUR --- La liste n'est pas vide");
		}
		stack.push(5);
		if (stack.isEmpty()) {
			System.err.println("ERREUR --- La liste est vide");

		} else {

			System.out.println("Essaie de la classe sans erreur ");
			stack.top();
			if (stack.isEmpty()) {
				System.err.println("ERREUR --- La liste est vide");
			} else {
				stack.pop();
			}

		}

	}

}
