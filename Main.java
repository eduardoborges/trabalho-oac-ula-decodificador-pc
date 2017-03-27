class Main {
	public static void main(String[] args) {
		int[] memoria = new int[]{
			0b10100111,
			0b10100001,
			0b10100001
		};

		Computador computador  = new Computador(memoria);

		int bin 		= 0b01000000000000000000000000100001;
		int operator 	= Decodificador.getOperator(bin);
		int number 		= Decodificador.getNumber(bin);

		System.out.println(operator);
		System.out.println(number);
	}
}