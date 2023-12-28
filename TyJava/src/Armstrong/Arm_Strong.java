package Armstrong;



public class Arm_Strong {
	
	public static void main(String[] args) {
		
	
	int num=153;
	int count=0;
	int temp=num;
	
	while (temp!=0)
	{
		count ++;
		temp=temp/10;
		
	}
	
	int arm=0;
	int temp1= num;
	while(temp1!=0)
	{
		int rem=temp1%10;
		int pow=1;
		for(int i=1; i<=count; i++)
		{
			pow=pow*rem;
		}	
		   arm=arm+pow;
		   temp1=temp1/10;
	    }
	
	   if(arm==num)
	   {
		   System.out.println("ArmStrong number");
	   }
	   else
	   {
		   System.out.println(" Not an ArmStrong Number");
	   }

	
		

	}

}
