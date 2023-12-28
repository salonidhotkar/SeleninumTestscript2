package Collection;

import java.util.ArrayList;

public class WorkingWithArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add("hello");
		a1.add(20);
		a1.add('A');
		
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(0));
		System.out.println(a1.get(2));
		
		for(int i=0; i<a1.size(); i++)
		{
			for(int j=i; j<a1.size(); j++)
			{
				for(int k=i; k<=j; k++)
				{
					System.out.print(a1.get(k));
				}
				System.out.println();
			}
		}
	}

}
