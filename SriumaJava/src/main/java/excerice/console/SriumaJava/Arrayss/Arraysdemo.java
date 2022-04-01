package excerice.console.SriumaJava.Arrayss;

import java.util.Arrays;
import java.util.Scanner;


public class Arraysdemo {
	
	
	public static void main(String[] args) {
		
		Source src=new Source();
		
	}

}
class Source
{
	private Scanner scan=new Scanner(System.in);
	static {System.out.println("Source static");}
	private String[] myResources=new String[10];
	public Source()
	{
		System.out.println("Contructed called to initialize ");
		myResources[0]="Mohamed";myResources[1]="Rasheedha";
		myResources[2]="Razak";myResources[3]="Sabari";myResources[4]="Sheik";
		myResources[5]="Dinesh";
	}
	
}





