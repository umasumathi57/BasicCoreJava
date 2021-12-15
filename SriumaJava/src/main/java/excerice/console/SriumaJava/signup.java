package excerice.console.SriumaJava;
//import Scanner 

import java.util.Scanner;

public class signup 
{
	public static void main(String[] sri)
	{
		//initialize
		/*String firstName = "sriumadevi", lastName = "Balachandran";
		Long mobNo=8870098577L;
		System.out.println(firstName +lastName+"Send SMS to"+mobNo);
		*/
		
		//>>>-- Run time inputs
		
		Scanner sriuma= new Scanner(System.in);
		String firstName="", lastName="";
		Long mobNo=0L;
		Integer bdayMon=0;	
		System.out.println("Enter the firstName");
		firstName=sriuma.next();
		System.out.println("Enter the lastName");
		lastName=sriuma.next();
		System.out.println("Enter the Monile number");
		mobNo=sriuma.nextLong();
		System.out.println("Enter the Bday month");
		bdayMon=sriuma.nextInt();
		
		System.out.println(firstName+ lastName+ "Please verify the OTP via Mobile no "+ mobNo);
	}

}
