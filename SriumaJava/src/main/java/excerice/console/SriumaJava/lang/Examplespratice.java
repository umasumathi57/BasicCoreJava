package excerice.console.SriumaJava.lang;
import java.util.Arrays;
import java.util.Scanner;

public class Examplespratice {
	
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	String[] flower= {"Rose","Jasmine","Louts","Lily","Sunflower"};
	String[] jug=new String[15];
	System.out.println("all elements list");
	//System.out.println(Arrays.toString(flower));
	Examplespratice obj=new Examplespratice();	
	obj.list(flower);
//	obj.frlop(flower);
	obj.cpy(flower, jug);
	//System.out.println(Arrays.toString(jug));

	}
	public void list(String[] hi)
	{
		for(String temp: hi)
		{
			System.out.println(temp);
		}
	}
	/*public void frlop(String[] hello)
	{
		for(Integer row=0;row<hello.length;row++)
		{
			System.out.println(hello[row]);
		}
	}*/
	
	public void cpy(String[] orginal, String[] xexox)
	{
		for(Integer row=0;row<orginal.length;row++)
		{
			orginal[row]=xexox[row];
		}
	}
	
	
	
	
	
}




























	/*public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	//****Next & nextLine****
	
	/*String s=scan.nextLine();
	String ss=scan.next();
	String sss=scan.nextLine();
	System.out.println("Hello");
	
	Integer num=10;
	System.out.printf("%.2f",(float)num);
	
	//**
	 * Conditional statements
	 */
	/*System.out.println("Enter the subject name");
	String sub=scan.next();
	if(sub.equals("Tamil"))
	{
		System.out.println("Pass % is 99");
	}
	else if(sub.equals("English"))
	{
		System.out.println("Pass % is 88");

	}
	else
	{
		System.out.println("Out of the subject");
	}
	
	String day = "null";
	System.out.println("Enter the day");
	switch(scan.next())
	{
	case  "Monday" :
		System.out.println("First day");
		break;
	case  "Tuesday":
		System.out.println("Second day");
		break;
	default:
	System.out.println("weekends ");
	}*/
	
	/*
	 * Static and non static 
	example: demo cls 
	
	
	System.out.println("Enter the number");
	demo obj=new demo();
	//obj.excute();
	

	scan.close();
	}
	}
*/

/*class demo
	{
		Scanner scan=new Scanner(System.in);

		Long a=scan.nextLong();
		
		public  void excute()

		{
			System.out.println(a);
		}
	}*/
