package String;

public class SubStringOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String s1="Hello";
		for(int i=0; i<s1.length(); i++)
		{
			for(int j=i+1; j<=s1.length(); j++)
			{
				System.out.println(s1.substring(i, j));
			}
		}
	}

}
