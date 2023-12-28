package polymorphism;

public class Demo {
	
	public static void method(int a)
	{
		System.out.println("method-1");
	}
	
	public static void method (int a,int b)
	{
		System.out.println("method-2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		method(10);
		method(10,20);
	}

}
