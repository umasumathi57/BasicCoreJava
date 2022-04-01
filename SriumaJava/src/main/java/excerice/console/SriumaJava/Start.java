package excerice.console.SriumaJava;
import java.util.Scanner;
public class Start
{
	public static void main(String[] args)
	{
		/* doubt
		Integer num=50;
		System.out.println(num);
		//System.out.println("%.2f",num);============error
		float temp=89.00F;
		System.out.println(temp);
	//	System.out.println(temp,int);============error
		
		*/
		
		//ATM widthdraw
		Scanner scan=new Scanner(System.in);
		System.out.println("WELCOME TO ICICI BANK");
		Integer Total=10000; 
	//	2000's=3
		
		System.out.println("Enter the Amount");
		Integer Amount=scan.nextInt();
		if(Amount<Total)
		{
			System.out.println("2000's"+Amount/2000);
			System.out.println("500's"+(Amount%2000)/500);
			
		}
		else
		{
			System.out.println(Amount+"is not available now!");
		}

	}
	
}
 