class Computador {
	
	public int[] MEMORIA = new int[]{};

	Computador(int[] memoria){
		this.MEMORIA = memoria;
	}

	public int calc(int operation, int a, int b){
		switch (operation) {
			case 1:
				return soma(a,b);
			case 2:
				return sub(a,b);
			case 3:
				return div(a,b);
			default:
				return 0;
		}
	}

	public int soma(int a, int b){
		return a + b;
	}

	public int sub(int a, int b){
		return a - b;
	}

	public int div(int a, int b){
		return a / b;
	}

	public void jump(){
		// nao sei o que esta poha faz
	}

	public void run(){
		for (int code:this.MEMORIA) {
			int operator 		= Decodificador.getOperator(code);
			int firstNumber 	= Decodificador.getFirstNumber(code);
			int lastNumber 		= Decodificador.getLastNumber(code);
			int result 			= calc(operator, firstNumber, lastNumber);
			System.out.println("OPERAÇÃO: " + operator + " | RESULTADO: "+ result +" | OPERANDOS: "+ firstNumber +" e "+ lastNumber);
			System.out.println();
		}
	}

}