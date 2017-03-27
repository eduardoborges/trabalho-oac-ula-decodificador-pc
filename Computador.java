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

}