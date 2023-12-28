package Tostring;

public class Student extends Object {
	String sname;
	int studentid;
	int Std;
	
	public Student(String sname,int studentid,int Std)
	{
	super();
	this .sname=sname;
	this.studentid=studentid;
	this.Std=Std;
}  
	public String toString()
	{
		return "Student Name:"+this.sname+" "+"StudentId:"+this.studentid+" "+"Standard: "+this.Std;
		
	}
	public static void main(String[] args) {
	  Student s1=new Student("saloni",1,3); 
	  System.out.println(s1);
	  Student s2=new Student("sayali",1,3);
	  System.out.println(s2);
		
	}


	

}
