import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    File file=new File("C:\\Users\\User\\Desktop\\New folder (3)");
     
    if(!file.exists())
    {    
    	file.createNewFile();
    	System.out.println("File is created");
    }
    else
    {
    	System.out.println("File is already exist");
    }
    
    FileOutputStream f1= new FileOutputStream(file);
    String s1="Bangalore\n";
    f1.write(s1.getBytes());
	
    
    FileInputStream f2=new FileInputStream (file);
      int i=f2.read();
      while(i!=-1)
      {
    	  System.out.println((char)i);
    	  
      }
        i=f2.read();
    
	}

}
