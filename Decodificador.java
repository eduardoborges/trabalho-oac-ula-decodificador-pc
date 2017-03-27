 class Decodificador {

	private final static int operatorMask 		= 0b11000000000000000000000000000000;
	private final static int firstNumberMask 	= 0b00000000000000000000000011111111;
	private final static int lastNumberMask 	= 0b00000000000000001111111100000000;

	public static int getOperator(int number){
		return (number & operatorMask) >> 30;
	}

	public static int getFirstNumber(int number){
		return (number & firstNumberMask);
	}

	public static int getLastNumber(int number){
		return (number & lastNumberMask) >> 8;
	}
}