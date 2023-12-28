package Practice;

import java.util.Scanner;

public class Strong {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s1.nextInt();
		int strong=0;
		int temp=num;
		
		while(num>0) {
			int rem=num%10;
			int fact=1;
			for(int i=1; i<=rem ; i++) {
				fact=fact*i;
				
			}
			
			strong=strong+fact;
			num=num/10;
		
		}
		
		if(strong==temp) {
			System.out.println("SN");
		}else {
			System.out.println("NSN");
		}
	}

}


