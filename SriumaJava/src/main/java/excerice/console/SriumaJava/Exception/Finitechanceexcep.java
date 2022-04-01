package excerice.console.SriumaJava.Exception;

import java.util.Scanner;

public class Finitechanceexcep {
	public static void main(String[] args) {
		Finitechanceexcep.excep(1);

		
	}
	public  static void excep(Integer chance)
	{
		Scanner scan=new Scanner(System.in);
		Integer arr[]= {23,98,67,54,23};
		Integer n;
	try
	{	
		System.out.println("Enter the pos");

		 n=scan.nextInt();
		System.out.println(arr[n]);


	}
	catch(ArrayIndexOutOfBoundsException er)
	{
		System.out.println("Enter the pos with in arr length");
		
		if( chance<=3)
		{
			chance++;
		Finitechanceexcep.excep(chance);
		}
		else
		{
			System.out.println("Not of attempted reached, pls try again later");
		}
	}
	}
	

}
