package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of basket:");
		fruit arr[]=new fruit[sc.nextInt()];
		fruit f;
		//System.err.println(arr.length);
		int n,index=0;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits");
			System.out.println("5. Display Name,Color,Weight,taste");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale");
			System.out.println("Enter a choice :");
			n=sc.nextInt();
			switch (n) {
			case 0:
				System.out.println("Thank you!!!!");
				break;
			case 1:
			{
				f=new Mango("Yellow","Mango");
				Mango m=(Mango) f;
				m.acceptData(sc);
				m.taste();
				arr[index]=m;
				index++;
			}
				break;
			case 2:
			{
				
				f=new Orange("Orange","Orange");
				Orange o=(Orange) f;
				o.taste();
				o.acceptData(sc);
				arr[index]=o;
				index++;
			}
				break;
			case 3:
			{
				f=new Apple("Red","Apple");
				Apple a=(Apple) f;
				a.taste();
				a.acceptData(sc);
				arr[index]=a;
				index++;
			}
			break;
			case 4:
			{
				System.out.println("*****************************************************");
			for(int i=0;i<index;i++)	
			System.out.println(arr[i].getName());	
			System.out.println("*****************************************************");

			}
			break;
			case 5:
			{
				System.out.println("*****************************************************");
				for(int i=0;i<index;i++)	
					System.out.println(arr[i].toString());
				System.out.println("*****************************************************");

			}
				break;
			case 6:
			{
				System.out.println("*****************************************************");
				for(int i=0;i<index;i++)
					if(arr[i].getFresh()==false) {
					System.out.println(arr[i].taste());
					}
				System.out.println("*****************************************************");

			}
				break;
			case 7:
			{
				System.out.println("*****************************************************");
				//for(int i=0;i<index;i++)
					System.out.println("Enter a index :");
					int a=sc.nextInt();
				if(arr[a].getFresh()==true)
				{
					arr[a].setFresh(false);
				}
				System.out.println("*****************************************************");
			}
				break;
				
			case 8:
			{
				System.out.println("*****************************************************");
				for(int i=0;i<index;i++)
				//2if()
				{
					arr[i].setFresh(false);
				}
				System.out.println("*****************************************************");
			}
				break;
				
			default:
				break;
			}

		}while(n!=0);

	}

}
