package inheritance;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		
		ClassB obj=new ClassB();
		obj.childB();
		obj.method();

	}
	public void childB()
	{
	
		System.out.println("This is child class B");
	}

}
