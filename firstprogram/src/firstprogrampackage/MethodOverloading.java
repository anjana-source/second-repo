package firstprogrampackage;

public class MethodOverloading {

	public static void main(String[] args) {
		//MethodOverloading.method1(2, 5);
		//MethodOverloading.method1(30, 10);
		System.out.println(MethodOverloading.method1(4, 5));
		System.out.println(MethodOverloading.method1(10, 3));
	}
	public static int method1(int a, int b)
	{
		int c=a+b;
		return c;
		//System.out.println("The sum is : "+c);
	}
	
	public static int  method1(int x)
	{
	
		return x;
		//System.out.println("The answer is : "+z);
	}

}
