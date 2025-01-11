package firstprogrampackage;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) 
		{  
		    
		        Scanner sc = new Scanner(System.in); 

		        System.out.print("Enter number of elements: ");

		        int a = sc.nextInt(),s=0; 

		        System.out.println("Enter numbers: "); 

		        int v[]=new int[15];

		        	for(int i=0;i<a;i++)
		         	 {
		              v[i]= sc.nextInt();
		              s+=v[i]; 
		          	 }

		          System.out.println("Sum: "); 

		          for(int i=0;i<a;i++)
		          {                                               
		              if(i<a-1)
		              System.out.print(v[i]+" + "); 
		              else
		              System.out.print(v[i]);
		          }

		          System.out.println(" = "+s);            
		    }  



	}

