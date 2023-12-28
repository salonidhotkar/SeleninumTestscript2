package Hashcode;

public class Emp {
	
	String ename;
	int eid;
	double salary;
	
	public Emp(String ename,int eid,double salary)
	{
		this.ename=ename;
		this.eid=eid;
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		Emp e1=new Emp("saloni",1,30000);
		Emp e2=new Emp("asit",2,50000);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		Emp e3=e2;
		System.out.println(e3.equals(e2));
		System.out.println(e3.hashCode());
		System.out.println(e3.hashCode());
		
	}

}
