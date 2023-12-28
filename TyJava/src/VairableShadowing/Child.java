package VairableShadowing;

public class Child extends Demo {
	
	int a=30;
	static int b=40;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Demo d1=new Demo();
		System.out.println(d1.a);
		System.out.println(d1.b);
		
		Child c1=new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		 
		
		d1=c1;
		System.out.println(d1.a);
		System.out.println(d1.b);
		
		Child c2=(Child)d1;
		System.out.println(c2.a);
		System.out.println(c2.b);
	}

}
