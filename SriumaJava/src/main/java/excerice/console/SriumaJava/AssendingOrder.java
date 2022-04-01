package excerice.console.SriumaJava;
import java.util.Scanner;
import java.util.Arrays;


public class AssendingOrder 

{
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	Integer arr[]= {1,5,3};
	Integer row,temp=0;

//	System.out.println(Arrays.toString(arr));
	System.out.println("Before swap");

	for (row=0;row<=arr.length-1;row++)
	{
		System.out.println(arr[row]);
	}
	
	//operation 
	System.out.println("After swap");
	for (row=0;row<=arr.length-1;row++)
	{
		for(Integer j=row;j<arr.length-1;j++)
		{
	if(arr[row]>arr[row+1])
	{
		temp=arr[row];
		arr[row]=arr[row+1];
		arr[row+1]=temp;
	}
	}
	System.out.print(arr[row]+" ");

	
	}

	
	
	
	scan.close();
}

}
