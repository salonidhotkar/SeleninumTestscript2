package inhertance;

public class DriverSuperSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClass s1=new SubClass();
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s1.c);
		System.out.println(s1.d);
		
		SuperClass s2= new SuperClass();
		System.out.println(s2.a);
		System.out.println(s2.b);
		
		s2=s1;
		
		SubClass s3=(SubClass)s2;
		
		System.out.println(s3.c);
		System.out.println(s3.d);

	}

}
