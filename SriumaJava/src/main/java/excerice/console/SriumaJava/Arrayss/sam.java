package excerice.console.SriumaJava.Arrayss;
import java.util.Scanner;
import java.util.Arrays;

public class sam {

	public static void main(String[] args)
	{
	//Integer arr[]={10,20,30};
	Integer Arr[]=new Integer[5];
		Scanner scan=new Scanner(System.in);
		
		for(Integer i=0;i<Arr.length;i++)
		{
			System.out.println("Tell us the no");
			Arr[i]=scan.nextInt();
		}
	//	System.out.println(Arr);

		System.out.println(Arrays.toString(Arr));
	} 
}
