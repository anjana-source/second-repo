package secondpackage;

public class ArraySum {

	public static void main(String[] args) {
		int[] num = {1,5,9,10};
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
			
		}
System.out.println("The sum of the in the array is :" +sum);
	}

}
