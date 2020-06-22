package Question1;

public aspect Aspect1 {
	
	pointcut top_pop_empty(StackInterface stack) : 
		(call(* StackInterface.pop()) || call(* StackInterface.top())) && target(stack);
	
	before(StackInterface stack): top_pop_empty(stack){
		if(stack.isEmpty()) {
			System.out.println("Erreur de la propriété 1");
		}
	}
}
