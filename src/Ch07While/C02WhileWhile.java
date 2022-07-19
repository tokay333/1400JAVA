package Ch07While;

public class C02WhileWhile {

	public static void main(String[] args) {
		
		//전체 구구단출력(2-9단)
//		int dan=2;
//		int i;
//		while(dan<=9) 
//		{
//			i=1;
//			while(i<=9) 
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		// 문제
		// 2 x 9 = 18
		// 2 x 8 = 16
		// ...
		// 9 x 1 = 9
		
//		int dan=2;
//		int i;
//		while(dan<=9) 
//		{
//			i=9;
//			while(i>=1) 
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}
		
				
		// 문제
		// 9 x 9 = 81
		// ...
		// 2 x 1 = 2
		
//		int dan=9;
//		int i;
//		while(dan>=2) 
//		{
//			i=9;
//			while(i>=1) 
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		//별찍기
		//*****
		//*****
		//*****
		//*****
		
//		int i=0; //줄바꿈
//		int j=0; //별
//		
//		while(i<4) 
//		{
//			j=0;
//			while(j<5) 
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		//*
		//**
		//***
		//****
		
//		int i=0;
//		int j=0;
//		
//		while(i<4) 
//		{
//			j=0;
//			while(j<=i) 
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//****
		//***
		//**
		//*
		
//		int i=0;
//		int j=0;
//		
//		while(i<4) 
//		{
//			j=3;
//			while(j>=i) 
//			{
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
		
				
		
		//   *
		//  ***
		// *****
		//*******
		
//		i(행)	j(공백)	k(별)
//		0		0-2		0-0
//		1		0-1		0-2
//		2		0-0		0-4
//		3		x		0-6
//		-------------------------------
//				j=0		k=0
//				j++		k++
//				j<=2-i	k<=2*i

/*		int i=0;
		int j=0;
		int k=0;
				
		while(i<4) 
		{
			j=0;
			while(j<=2-i) 
			{
				System.out.print(" ");
				j++;
			}
			k=0;
			while(k<=2*i) 
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
*/		
		
		//*******
		// *****
		//  ***
		//   *

		//	i(행)	j(공백)	k(별)
		//	0		x		0-6
		//	1		0-0		0-4
		//	2		0-1		0-2
		//	3		0-2		0-0
		//	----------------------------------
		//			j=0		k=0
		//			j++		k++
		//			j<=i-1	k<=6-2*i
		
		
/*		int i=0;
		int j=0;
		int k=0;
		
		while(i<4) 
		{
			j=0;
			while(j<=i-1) 
			{
				System.out.print(" ");
				j++;
			}
			k=0;
			while(k<=6-2*i) 
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
*/		
		
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
		//	i(행)	j(공백)	k(별)
		//	0		0-2		0-0
		//	1		0-1		0-2
		//	2		0-0		0-4
		//	3		x		0-6
		//	----------------------------------
		//			j=0		k=0
		//			j++		k++
		//			j<=2-i	k<=2*i
		
		//	4		0-0		0-4
		//	5		0-1		0-2
		//	6		0-2		0-0
		//	----------------------------------
		//			j=0		k=0
		//			j++		k++
		//			j<=i-4	k<=12-(2*i)
		
/*		int i=0;
		int j=0;
		int k=0;
		
		while(i<7) 
		{
			if(i<4) 
			{
				j=0;
				while(j<=2-i) 
				{
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=2*i) 
				{
					System.out.print("*");
					k++;
				}				
				System.out.println();
				i++;
			}
			
			else 
			{
				j=0;
				while(j<=i-4) 
				{
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=12-(2*i)) 
				{
					System.out.print("*");
					k++;
				}
				System.out.println();
				i++;
			}
		}
*/		
		
		
		
		
		

	}

}
