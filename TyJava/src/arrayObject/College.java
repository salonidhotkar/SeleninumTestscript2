package arrayObject;

import java.util.Scanner;

public class College {
	String sname;
	int regino;
	String branch;
	public College(String sname, int regino, String branch) {
		super();
		this.sname = sname;
		this.regino = regino;
		this.branch = branch;
	}
	
	public String toString()
	{
		return"Sname:"+this.sname+" "+"RegiNo:"+this.regino+" "+"Branch:"+this.branch;
	}
	
	public static void main(String[] args) {
	  Scanner s1=new Scanner (System.in);
	  System.out.println("Enter the Size");
	  int size=s1.nextInt();
	  College arr[]=new College[size];
	  System.out.println("Enter The Details");
	  
	  for(int i=0;i<arr.length; i++)
	  {
		  s1.nextLine();
		  System.out.println("Enter The Name");
		  String sname=s1.nextLine();
		  System.out.println("Enter The RegisterNo");
		  int regino=s1.nextInt();
		  System.out.println("Enter The Branch");
		  String branch =s1.next();
		  arr[i]=new College (sname,regino,branch);
		  
		  
	  }
	  for(int i=0;i<arr.length; i++)
	  {
		  System.out.println(arr[i]);
	  }
	  
	
	}

}
