package firstprogrampackage;

public class Matrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{3,4,5},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
		}
		System.out.println();
		
		}
	}

}
