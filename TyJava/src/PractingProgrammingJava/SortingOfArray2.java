package PractingProgrammingJava;

public class SortingOfArray2 {
	public static void main(String[] args) 
	{
		int arr[]= {234,654,876,789,927,713,643};
		for (int i=0; i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(((arr[i]/10)%10)>(arr[j]/10)%10)
				{
					int temp1= arr[i];
					arr[i]=arr[j];
					arr[j]=temp1;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}
	
	

}
