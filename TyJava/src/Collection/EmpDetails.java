package Collection;

import java.util.Arrays;
import java.util.Scanner;

public class EmpDetails implements Comparable
{
	String ename;
	int eid;
	double salary;
	public EmpDetails(String ename, int eid, double salary) 
	{
		super();
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}
	public String toString() 
	{
		return"Name:"+ename+" "+"ID:"+eid+"Salary:"+salary;
	}
		@Override
	public int compareTo(Object o)
	{
		EmpDetails e=(EmpDetails)o;
		if(this.salary==e.salary)
			return 0;
			else if(this.salary>e.salary)
				return 1;
			else
				return -1;
		}
		
		public static void main(String[]args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size");
			int size=sc.nextInt();
			EmpDetails data[]=new EmpDetails[size];
			System.out.println("Enter ther details");
			for(int i=0;i<data.length;i++) {
				sc.nextLine();
				System.out.println("Enter the name");
				String ename=sc.nextLine();
				System.out.println("Enter the eid");
				int eid=sc.nextInt();
				System.out.println("Enter the salary");
				double salary=sc.nextDouble();
				data[i]=new EmpDetails(ename, eid, salary);
				}
			System.out.println("Before sorting");
		for(EmpDetails e:data) {
				System.out.println(e);
			}
			Arrays.sort(data);
			System.out.println("After sorting the element");
			for(EmpDetails e:data) {
				System.out.println(e);
			}
		}
}
