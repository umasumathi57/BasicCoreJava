package excerice.console.SriumaJava.Exception;

import java.util.Scanner;

public class Singletrymulticatch {
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);

		Integer fuel,kms;
		fuel=0; kms=0;
		System.out.println(fuel/kms);
	
	try
	{
		System.out.println(fuel/kms);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Enter the value greater than zero");
		kms=scan.nextInt();
	}
	finally
	{
		System.out.println("Done");
	}
	}

}
