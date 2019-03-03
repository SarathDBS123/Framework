package practice;

public class PrimeNumber {
	public static void main(String[] args)
	{
		//isPrimeNumber(4);
		String s = "ONE"+1+2+"TWO";
		System.out.println(s);
	}

	public static boolean isPrimeNumber(int number) 
	{
	 if (number == 2 || number == 3)
	 { 
		 return true;
	 }
	 if (number % 2 == 0) 
	 { 
		 return false;
	 }
	 int sqrt = (int) Math.sqrt(number) + 1; 
	 for (int i = 3; i < sqrt; i += 2) 
	 {
		 if (number % i == 0) 
		 { 
			 return false;
		 } 
	 } 
	 return true; 
	}
}

