package excerice.console.SriumaJava.lang;
import java.util.Arrays;
import java.util.Scanner;
//Exception

public class Exceptioncls {
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Integer arr[]= {12,98,76,94};
		System.out.println("Enter the index");
		//System.out.println(Arrays.toString(arr));
		Integer n = null;
		
		
		try 
		{
			//System.out.println(arr[scan.nextInt()]);
			n=arr[scan.nextInt()];
		}
		catch(StringIndexOutOfBoundsException must)
		{
			System.out.println("Enter the Valid index");
			//System.out.println(arr[scan.nextInt()]);
			n=arr[scan.nextInt()];

		}
	finally{
		System.out.println(arr[n]);
		System.out.println("completed");
	}
		
		
		
		
	/*	Scanner scan=new Scanner(System.in);
		String clr="Light green";
		System.out.println("enter index");
	
	try
	{
		System.out.println(clr.charAt(scan.nextInt()));

	}
	catch(StringIndexOutOfBoundsException hello)
	{
		System.out.println("Enter the vaild index");
		System.out.println(clr.charAt(scan.nextInt()));

	}
	finally
	{
		System.out.println("done");

	}*/
		
	scan.close();
	}

}
