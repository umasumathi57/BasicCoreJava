package excerice.console.SriumaJava;
/*
 * Single Inheritance
 ## dem- base/parent class
 # orginal - derived/sub class
 * */
import java.util.Arrays;
public class Singleinheri {
	
	public static void main(String[] args)
	{
		orginal org=new orginal();
		org.fn();
	}
	
}

class dem
{
	Integer arr[]={2,8,9,6,99,65,78,45,34};
	//System.out.println(Arrays.toString(arr));
	
}
class orginal extends dem
{
	public void fn()
	{
		System.out.println("After sort");
		Integer i,j,temp=0;
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}System.out.print(" ");
			System.out.println(arr[i]);
		}		

		
		
	}
}


