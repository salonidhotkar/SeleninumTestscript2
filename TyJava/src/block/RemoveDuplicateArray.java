package block;


import java.util.Scanner;

public class RemoveDuplicateArray {
	public static int [] SortTheArray (int b[])
	{
		for (int i=0; i<b.length; i++)
		{
		for(int j=i+1; j<b.length; j++)	
		{
			if (b[i]>b[j]);
			int temp=b[i];
			b[i]=b[j];
			b[j]=temp;
		}
	}

       return b;
   }       
  

	public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter the size");
    int size =s1.nextInt();
    int arr[]=new int [size];
    System.out.println("Enter the Elements");
    
    for(int i=0; i<=arr.length; i++)
    {
    	arr[i]=s1.nextInt();
    }
     int result[]=SortTheArray(arr);
     int count=0;
     for(int i=0; i<result.length; i++)
     {
    	for(int j=i+1; j<result.length; j++)
    	{
    		if(result[i] == result[j])
    		{
    			count++;
    		}
    	}
	}
    int b[]=new int [result.length-count];
    int k=0;
    for (int i=0; i<result.length-1; i++)
    {
    
		if (result[i]!=result[i+1])
    	{
    		b[k]=result[i];
    		k++;
    	}
    }
    b[k]=result[result.length-1];
    for(int i=0; i<b.length; i++)
  
    	System.out.println(b[i]+" ");
    }
    }

