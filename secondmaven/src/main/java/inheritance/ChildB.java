package inheritance;

public class ChildB extends ChildA{
	
	public void dispaly1()
	{
		System.out.println("This is second child class");
		
	}

	public static void main(String[] args) {
		ChildB obj=new ChildB();
		obj.dispaly1();
		obj.method1();
		obj.dispaly();
		

	}

}
