package excerice.console.SriumaJava.Exception;


import java.util.Arrays;
import java.util.Scanner;


public class intrw {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]= {23,78,65,99};
		intrw.s(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void s(int[] hai)
	{
		for(int i=0;i<hai.length;i++)
		{
			for(int j=i+1;j<hai.length;j++)
			{
				if(hai[i]>hai[j])
				{
					hai[i]*=hai[j];
					hai[j]=hai[i]/hai[j];
					hai[i]/=hai[j];
				}
			}
		//	System.out.print(hai[i]);
		}
	}
	
}
