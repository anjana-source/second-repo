package firstprogrampackage;

//import java.util.Scanner;

public class InstanceMethod {

	public static void main(String[] args) {
		InstanceMethod obj=new InstanceMethod();
		obj.instance1();
		  

	}
	
	public void instance1()
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the first element : ");
		//int a =sc.nextInt();
	//	System.out.println("enter the second element : ");
		//int b =sc.nextInt();
		
		int a=10,b=3;
		int c=a*b;
		System.out.println("The Answer is :"+c);
	}

}
