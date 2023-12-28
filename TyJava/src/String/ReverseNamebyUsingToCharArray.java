package String;

public class ReverseNamebyUsingToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="saloni";
      char arr[]=s1.toCharArray();
      for(int i=s1.length()-1; i>=0;i--)
      {
    	  System.out.println(arr[i]);
      }
	}

}



