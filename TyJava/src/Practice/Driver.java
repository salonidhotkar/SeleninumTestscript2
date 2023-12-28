package Practice;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws UnderAgeException {
		// TODO Auto-generated method stub
    
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the age");
		int age=s1.nextInt();
		
		if(age>18) {
			System.out.println("you can vote");
		}else
		{
			throw new UnderAgeException("you cant vote");
		}
	}

}
