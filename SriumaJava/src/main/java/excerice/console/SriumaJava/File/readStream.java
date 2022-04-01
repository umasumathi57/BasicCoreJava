package excerice.console.SriumaJava.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readStream 
{
	public static void main(String[] args) throws IOException 
	{
		
		File f=new File("D:\\read\\annakili.txt");
		FileInputStream fis=new FileInputStream(f);
	
		byte[] temp=new byte[fis.available()];
		fis.read(temp);
		System.out.println(new String(temp));
		
		
		
	}
	

}



 
