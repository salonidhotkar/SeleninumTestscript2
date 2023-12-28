package MethodOverriding;

public class DriverChild1Child2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		Parent p1 =new Parent();
		p1.method();
		
		Child1 c1=new Child1();
		c1.method();
		
		p1=c1;
		p1.method();
		
		Parent p3=new Child2();
		p3.method();
	}

}
