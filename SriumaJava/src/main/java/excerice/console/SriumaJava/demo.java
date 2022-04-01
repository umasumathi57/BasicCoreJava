package excerice.console.SriumaJava;
import java.util.Scanner;

public class demo 
{
	public static void main(String[] sowrish)
	{
		System.out.println("Weclome to Shaisha Booking");
		System.out.println("Select the model");
		Scanner scan=new Scanner(System.in);
		String model=scan.next();
		int count=0;
		switch(model)
		{
			case "Vivo" : case "vivo":		
		
				System.out.println("Select the Time slot");
				float time=scan.nextFloat();
				for(int temp=0;temp<10;temp++)
				{
					if (time>=12.00 && time<=14.00)
					{
						System.out.println("Mobile ordered");
						count ++;
					}
					else
					{
						System.out.println("Booking Not Available");
					}
				}
				break;

			default:
			{
				System.out.println("Model Not Avaialble");
			}
					
		}
	
	System.out.println("No of order booked"+" "+count);
	scan.close();
	}
}