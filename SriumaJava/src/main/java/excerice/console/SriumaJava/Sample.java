package excerice.console.SriumaJava;
import java.util.Scanner;

public class Sample
{
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			Integer r=0,c=0;
			System.out.println("Enter the string1 here!");
			for( r=1;r<=3;r++)
			{	
			String s=scan.next();	
			Integer n=scan.nextaInt();
			
			
			for(r=0;r<3;r++)
			{
				for(c=0;c<3;c++)
				{
				
			System.out.printf(" %03d"+n);
				//system.out.println( "0"+n);
					System.out.print("&");
					
				}
				System.out.println();

			}

			scan.close();			
		}
}
