package excerice.console.SriumaJava;

import java.util.Scanner;
public class IfElse 
{
	public static void main(String[] flower)
	{	
		Scanner scan=new Scanner(System.in); 
	    String newline= System.lineSeparator();

		System.out.println("Welcome to the RED BUS Boking!..");
		System.out.println("Select your Desination");
		String location=scan.next();
		
		System.out.println("Enter the Amount");
		int amount=scan.nextInt();
		
	
		// (Note "In IF condition equals is used for check string condition instead of =)
		if (location.equals("chennai")||location.equals("hyderabad")||location.equals("cochine")|| location.equals("banglore"))
		{
			if(amount==1000)
			{
				System.out.println("Select the Time");
				int time=scan.nextInt();
				System.out.println("Ticket Booked"+newline +"Have a Nice Journey!");
			}
				
			else

			{
					System.out.println("Ticket not Booked, Plese try again");
			}
		}
	 else
		{
		System.out.println("Location is currently Not Available");
		}		
		
		scan.close();
	
		}
	}
	

