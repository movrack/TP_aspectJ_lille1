
aspect AHelloWorld {

	
	pointcut traceMethode(): 
		call( * helloWorldAspected..*print(String) ) 	// Appel de la méthode print
		|| execution( * pgm..*print(String) );			// Execution de la méthode print

	Object around(): traceMethode() {
		
		String divider = "----------------";
		System.out.println("pointcut kind : \t" + thisJoinPoint.getKind());
		System.out.println("Source : \t\t" + thisJoinPoint.getSourceLocation());
		System.out.println("Cible : \t\t" + thisJoinPoint.getTarget());
		System.out.println("Nom de méthode : \t" + thisJoinPoint.getSignature().getName());
		System.out.println("Paramètres : \t\t" + thisJoinPoint.getArgs());

		System.out.println("Execution : \n"+divider);
			Object ret = proceed();
		System.out.println(divider+"\nEnd execution\n");
		return ret;
	}

}
