package inhertance;

public class DriverChild1Child2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child2UpCasting c2=new Child2UpCasting();
		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println(c2.c);
		
		
		Child2UpCasting c1=c2;
		Child2UpCasting c3=(Child2UpCasting)c1;
		
		System.out.println(c3.a);
		
		//ParentUpCasting p1=new Child2UpCasting ();
		//Child2UpCasting c4= (Child2UpCasting) p1;
	}

}
