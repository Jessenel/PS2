package base;

public class MyInteger {

	private int iValue;

	public MyInteger() {
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		return true;
	}

	public boolean isOdd() {
		return true;
	}

	public boolean isPrime() {
		return true;
	}

	public static boolean isEven(int iValue){
		if (iValue % 2 != 0){
		return false;
		}
		return true;
	}

	public static boolean isOdd(int iValue){
		if (iValue % 2 == 0){
			return false;
		}
		return true;
	}

	public static boolean isPrime(int iValue){
		for (int i = 2; i < iValue; i++){
			if (iValue % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger iValue){
		if (isEven(iValue)){
			return true;
		}
		return false;
		
		
	}
	
	public static boolean isOdd(MyInteger iValue){
		if (isOdd(iValue)){
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(MyInteger iValue){
		if (isPrime(iValue)){
			return true;
		}
		return false;
	}
	
	public boolean equals(int iValue1){
		if (iValue1 == iValue){
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger iValue1){
		if (equals(iValue1)){
			return true;
			
		}
		return false;
	}
}
