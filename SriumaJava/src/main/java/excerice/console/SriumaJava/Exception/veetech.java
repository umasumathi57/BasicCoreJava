package excerice.console.SriumaJava.Exception;

import java.util.Arrays;
import java.util.Scanner;

public class veetech {

	public static void main(String[] args) {
		Integer arr[]= {23,76,88};//single diamentional array        v   
		Scanner scan=new Scanner(System.in);
	//System.out.println(Arrays.toString(arr));
//		for(Integer i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		//System.out.println(arr[2]);

		for(Integer kumar:arr)
		{
			System.out.println(kumar);
		}
		Integer arr1[]=new Integer[5];
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("enter the no");
			arr1[i]=scan.nextInt();
			System.out.println(Arrays.toString(arr1));
			
		}
		
	}
}

