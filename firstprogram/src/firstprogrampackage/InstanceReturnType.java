package firstprogrampackage;

public class InstanceReturnType {

	public static void main(String[] args) {
		
	InstanceReturnType obj=new InstanceReturnType();
	System.out.println(obj.add(100,290));

	System.out.println(obj.multi(5, 8));
		
	}
	public int add(int x,int y)
	{
		int z=x+y;
		return z;
	}
	
	public int multi(int x,int y)
	{
		int z=x*y;
		return z;
	}
}

