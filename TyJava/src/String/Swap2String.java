package String;
import java.util.*;
public class Swap2String {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Word");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println("before Swapping");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length() );
		s1=s1.substring(s2.length());
		System.out.println("After Swapping");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
	}

}
