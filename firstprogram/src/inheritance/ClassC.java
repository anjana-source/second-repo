package inheritance;

public class ClassC  extends ClassB{

	public static void main(String[] args) {
		ClassC obj=new ClassC();
		obj.childB();
		obj.MultiLevel();
		obj.method();
	}
	public void MultiLevel()
	{
		int a=40,b=5;
		int c=a*b;
		System.out.println("the another  class,  the answer is :"+c);
	}

}
