package Recurssion;

public class PrintingName {

	public static void PrintingName(int num)
	{
       if(num==0)
	{   
    	return;   
		
	}
       System.out.println("Rahul");
       PrintingName(num-1);
       return;
	}
	  public static void main(String[] args) {
		PrintingName(5);
	}

}
