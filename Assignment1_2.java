import java.util.*;

public class Assignment1_2 
{
/*2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.
Hint : Check Scanner class for the methods*/
	public static void main(String[] args) 
	{
		double num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		if(sc.hasNextDouble()) 
		{
			num1=sc.nextDouble();
			System.out.println("Enter a Number :");
			if(sc.hasNextDouble()) 
			{
				num2=sc.nextDouble();
				double avg=(num1+num2)/2;
				System.out.println("Avarage of two numbers is :"+avg);
			}
			else 
			{
			System.out.println("second numbers are not double");	
			}
		}
		else 
		{
			System.out.println("First numbers are not double");
		}
	}
}
		
	
	
	
	
	
	
	
	
	
	
	