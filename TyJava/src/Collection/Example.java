package Collection;


import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList a1=new ArrayList<>();
		a1.add(10.4);
		a1.add(20.5);
		a1.add(30.5);
		double i1=(Double)a1.get(1);
		double i2=(Double)a1.get(2);
		//System.out.println(i1=i2);
	 
		System.out.println((Double)a1.get(1)+(Double)a1.get(2));
	}

}
