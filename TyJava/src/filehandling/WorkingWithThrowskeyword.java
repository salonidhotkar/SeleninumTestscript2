package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class WorkingWithThrowskeyword {
	static String newfile=("Sample2.txt");
	public static void CreateNewFile() throws IOException {
	File file=new File(newfile);
	if(!file.exists())
	{
	   file.createNewFile();
	   System.out.println("file is created");
	}
	else
	{
		System.out.println("file already exists");
	}

}

      public static void WritingInTheField() throws IOException {
      FileOutputStream fos=new FileOutputStream(newfile);
      String s1="I Live In bangalore\n";
      fos.write(s1.getBytes());
      String s2="I work in TestYantra\n";
      fos.write(s2.getBytes());
      }
      
      public static void ReadFromTheField() throws IOException {
    	  FileInputStream fis=new FileInputStream(newfile);
    	  int i=fis.read();
    	  while(i!=-1)
    	  {
    		  System.out.print((char)i);
    		  i=fis.read();
    	  }
      }
       public static void main(String[] args) throws IOException {
    	   CreateNewFile();
    	   WritingInTheField();
    	   ReadFromTheField();
		
	}
       }
       
      











