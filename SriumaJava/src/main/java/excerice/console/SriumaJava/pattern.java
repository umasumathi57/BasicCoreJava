package excerice.console.SriumaJava;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the required no of Row's");
		int range=scan.nextInt();
		int temp=1,row=0,clm=0;
		//1)Perfect square
		/*
		for(int row=1;row<=range;row++)
		{
			for(int clm=1;clm<=range;clm++,temp++)
			{
				System.out.print(temp);//note --- for horizontal line 
			}	
			System.out.println();
			*/
		// left upper floyd
		
		temp=1;
		for(row=1;row<=range;row++)
		{
			for(clm=1;clm<=range;clm--,temp++)
			{
				System.out.print(temp);//note --- for horizontal line 
			}	
		scan.close();

	}
}
