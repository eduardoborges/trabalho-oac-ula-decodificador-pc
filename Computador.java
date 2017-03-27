class Computador {
	
	public int[] MEMORIA = new int[]{};

	Computador(int[] memoria){
		this.MEMORIA = memoria;
	}

	public int calc(int operation, int a, int b){
		switch (operation) {
			case "1":
				return soma();
				break;
			case "2":
				return sub();
				break;
			case "3":
				return div();
				break;
			default:
				break;
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