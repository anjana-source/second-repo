package secondpackage;

public class InstanceDetails {
	
	public void details(String name,int age)
	{
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	}
	

	public static void main(String[] args) {
	InstanceDetails obj=new InstanceDetails();
	obj.details("ammu",5);

	}

}
