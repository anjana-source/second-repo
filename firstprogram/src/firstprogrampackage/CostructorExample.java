package firstprogrampackage;

public class CostructorExample {

	public static void main(String[] args) {
		CostructorExample con=new CostructorExample();

	}

	int a=10;
	float b=10.9f, c;
	public CostructorExample()
	{
		float c= a+b;
		System.out.println("the answer is : "+c);
	}
	
	
}
