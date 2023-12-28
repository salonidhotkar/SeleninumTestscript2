package PractingProgrammingJava;

public class SumOfTheSmallestAndLargestNumber
{
	
		public static void main (String [ ] args )
		{
			int arr [ ]= {28, 45, 36, 102, 87, 66, 55, 99, 12};
			for ( int i=0; i< arr.length ; i++)
			{
				for(int j=i+1 ; j< arr.length ; j++)
				{
					if (arr [ i ] > arr [ j ])
					{
						int temp= arr [ i ];
						arr [ i ] = arr [ j ] ;
						arr [ j ] = temp;
					}
				}
			}
			System.out.println ("The sum of the smallest and the largest  number is: "+arr [0]+ arr [ arr.length-1 ] );
		}
	}



