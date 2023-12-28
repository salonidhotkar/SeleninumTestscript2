package pattern;
import java.util.*;
public class Inversetriangle {
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size");
		int num=s1.nextInt();
		
	 
	
	for(int row=num; row>=1; row--)
	{
		for(int space=row; space<=num-1; space++)
		{
			System.out.print(" ");
		}
		for(int col=1; col<=2*row -1; col++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		
	}
	
          
	}
}

