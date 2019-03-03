package practice;

public class Patterns {

	public static void main(String[] args) {
		printStars(5);
	}
		// TODO Auto-generated method stub

		/*for(int i=1;i <=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1|| i==4|| j==1||j==4)
				{
				System.out.print("*");
				}
				else
			System.out.print(" ");
			}
			System.out.println();
		}*/
		/*for(int i=1; i<=5;i++)
		{
			System.out.print("*");
		}*/
 
// Java code to demonstrate star pattern 

    // Function to demonstrate printing pattern 
    public static void printStars(int n) 
    { 
        int i, j; 
  
        // outer loop to handle number of rows 
        //  n in this case 
        for(i=0; i<n; i++) 
        {   
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for(j=2*(n-i); j>=0; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
             
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
              
            // ending line after each row 
            System.out.println(); 
        } 
    } 
  
  }
