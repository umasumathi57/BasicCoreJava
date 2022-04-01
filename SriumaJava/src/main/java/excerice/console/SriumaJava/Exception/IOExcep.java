package excerice.console.SriumaJava.Exception;

import java.io.IOException;

public class IOExcep {

	public static void main(String[] args) throws IOException,InterruptedException
	{
		
		Runtime runn=Runtime.getRuntime();
		Process pro=runn.exec("mspaint");
		Thread.sleep(3000);
	}
}
