package inhertance;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=7;
    boolean flag=true;
     
    for (int i=2; i<=num-1; i++)
    {
    	if (num%i==0)
    	{
    		flag=false;
    		break;
    	}
    	
    }
    if (flag==true)
    {
    	System.out.println("prime Number");
    	
    }
    else
    {
    	System.out.println("composite");
    }
	}

}
