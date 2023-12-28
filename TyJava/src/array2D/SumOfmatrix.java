package array2D;

import java.util.Scanner;

public class SumOfmatrix {
	static int row;
	static int col;
	public static int[][] add(int arr[][],int brr[][])
 	{
		int result [][]=new int[row][col];
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				result[i][j]=arr[i][j]+brr[i][j];
				
			}
		}
		return result;	
	}
     public static void main(String[] args) {
		
    	 Scanner s1=new Scanner (System.in);
    	 System.out.println("Enter the row and col");
    	 row=s1.nextInt();
    	 col=s1.nextInt();
    	 int arr[][]=new int [row][col];
    	 int brr[][]=new int [row][col];
    	 System.out.println("Enter the elements in 1st matrix");
    	 for(int i=0; i<arr.length; i++) {
 			for(int j=0; j<arr[i].length; j++) {
 				arr[i][j]=s1.nextInt();
 			}
	}
    	 System.out.println("Enter the elements in 2nd matrix");
    	 for(int i=0; i<brr.length; i++) {
 			for(int j=0; j<brr[i].length; j++) {
 				brr[i][j]=s1.nextInt();
 			}
    	 }
    	 int result [][]=add (arr,brr);
    	 for(int i=0; i<result.length; i++) {
  			for(int j=0; j<result[i].length; j++) 
  				System.out.print(result[i][j]+" ");
  				
  			}
  			System.out.println();
  			
    	 }
    	 
    	 
     }
    	

     
    



    	 
    	 

