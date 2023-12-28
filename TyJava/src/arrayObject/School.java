package arrayObject;

public class School {
	String sname;
	int rollno;
	int Class;
	public School(String sname, int rollno,int Class) {
		super();
		this.sname = sname;
		this.rollno = rollno;
		this.Class=Class;
	}
	
	public String toString()
	{
		return"Sname:"+this.sname+" "+"RollNo:"+this.rollno+" "+"Std:"+this.Class;
	}
	
	public static void main(String[] args) {
		School arr[]= {new School("ravi",1,3),
		           new School("saloni",3,5),
		           new School("renuka",5,6)};
		
		
		for(int i=0;i<arr.length; i++)
		{
			
			System.out.println(arr[i]);
		}
		
		
	}
}
	
	
	
	


