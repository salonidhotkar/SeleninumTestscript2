package ExceptionHandaling;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(2/0);
		}                                                                                 
		catch(ArithmeticException e)
		{
		System.out.println("exception handle");
		}
		System.out.println(5);
		System.out.println(6);
	}

}
