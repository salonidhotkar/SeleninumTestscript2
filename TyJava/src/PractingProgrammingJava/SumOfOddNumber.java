package PractingProgrammingJava;

public class SumOfOddNumber
{
	public static void main(String [ ] args)
		{
			int temp=0;
			for(int i=10; i<=50; i++)
		{
			if (i%2!=0)
		{
			temp=temp+i;
		}
						
		}
	      System.out.println("The sum of all the odd numbers is:"+temp);
	
			}
	}


