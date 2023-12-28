package inhertance;

public class ChildThisCall2  extends ChildThisCall1{
	
	ChildThisCall2(char ch)
	{
		System.out.println("const7");
	
	}
	
	ChildThisCall2(char ch,double b)
	{
		this(ch);
		System.out.println("const8");
	}
	
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ChildThisCall2 c1=new ChildThisCall2('A', 20.5);
	}

}
