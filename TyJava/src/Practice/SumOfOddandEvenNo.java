package Practice;

public class SumOfOddandEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=1;
        int esum=0;
        int osum=0;
        
        while(num<=20)
        {
        	if(num%2==0)
        	{
        		esum=esum+num;
        	}
        	else
        	{
        		osum=osum+num;
        	}
        	num++;
        
       }
        System.out.println("even:"+esum);
        System.out.println("odd:"+osum);
	}

}
