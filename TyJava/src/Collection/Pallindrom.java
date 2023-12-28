package Collection;

public class Pallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int num=141;
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int digit=num%10;
			rev=(rev*10)+digit;
			 num=num/10;
			
		}
		if(rev==temp)
		{
			System.out.println("pallimdrom");
		}
		else
		{
			System.out.println("not pall");
		}
		
	}

}
