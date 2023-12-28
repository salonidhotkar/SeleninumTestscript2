package Tostring;

public class Emp extends Object {
	String ename;
	int eid;
	double salary;
	
	public Emp(String ename,int eid, double salary) {
		super();
		this.ename=ename;
		this.eid=eid;
		this.salary=salary;
	}
	public String toString()
	{
		return"Employ Name:"+ this.ename+" "+"Eid:"+this.eid+" "+" Salary:"+this.salary;
		
	}
	public static void main(String[] args) {
		Emp e1=new Emp("saloni",1,2);
		System.out.println(e1);
		Emp e2=new Emp("sayali",2,4);
		System.out.println(e2);
		
	}
	

}
