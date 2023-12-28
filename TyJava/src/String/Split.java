package String;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String s1="I_Live_In_Bangalore";
		String arr[]=s1.split("_");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}   
