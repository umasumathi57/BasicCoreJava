package excerice.console.SriumaJava.Exception;

import java.util.InputMismatchException;
//nested
import java.util.Scanner;

public class nestedException {
	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		String dress[]= {"sudi","western","saree"};
		System.out.println("index no");
		Integer index=scan.nextInt();
		System.out.println("enter the count");
		Integer count=scan.nextInt();
		System.out.println(dress[index]+" ordered count is "+count);
		scan.close();
		
		try
		{
			System.out.println("index no");
			 index=scan.nextInt();
			System.out.println("enter the count");
			 count=scan.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException arr) 
		{
			try
			{
				
					System.out.println("Enter the index within length"+dress.length);
					 index=scan.nextInt();
					System.out.println("enter the count");
					 count=scan.nextInt();
				
			}
			catch(InputMismatchException input) {
			System.out.println("Enter the index within length"+dress.length);
			 index=scan.nextInt();
			System.out.println("enter the count");
			 count=scan.nextInt();
			}
		}
		
		}
		
	}


