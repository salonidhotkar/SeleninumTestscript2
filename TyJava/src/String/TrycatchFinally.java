package String;

public class TrycatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		try
		{
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[arr.length-1]);
		}
		catch(Exception e)
		{
			System.out.println("Exception handle");
		} 
		finally
		{
			try
			{
				
				System.out.println(1/0);
			}
			catch(Exception e)
			{
				System.out.println("Exception handle-1");
			}
			finally
			{
			System.out.println("This is finally block");
		}
	}

	}
}
