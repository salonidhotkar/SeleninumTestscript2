package Practice;

public class fibonacciSeries {

	public static void main(String[] args) {
		
		int num=0;
		int num1=1;
		 System.out.print(num+" "+num1);
		 
		 while(num<6)
		 {
			 int num2=num+num1;
			 System.out.print(num2);
			 
			  num=num1;
			  num1=num2;
		 }
	}

}
