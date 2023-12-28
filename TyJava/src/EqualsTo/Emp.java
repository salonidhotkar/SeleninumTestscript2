package EqualsTo;

public class Emp {
	String ename;
	int eid;
	double salary;
	
	 Emp(String ename,int eid,double salary)
	 {
		 this.ename=ename;
		 this.eid=eid;
		 this.salary=salary;
		 
	 }
	 public boolean equals (Object o)
	 {
		 Emp e=(Emp) o;
		 if(e.salary==this.salary)
		 {
			 return true;
		 }
		 
		 else
		 {
			 return false;
		 }
	 }
	 
	   public static void main(String[] args)
	   {
		Emp e1 =new Emp("saloni",2,20000);
		Emp e2=new Emp("sayali",5,20000);
		System.out.println(e1.equals(e2));

	}

	 
	

}
