package pattern;

public class printRowCol {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
 
		int n=3;
		char ch='A';
		for(int row=1; row<=3; row++)
		{
			for(int col=1; col<=3;col++)
			{
				if(row==col)
				{
					System.out.print(ch+" ");
					ch+=n;
				}
				else
				{
					System.out.print(row+col*row+" ");
				}
				
			}
			System.out.println();
			
		}
	}

}
