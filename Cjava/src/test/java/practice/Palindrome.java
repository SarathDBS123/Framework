package practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,r,s=0;
		n=321;
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
			
		}
		if(t==s)
		
			System.out.println("Given number is palindrome");
		else
		System.out.println("not a palindrome");
	}

}
