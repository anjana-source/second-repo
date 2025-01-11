package firstprogrampackage;

public class ThisExample {

	public static void main(String[] args) {
		ThisExample obj=new ThisExample();
		obj.method1();

	}
	public void method1()
	{
		int a=19;
		int b=8;
		int c= a%b;
		System.out.println("the Answer is "+c);
		this.method2();
	}
	 public  void method2()
	{
		int a=9;
		int b=8;
		int c= a+b;
		System.out.println("the Answer is "+c);
		this.method3();
	}
	 
	 public  void method3()
		{
			int a=9;
			int b=8;
			int c= a-b;
			System.out.println("the Answer is "+c);
		}
}
