package Ch08For;

import java.util.Scanner;

public class C01For {

	public static void main(String[] args) {
		
		
/*		for(int i=0; i<5; i++) 
		{
			System.out.println("Hello World");
		}
		
		for(int i=1; i<=9; i++) 
		{
			System.out.println("2 * "+i+" = " +(2*i));
		}
*/
		
//		int i=1;
//		while(i<=10)
//		{
//			System.out.println("i : " + i);
//			i++;
//		}
		
/*		for(int i=1;i<=10;i++) 
		{
			System.out.println("i : " + i);
		}
*/
		
		//1부터 N까지의 합
		//N부터 M까지의 합
		//N부터 M까지의 수중의 3의배수를 제외한 합
		//구구단 출력
		//--------중첩for---------------------
		//전체 구구단 출력
		//전체 구구단 역순 출력
		//별찍기(직삼각형,역직각삼각형,정삼각형,역정삼각형...)
		
/*		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) 
		{
			sum = sum +i;
		}
		System.out.printf("1부터 %d까지의 합 : %d\n", n,sum);
*/		
		
/*		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		
		for(int i=n; i<=m; i++) 
		{
			sum=sum+i;
		}
		System.out.printf("%d부터 %d까지의 합 = %d\n", n,m,sum);
		
		sc.close();
*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		
		for(int i=n; i<=m; i++) 
		{
			if(i%3!=0) 
			{
			sum=sum+i;
			}
		}
		System.out.printf("%d부터 %d까지 수중의 3의 배수를 제외한 합 = %d\n", n,m,sum);

		
		
		
		
		
	}

}
