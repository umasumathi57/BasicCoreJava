package excerice.console.SriumaJava.Exception;
import java.io.IOException;
//reason
import java.util.Scanner;

public class StartExecp {
	/*
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		String b="Mother's luv";
		System.out.println("Enter the pos to be print");
		//System.out.println(b.charAt(3));
	
	try
	{
		System.out.println("try block");
		System.out.println(b.charAt(scan.nextInt()));
		
	}
	catch(StringIndexOutOfBoundsException indu)
	{
		System.out.println("Enter the no with length"+b.length());
		System.out.println(b.charAt(scan.nextInt()));

	}
	scan.close();
	}*/
	
	/*public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Double d[]= {12.4,34.9,87.8,56.2,29.5};
		System.out.println("Enter the index to be dispaly");
	//	System.out.println(d[3]);
		try {
		System.out.println(d[scan.nextInt()]);
		}
		catch(ArrayIndexOutOfBoundsException arr)
		{
			System.out.println("Re-Enter the index within the range");
			System.out.println(d[scan.nextInt()]);
		}
		scan.close();
	}*/
	
public static void main(String[] args) throws ArrayIndexOutOfBoundsException
{
		
		Scanner scan=new Scanner(System.in);
		Double d[]= {12.4,34.9,87.8,56.2,29.5};
		System.out.println("Enter the index to be dispaly");
		System.out.println(d[scan.nextInt()]);

	//	System.out.println(d[3]);
//		try {
//		System.out.println(d[scan.nextInt()]);
//		}
//		catch(ArrayIndexOutOfBoundsException arr)
//		{
//			System.out.println("Re-Enter the index within the range");
//			System.out.println(d[scan.nextInt()]);
//		}
		scan.close();
	}
}
