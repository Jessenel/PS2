package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int newiValue) {
		iValue = newiValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0){
			return true;
		}
		return false;
	}

	public boolean isOdd() {
		if (iValue % 2 != 0){
			return true;
		}
		return false;
	}

	public boolean isPrime() {
		for (int i = 2; i < iValue; i++){
			if iValue % i != 0){
				return true;
			
			}
		}
		return false;
	}

	public static boolean isEven(int n){
		if (n % 2 == 0){
		return true;
		}
		return false;
	}

	public static boolean isOdd(int n){
		if (n % 2 != 0){
			return true;
		}
		return false;
	}

	public static boolean isPrime(int n){
		for (int i = 2; i < n; i++){
			if (n % i != 0){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isEven(MyInteger n){
		if (n.isEven()){
			return true;
		}
		return false;
		
		
	}
	
	public static boolean isOdd(MyInteger n){
		if (n.isOdd()){
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(MyInteger n){
		if (n.isPrime()){
			return true;
		}
		return false;
	}
	
	public boolean equals(int n){
		if (iValue == n){
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger n){
		if (n.iValue == this.iValue){
			return true;
			
		}
		return false;
	}
}
