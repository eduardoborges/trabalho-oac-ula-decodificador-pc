class Main {
	public static void main(String[] args) {
		
		int[] memoria = new int[]{
			0b00100000000000000000101000000011, // 1 - 10 - 3
			0b01000000000000000000001100001010, // 2 - 3 - 10
			0b01100000000000000000010100001111  // 3 - 5 - 15
		};

		Computador maquina  = new Computador(memoria);
		maquina.run();

	}
}