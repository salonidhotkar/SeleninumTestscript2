package Practice;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     
//		int num=55;
//		boolean b=true;
//		for(int i=2; i<num-1; i++)
//		{
//			if(num%i==0)
//			{
//				b=false;
//				break;
//			}
//		}
//		
//		if(b==true)
//		{
//			System.out.println("PrimeNumber");
//			
//		}
//		else
//		{
//			System.out.println("Not PrimeNumber");
//		}
//	}
//}
		
//		int num=131;
//		int temp=num;
//		int rev=0;
//		while(num>0)
//		{
//			int digit=num%10;
//			 rev=(rev*10)+digit;
//			num=num/10;
//		}
//		
//		if(rev==temp)
//		{
//			System.out.println("It is a pallendrome");
//		}
//		else
//		{
//			System.out.println("Not a Pallendrome");
//		}
//			
//		
	//}
//}
		
//		String s1="saloni";
//		String s2=" ";
//		for(int i=s1.length()-1; i>=0; i--)
//		{
//			s2=s2+s1.charAt(i);
//		}
//		
//		System.out.println(s2.toUpperCase()  );
//	}
//}
//		
//		
		
		String s1="aaaabbbcccdddeeggg";
		String s2="";
		char arr[]=s1.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			if(s2.indexOf(arr[i])==-1)
			{
				s2=s2+arr[i];
			}
		}
		System.out.println(s2);
		
	}
}
		
		
		
