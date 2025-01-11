package firstprogrampackage;

public class InstanceParameter {

	public static void main(String[] args) {
		InstanceParameter obj=new InstanceParameter();
		obj.method1(55, 45);

	}
	public void method1(int a, int b)
	{
		int c=a+b;
		System.out.println("The sum is : "+c);
		
	}

}
