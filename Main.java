class Main {
	public static void main(String[] args) {
		int[] memoria = new int[]{
			0b01000000000000000000101000000011, // 1 - 10 - 3
			0b10000000000000000000001100001010, // 2 - 3 - 10
			0b11000000000000000000010100001111  // 3 - 4 - 15
		};

		// Computador computador  = new Computador(memoria);

		for (int code:memoria) {

			int operator 		= Decodificador.getOperator(code);
			int firstNumber 	= Decodificador.getFirstNumber(code);
			int lastNumber 		= Decodificador.getLastNumber(code);

			System.out.println(operator + " " + firstNumber + " " + lastNumber);
		}


		
	}
}