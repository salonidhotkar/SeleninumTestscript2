package Tostring;



public class School {
	String Sname;
	double prec;
	int rollNo;
	int STD;
	
	public School (String Sname,double prec, int rollNo, int STD){
	 
	this.Sname=Sname;
	this.prec=prec;
	this.rollNo=rollNo;
	this.STD=STD;
	}
		
	
		public String toString() {
			return "Student Name:"+this.Sname+" "+"Percentage: "+this.prec+" "+"RollNo:"+this.rollNo+" "+"Class:"+this.STD;
			
		}
		
		public boolean equals(Object o)
		{
			School s=(School)o;
			if(s.prec==this.prec && s.Sname.equals(this.Sname))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public static void main(String[]args)
		{
			School s1=new School("Ameya",91.8,23,3);
			School s2=new School("Ameya",91.8,45,8);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1.equals(s2));
			School s3=new School("Asit",91.8,35,9);
			System.out.println(s2.equals(s3));
			
		
	}
	
	

}
