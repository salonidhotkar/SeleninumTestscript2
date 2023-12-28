package String;

public class RemovingDuplicateUsingContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String s1="Hello Hye Hello How Hye Are You";
		String arr[]=s1.split(" ");
		String s2=" ";
		for(int i=0; i<arr.length; i++) {
			if(s2.contains(arr[i])==false)
			{
				s2=s2+arr[i]+" ";
			}
		}
		System.out.println(s2);
	}

}
