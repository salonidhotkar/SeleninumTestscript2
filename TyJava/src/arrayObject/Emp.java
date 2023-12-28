package arrayObject;

public class Emp {
	
	String ename;
	int eid;
	double salary;
	
	
	
	public Emp(String ename, int eid, double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Ename:"+this.ename+" "+"Eid:"+this.eid+" "+"salary:"+this.salary;
	}
	
	public static void main(String[] args) {
		Emp e1=new Emp("saloni",1,35000);
	    Emp e2=new Emp("syali",2,45000);
	    Emp e3=new Emp("tanuja",3,55000);
	   
	   Emp arr[]=new Emp[3];
	   arr[0]=e1;
	   arr[1]=e2;
	   arr[2]=e3;
	   
	   for(int i=0; i<arr.length; i++)
	   {
		   System.out.println(arr[i]);
	   }
	}
		
	}
