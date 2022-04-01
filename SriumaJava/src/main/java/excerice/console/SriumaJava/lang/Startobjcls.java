package excerice.console.SriumaJava.lang;

import java.io.IOException;

/*
 * Runtime & Process
 * */

public class Startobjcls {
	
	public static void main (String[] args) throws IOException
	{
		Runtime run=Runtime.getRuntime();
		Process pro=run.exec("notepad");
		//Process pro1=run.exec("msword");

	}

}
