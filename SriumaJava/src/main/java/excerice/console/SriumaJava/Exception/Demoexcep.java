package excerice.console.SriumaJava.Exception;

import java.io.IOException;
import java.util.Arrays;

public class Demoexcep  extends Sigma
{

	
		public void fill()//throws StringIndexOutOfBoundsException  //throws IOException
		{
			System.out.println("Mandate method");
			Runtime run=Runtime.getRuntime();
			Process pro=null;
			try {
				pro = run.exec("mspaint");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void main(String[] args) 
		{
			Demoexcep man=new Demoexcep();
			man.fill();
		}
	}


	class Sigma
	{
		private double[] undef= {2.3,5.6,9.1,34.7,9.1,44.6,12.4,7.8,12.6,1.1,0.04};
		public void fill()
		{
			System.out.println(Arrays.toString(undef));
		}
	}
	

