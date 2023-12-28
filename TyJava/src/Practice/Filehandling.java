package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filehandling {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\User\\Desktop\\Saloni Dhotkar\\sample6.txt");
		
		if(!file.exists()) {
		
			System.out.println("file is created");	
			file.createNewFile();
		}else {
			System.out.println("file is already created");
		}
		
		FileOutputStream f1=new FileOutputStream(file);
		String s1="My name is saloni";
		f1.write(s1.getBytes());
		
		FileInputStream f2=new FileInputStream(file);
		int i=f2.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=f2.read();
		}
	}

}
