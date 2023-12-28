package Numbers;
import java .util.*;
public class SumOfPrimeNumberGivenByuser {
	
	public static boolean isPrime (int num)
	{
	if(num==1)
	{
		return false;
	}
	for(int i=2; i<=num/2; i++)
	{
		if(num%i==0)
		{
			return false;
		}
		
	}
	return true;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s1=new Scanner (System.in);
		System.out.println("Enter the Number");
		int num=s1.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++)
		{
		if(isPrime(i)==true)
		{
			sum=sum+i;
		}
	}
		System.out.println(sum);

		}

}
