package Ch07While;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
		//기본
		//1 탈출용 변수 지정
		//2 탈출용 조건식
		//3 조건식이 false가 되도록 하는 연산식
		
//		int i=1;	//1 탈출용 변수
//		while(i<=10) //2 탈출용 조건식
//		{
//			System.out.println("Hello World!");
//			i++;	//3 조건식이 거짓이 되기 위한 연산식
//		}
		
		//02 1부터 10까지 합 구하기
		
//		int i=1;
//		int sum=0;	//누적합 저장용
//		while(i<=10) 
//		{
//			System.out.println("i=" +i);
//			sum=sum+i;
//			i++;
//		}
//		System.out.println("while벗어남 i="+i);
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		
		//문제
		//정수값 하나(N)을 입력받아
		//1부터 N까지의 합을 구합니다
		
		Scanner sc = new Scanner(System.in);
		
//		int i=1;
//		int sum=0;
//		int n = sc.nextInt();
//				
//		while(i<=n) 
//		{
//			System.out.println("i=" +i);
//			sum=sum+i;
//			i++;
//		}
//		System.out.printf("1부터 %d까지의 합 : %d\n", n,sum);
//		
		//문제
		//정수값 두개(N,M)을 입력받아 N부터 M까지의 합을 구합니다
		
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int i = n;
//		int sum = 0;
//		
//		while(i<=m) 
//		{
//			System.out.println("i=" +i);
//			sum=sum+i;
//			i++;
//		}
//		System.out.printf("%d부터 %d까지의 합 : %d\n", n, m, sum);
//		
//		//swap
//		if(n>m) 
//		{
//			int tmp=n;
//			n=m;
//			m=tmp;
//		}
//		
//		int i=n;
//		int sum=0;
//		while(i<=m) 
//		{
//			System.out.println("i="+i);
//		}
		
		
		//2단 구구단
		
//		int i=1;
//		while(i<=9) 
//		{
//			System.out.printf("%d x %d = %d\n", 2, i, 2*i);
//			i++;
//		}
		
		//2단 역순
		//2 x 9 = 18
		//2 x 8 = 16
		//...
		//2 x 1 = 2
		
//		int i=9;
//		while(i>=1) 
//		{
//			System.out.printf("%d x %d = %d\n", 2, i, 2*i);
//			i--;
//		}
		
				
		//N단 역순
		//정수값 하나를 받아서
		//N x 9 = ?
		//N x 8 = ?
		//...
		//N x 1 = N
				
//		int n = sc.nextInt();
//		int i=9;
//		while(i>=1) 
//		{
//			System.out.printf("%d x %d = %d\n", n, i, n*i);
//			i--;
//		}
		
		
		//문제
		//1부터 N까지의 수 중에
		//3의 배수의 합만 구하세요
		
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i<=n) 
		{
			if(i%3==0) 
			{				
				sum = sum + i;
				System.out.printf("3의 배수의 합 = %d\n", sum);
			}i++;
		}
				
		
		
		
	}

}
