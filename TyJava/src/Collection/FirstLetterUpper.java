package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstLetterUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ArrayList<String> a1=new ArrayList();
		//a1.add("saloni");
		//a1.add("sayali");
		//a1.add("tanuja");
		//System.out.println(a1);
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s1.nextInt();
		System.out.println("Enter the elements");
	
		for(int i=0; i<size; i++)
		{
			a1.add(i,s1.next());
		}
		System.out.println("input form user:"+a1);
		for(int i=0; i<a1.size(); i++)
		{
			a1.set(i,a1.get(i).substring(0,1).toUpperCase()+a1.get(i).substring(1));
		}
		System.out.println(a1);

	}
}
