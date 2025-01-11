package firstprogrampackage;

import java.util.Scanner;

public class StaticReturnType {

	public static void main(String[] args) {
	System.out.println(parameters());

	}
	
	public static int parameters()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First element : ");
		int a=sc.nextInt();
		System.out.println("Enter the second element : ");
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("the sum is : "+c);
		return c;
	}

}
