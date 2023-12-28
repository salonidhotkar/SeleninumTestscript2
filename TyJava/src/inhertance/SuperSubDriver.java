package inhertance;

public class SuperSubDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s1=new Sub();
		s1.a=10;
		s1.b=5.5;
		s1.f=6.6f;
		s1.ch='s';
		
		Super s2=new Super();
		s2.a=20;
		s2.b=7.7;
		
		System.out.println(s1.a+" "+s1.b+" "+s1.f+" "+s1.ch);
		System.out.println(s2.a+" "+s2.b);

	}

}
