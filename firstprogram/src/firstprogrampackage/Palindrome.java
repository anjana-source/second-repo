package firstprogrampackage;

import java.util.Scanner;

public class Palindrome {
	 static int t,n;
	
    public static void main(String args[])
	{
	    
	         Scanner s = new Scanner(System.in);
	        System.out.println("Enter the number");
	        n=s.nextInt();
	        s.close();
	        int x=n,j=0;
	        while(x!=0)
	        {
	            j=x%10;
	            x=x/10;
	            t=(t*10)+j;
	            
	        
	    } 
	    {
	        if(n==t)
	        {
	        System.out.println(n+" is palindrom");
	        }
	        else
	        {
	        System.out.println(n+" is not palindrom"); 
	    } 


	    }

	}
}