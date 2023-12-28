package block;

public class StaticBlock4 {
 static int a=10;

static 
{
	int a=20;
	StaticBlock4.a=a;
	System.out.println(a);
	}
static
{
	a=30;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(a);
	}

}
