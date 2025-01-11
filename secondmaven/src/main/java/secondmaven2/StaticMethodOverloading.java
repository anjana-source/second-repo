package secondmaven2;

public class StaticMethodOverloading {
	
	public static void method1(int a, int b)
	{
		int c =a*b;
		System.out.println("The answer is :"+c);
	}

	public static void method1(float x, int y)
	{
		float z =x+y;
		System.out.println("The answer is :"+z);
	}

	
	public static void main(String[] args) {
		
		StaticMethodOverloading.method1(4, 5);
		StaticMethodOverloading.method1(10.7f,7);
	

	}

}
