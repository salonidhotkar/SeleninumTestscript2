package String;

import java.util.Scanner;

public class DriverUnderAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner s1=new Scanner(System.in);
				System.out.println("Enter your age");
				int age=s1.nextInt();
		if(age>18)
		{
			System.out.println("you can vote");
		}
		else
		{
			throw new UnderAgeException("you cant vote");
		}
	}
}
			
