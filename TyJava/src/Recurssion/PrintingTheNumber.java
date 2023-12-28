package Recurssion;

import java.util.Scanner;

public class PrintingTheNumber {
	
	public static void PrintingTheNumber(int num,int end) {
		if(num==end+1)
			// for printing 1to5 number
			//(num==end-1)
			//for printing 5to1 number
		{
			return;
			
		}
		  PrintingTheNumber(num-1,end);	
		  // for printing 1to5number
		  PrintingTheNumber(num+1,end);	
		  // for printing reverse
		  System.out.print(num+" ");
	}
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter start value");
		int num=s1.nextInt();
		 System.out.print("Enter end value:");
		 int end=s1.nextInt();
		PrintingTheNumber(num,end);
		
		
	
	}
 	

}
