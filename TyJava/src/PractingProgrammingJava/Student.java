package PractingProgrammingJava;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;



	public class Student implements Comparable {
		
		String sname;
		int sid;
		int std;
		double percentage;
		
		
	   public Student(String sname, int sid, int std, double percentage) {
			super();
			this.sname = sname;
			this.sid = sid;
			this.std = std;
			this.percentage = percentage;
		}
	    
	   public Student() {
		// TODO Auto-generated constructor stub
	}

	public String toString()
	   {
		   return"StudentName:"+this.sname+" "+"Sid:"+this.sid+" "+"Std:"+this.std+" "+"Percentage:"+this.percentage;
	   }
	   
	   public int compareTo(Object o)
	   {
		  Student s=(Student)o; 
		  if(this.percentage==s.percentage)
		  {
			  return 0;
		  }
		  else if(this.percentage>s.percentage)
		  {
			  return 1;
		  }
		  else
		  {
			  return -1;
		  }
		  
	   }
	   
	   public static void read()
		  {
			  System.out.println("Student is Reading");
		  }
		  
		  public static void Write()
		  
		  {
			  System.out.println("Student is Writting");
		  }
		  
		  public static void Play()
		  {
			  System.out.println("Student are playing");
		  }
		 
		 
		  
		
		public static void main(String[] args) {
			
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the Size");
			int Size=s1.nextInt();
			
			LinkedList l=new LinkedList();
			for(int i=0; i<Size; i++)
			{
				System.out.println("Enter sname:");
				s1.nextLine();
				String s=s1.nextLine();
				
				System.out.println("Enter sid:");
				int sid=s1.nextInt();
				
				System.out.println("Enter Standard:");
				int std=s1.nextInt();
				
				System.out.println("Enter percentage");
				double percentage=s1.nextDouble();
				
				l.add(new Student (s,sid,std,percentage));
				
				
			}
			  System.out.println("Before Sorting:"+l);
			  Collections.sort(l);
			  System.out.println("After Sorting:"+l);
		
			  
			 Student s2=new Student();
			 s2.read();
			 s2.Write();
			 s2.Play();
		}

		
			
		}  
		  
	   


