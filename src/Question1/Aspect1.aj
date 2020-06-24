package Question1;

public aspect Aspect1 {
	
	pointcut top_pop_empty(StackInterface stack) : 
		(call(* StackInterface.pop()) || call(* StackInterface.top())) && target(stack)&& within(Main1);
	
	before(StackInterface stack): top_pop_empty(stack){
		if(stack.isEmpty()) {
			System.err.println("Erreur de la propriété 1");
		}
	}
}
