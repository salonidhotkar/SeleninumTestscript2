package Practice;

public class SumOfOddNumberFrom5_15 {

	public static void main(String[] args) {
		 
	int num=5;
	int sum=0;
	while(num<=15)
	{
		if(num%2==1)
		{
			sum=sum+num;
	
		}
		num++;
		System.out.println(sum);
		
	}
	
	}

}
