package excerice.console.SriumaJava;
/*
 ===> Multilevel Inheritance 
 # One dervived class act as a parent class for another derived. 
 */

public class Multilevel {
	
	public static void main(String[] args)
	{
		xexox x=new xexox();
		x.Specific(2,7);
	}	 

}

class xexox extends orginal
{
	public void Specific(Integer from, Integer to)
	{
		for(Integer index=from; index<=to;index++)
		{
			System.out.println(arr[index]);
		}
		
	}
}


