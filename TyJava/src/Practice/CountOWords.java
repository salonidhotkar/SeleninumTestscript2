package Practice;

public class CountOWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1="my name is saloni i am mad";
	String arr[]=s1.split(" ");
	int count=0;
	int i=0;
	
	if(arr[i]!=null) {
		for(i=0; i<arr.length; i++) {
			count++;
		}
		System.out.println(count);
	}
	

	
	
	}
}