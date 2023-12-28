package Abstract;

public class AbstractChild1 extends AbstractChild {
	
	void m1()
	{
		System.out.println("method 1");
	}
	
	void m2()
	{
		System.out.println("method-2");
	}
	public static void main(String[] args) {
		AbstractChild c1=new AbstractChild1();
		c1.m1();
		c1.m2();
		
		AbsractParent1 p1=new AbstractChild1();
		p1.m1();
		//p1.m2();
	}

}
