package Practice;

import java.util.Scanner;

public class NoOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the Word");
		String Word=s1.next();
		String arr[]=Word.split("");
	
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("a")) 
				
				count++;
		}
			System.out.println(s1+"contains"+count+"occurance of'a'");
		}
		
				
	}


