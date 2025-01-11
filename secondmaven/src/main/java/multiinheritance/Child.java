package multiinheritance;

public class Child implements ParentA, ParentB{
	public void display1()
	{
		System.out.println("Child class of Parent a and Parent b");
	}

	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.method();
		obj.method1();
		obj.display1();
	

	}

	@Override
	public void method() {
		System.out.println("Parent class A");
		
	}

	@Override
	public void method1() {
		System.out.println("Parent class B");
	}
}



