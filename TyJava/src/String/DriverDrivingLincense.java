package String;

import java.util.Scanner;

public class DriverDrivingLincense {

	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
    
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s1.nextInt();
		
		if(age>20)
		{
			System.out.println("You can apply for drivinglincense");
		}
		else
		{
			throw new DrivingLincenseException("You cant apply for lincense");
			
		}
	}

}
