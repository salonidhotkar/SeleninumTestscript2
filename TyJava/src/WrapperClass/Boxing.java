package WrapperClass;

public class Boxing {
	public static void main(String[] args) {
		int a=10;
		Integer b=Integer.valueOf(a);
		System.out.println(b);
		
		boolean b1=true;
		Boolean b2=Boolean.valueOf(b1);
	    System.out.println(b2);
	    
	    double d1=10.5;
	    Double d2=Double.valueOf(d1);
	    System.out.println(d2);
	    
	    char c='A';
	    Character ch=Character.valueOf(c);
	    System.out.println(ch);
	}

}
