package String;

import java.util.Scanner;

public class AdditionOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s1=new Scanner(System.in);
      System.out.println("Enter the String");
      String s=s1.nextLine();
      char ch[]=s.toCharArray();
      int sum=0;
      
      for(int i=0; i<ch.length; i++)
      {
    	  if(ch[i]>'0' && ch[i]<='9')
    	  {
    		  int num=ch[i]-48;
    		  sum=sum+num;
    	  }
      }
      System.out.println("Sum of integer String is:"+sum);
	}

}
