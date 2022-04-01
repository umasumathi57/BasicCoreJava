package excerice.console.SriumaJava.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//file - permanent storage 
//operation - create >
//1) file 
//2)streams

public class fileCreation {
	
	public static void main(String[] args) throws IOException
	{
	
	File f=new File("D:\\Javafile\\sriuma.txt"); // file creation via file
	f.createNewFile();
	
	File file=new File("D:\\Javafile\\umab.doc"); // file creation via streams
	FileOutputStream fos=new FileOutputStream(file);
	fos.close();
	
	}

}
