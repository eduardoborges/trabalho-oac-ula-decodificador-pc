 class Decodificador {
	// 										      ---|--------------|------|--------
	private final static int operatorMask 		= 0b01100000000000000000000000000000;
	private final static int firstNumberMask 	= 0b00000000000000001111111100000000;
	private final static int lastNumberMask 	= 0b00000000000000000000000011111111;

	public static int getOperator(int number){
		return (number & operatorMask) >> 29;
	}

	public static int getFirstNumber(int number){
		return (number & firstNumberMask) >> 8;
	}

	public static int getLastNumber(int number){
		return (number & lastNumberMask);
	}
}