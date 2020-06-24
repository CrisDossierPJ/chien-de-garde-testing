package Question1;

public aspect Aspect2 {
	// POP
	int listSizeBefPop = 0;

	pointcut pop_minus(StackInterface stack) :
			call(* StackInterface.pop()) && target(stack) && within(Main2);

	before(StackInterface stack): pop_minus(stack) {
		listSizeBefPop = stack.size();
	}

	after(StackInterface stack)  : pop_minus(stack) {

		if (stack.size() != listSizeBefPop - 1) {

			System.err.println("Erreur de la propriete 2 POP");
		}

	}

	// PUSH
	int listSizeBefPush = 0;

	pointcut push_plus(StackInterface stack) :
			call(* StackInterface.push(..)) && target(stack);

	before(StackInterface stack): push_plus(stack) {
		listSizeBefPush = stack.size();
	}

	after(StackInterface stack) : push_plus(stack) {

		if (stack.size() != listSizeBefPush + 1) {
			System.err.println("Erreur de la propriete 2 PUSH");
		}

	}
}
