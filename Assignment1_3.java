import java.util.*;

public class Assignment1_3 {
/*3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
(No need of any class, and no need to display the food deatils. Only display the total of orderd
food)*/
public static void main(String[] args) {
	int n;
	double total=0;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("1. Dosa :- 30");
		System.out.println("2. Samosa :- 15");
		System.out.println("3. Idli :- 25");
		System.out.println("4. Vada Sambar :- 30");
		System.out.println("5. vada pao :- 10");
		System.out.println("6. Medu Vada :- 45");
		System.out.println("7. Pao bhaji :- 60");
		System.out.println("8. Puri bhaji:- 30");
		System.out.println("9. Masala Dosa :- 50");
		System.out.println("10. genrate bill :");
		System.out.println("Enter your choice :");
		n=sc.nextInt();
		switch(n) {
		case 1:{
			System.out.println("select quantity of Dosa :");
			int a=1;
			a=sc.nextInt();
			total=total+(30*a);
		}
			break;
			
		case 2:
		{
			System.out.println("select quantity of Samosa :");
			int a=1;
			a=sc.nextInt();
			total=total+(15*a);
		}
			break;
		case 3:
		{
			System.out.println("select quantity of Idli:");
			int a=1;
			a=sc.nextInt();
			total=total+(25*a);
		}
			break;
		case 4:
		{
			System.out.println("select quantity of Vada Sambar:");
			int a=1;
			a=sc.nextInt();
			total=total+(30*a);
		}
			break;
		case 5:
		{
			System.out.println("select quantity of Vada Pao:");
			int a=1;
			a=sc.nextInt();
			total=total+(10*a);
		}
			break;
		case 6:
		{
			System.out.println("select quantity of Medu Vada:");
			int a=1;
			a=sc.nextInt();
			total=total+(45*a);
		}
			break;
		case 7:
		{
			System.out.println("select quantity of Pao bhaji:");
			int a=1;
			a=sc.nextInt();
			total=total+(60*a);
		}
			break;
		case 8:
		{
			System.out.println("select quantity of Puri Bhaji:");
			int a=1;
			a=sc.nextInt();
			total=total+(30*a);
		}
			
			break;
		case 9:
		{
			System.out.println("select quantity of Masala Dosa:");
			int a=1;
			a=sc.nextInt();
			total=total+(50*a);
		}
			
			break;
		case 10:
		{
			System.out.println("====================================");
			System.out.println("Total bill                    :"+total);
			System.out.println("====================================");
		}
			break;
		default :
			System.out.println("wrong choice!!!!");
			break;
		}
	}while(n!=0);
}
	
}
