package array2D;
import java.util.*;
public class TransposeOfTheMatrix2D {
	public static int [][] transpose (int b[][])
	{
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length;j++)
			{
				if(i>j)
				{
					int temp=b[i][j];
					b[i][j]=b[j][i];
				    b[j][i]=temp;
				}
			}
			
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the row and column");
		int row=s1.nextInt();
		int column=s1.nextInt();
		int arr[][]=new int [row][column];
		
		System.out.println("Enter The Element");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				arr[i][j]=s1.nextInt();
			}
		}
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();	
		}
	
	    int result [][]=transpose (arr);
      System.out.println("Transverse of array");
      for(int i=0; i<result.length; i++)
      {
    	  for(int j=0; j<result[i].length;j++)
    	  {
    		  System.out.print(result[i][j]+" ");
    	  }
    	  System.out.println();
      }
	}
	}

     



