package inhertance;

public class TestEnginer extends Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEnginer t1=new TestEnginer();
		System.out.println(t1.ename);
		System.out.println(t1.eid);
		System.out.println(t1.blood_Group);
		t1.ename="saloni";
		System.out.println(t1.ename);
		t1.eid=2;
		System.out.println(t1.eid);
		t1.phone_number = 987654321l;
		System.out.println(t1.phone_number);

	}

}
