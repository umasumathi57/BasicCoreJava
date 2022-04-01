package excerice.console.SriumaJava;
import java.util.Arrays;


public class Array {
	
	public static void list(Integer[] hi)
	{
		for(Integer temp:hi)
		{
			System.out.println(temp);
		}
	}

	public static void bubble(Integer[] demo)
	{
		for(Integer out=0;out<demo.length;out++)
		{
			for(Integer repeat=0;repeat<demo.length-1;repeat++)
			{
				if(demo[out]>demo[repeat+1])
				{
				demo[out]^=demo[repeat+1];
				demo[repeat+1]^=demo[out];
				demo[out]^=demo[repeat+1];
				}	

			}
		}
	}
	public static void main(String[] args) 
	{
			Integer[] arr= {1,3,2};
		//	System.out.println(arr.length);
			//System.out.println(arr[2])	
			//System.out.println(arr);
			System.out.println("Before Sort");
		//	System.out.println(Arrays.toString(arr));
			Array.list(arr);
			System.out.println("After sort");
			//System.out.println(Arrays.toString(arr));


	}
}

	
