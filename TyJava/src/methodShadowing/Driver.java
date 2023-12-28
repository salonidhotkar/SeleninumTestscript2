package methodShadowing;

public class Driver {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p1=new Parent();
		p1.method();
		
		Class c1=new Class();
		c1.method();
		
		p1=c1;
		p1.method();
		
	}

}
