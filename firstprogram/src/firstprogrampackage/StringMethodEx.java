package firstprogrampackage;

public class StringMethodEx {

	public static void main(String[] args) {
		String s1="hello";
		String s2=s1.concat(" java");
		String s3=s2.concat(" welcome");
		System.out.println("The First Concatenate word is  : "+s1);
		System.out.println("The Second Concatenate word is : "+s2);
		System.out.println("The Third Concatenate word is  : "+s3);
		
		int size=s1.length();
		System.out.println("The size of hello is : "+size);


	}

}
