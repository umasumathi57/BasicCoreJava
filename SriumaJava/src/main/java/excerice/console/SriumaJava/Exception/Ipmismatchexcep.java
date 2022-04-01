package excerice.console.SriumaJava.Exception;	

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ipmismatchexcep {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int mark=0;
		try
		{
			System.out.println("enter the mark");
			mark=scan.nextInt();
		}
		catch(InputMismatchException err)
		{
			Scanner scan1=new Scanner(System.in);
			System.out.println("Integer only");
			 mark=scan1.nextInt();
			System.out.println(mark);
		}
		scan.close();
	}
	 
}
