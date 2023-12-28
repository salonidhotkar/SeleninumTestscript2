package AcessingMemberOf2Class;

public class Acessingmember2 {
	
	public static void main (String[]args)
	{
		 AcessingMember a1=new AcessingMember();
		System.out.println(a1.a); 
	    System.out.println(AcessingMember.b);
	    a1.b=40.5;
	    System.out.println(AcessingMember.b);
		
	}

}