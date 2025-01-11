package firstprogrampackage;

import java.util.Scanner;

public class StaticMethods {

	public static void main(String[] args) {
		addMethod();
	

	}
	
	public static void addMethod()
	{
		//int a=10, b=30;
		//int c=a*b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  first element: ");
		int a=sc.nextInt();
		System.out.println("Enter the  second element: ");
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("The sum is : "+c);
	}

}
