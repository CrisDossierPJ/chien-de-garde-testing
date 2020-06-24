package Question1;

public aspect Aspect3 {
	java.util.Stack<Object> fiableStack = new java.util.Stack<Object>();

	// POP
	pointcut pop():
		call(* StackInterface.pop());

	after() returning(Object object): pop(){
		Object obj = fiableStack.pop();
		if (object != obj) {
			System.err.println("Erreur de la propriété 3");
		}
	}

	// PUSH
	pointcut call_push(Object object) :
			call(void StackInterface.push(Object)) && args(object);

	after(Object object) returning() : call_push(object) {
		fiableStack.push(object);
	}
}
