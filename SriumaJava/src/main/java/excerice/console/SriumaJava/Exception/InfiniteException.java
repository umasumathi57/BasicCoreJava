package excerice.console.SriumaJava.Exception;

import java.util.Scanner;
import java.util.Arrays;

public class InfiniteException {
	
	public static void main(String[] args) {
		
		InfiniteException.excep();
		
	}
	public  static void excep()
	{
		Scanner scan=new Scanner(System.in);
		Integer arr[]= {23,98,67,54,23};
		Integer n;
	try
	{	
		System.out.println("Enter the index");

		 n=scan.nextInt();
		System.out.println(arr[n]);


	}
	catch(ArrayIndexOutOfBoundsException er)
	{
		System.out.println("Enter the index with in arr length");
		InfiniteException.excep();

	}
	}
	

}
