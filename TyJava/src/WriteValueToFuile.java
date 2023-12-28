import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class WriteValueToFuile 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.print("Enter filename with extension:");
		//String s=sc.next();
		File f=new File("D:\\message.txt");
		if(!f.exists())
		{
			f.createNewFile();
			FileOutputStream fos=new FileOutputStream(f);
			System.out.println("Enter a string value to the file:");
			String msg=sc.next();
			fos.write(msg.getBytes());
		}
		else
		{
			FileOutputStream fos=new FileOutputStream(f);
			System.out.println("Enter a string value to the file:");
			String msg=sc.next();
			fos.write(msg.getBytes());
		}
			
	}
}
