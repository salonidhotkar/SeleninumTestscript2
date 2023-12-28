package Practice;

import java.util.Scanner;

public class PrimeNumberWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int count = 0;
		int n = 1;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s1.nextInt();
		
		
		while (count < num) {
			n = n + 1;
			for (i = 2; i <= n; i++) {
				if (n % i == 0) {
					break;
			}
		}

		if(i==n) {

			count = count + 1;

		}
		}

		System.out.println(num + "th prime number is:" + n);

	}

}

