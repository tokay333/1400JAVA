package Ch04Scanner;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 : " );
		int num1 = sc.nextInt();
		System.out.print("두번째 : " );
		int num2 = sc.nextInt();
		System.out.print("세번째 : " );
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println("SUM : " + sum);
		
		sc.close();
		
		
		
		

	}

}
