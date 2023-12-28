package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkingWithFilehandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
		File file=new File("C:\\Users\\User\\Desktop\\New java october//Sample.txt");
		if(!file.exists())
		{
		System.out.println("file is created");
		file.createNewFile();
		}
		else
		{
			System.out.println("file is already created");
		}
		
	

	  FileOutputStream fos =new FileOutputStream(file);
	  String s1="My Name is Saloni\n";
	  fos.write(s1.getBytes());
	  String s2="I Live In Yavatmal \n";
	  fos.write(s2.getBytes());
	  String s3="I Work In Testyantra \n";
	  fos.write(s3.getBytes());
	   
	  FileInputStream fis=new FileInputStream(file);
	  int i=fis.read();
	  while(i!=-1)
	  {
		  System.out.print((char)i);
		  i=fis.read();
	  }
	  
	  

}
}
