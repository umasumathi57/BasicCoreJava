package excerice.console.SriumaJava.File;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileWrite {
	
	public static void main(String[] args) throws IOException
	{
		File fl=new File("D:\\Javafile\\filewrite.txt");
		FileOutputStream fos=new FileOutputStream(fl);
		
		DataInputStream dis=new DataInputStream(System.in);  //dis(System.in)
		System.out.println("pls provide input to be write");
		String content=dis.readLine();						//store -String=dis.readLine()
		fos.write(content.getBytes());
		System.out.println("get filename:"+fl.getName());
		
		
	}

}
