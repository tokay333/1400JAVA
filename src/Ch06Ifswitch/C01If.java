package Ch06Ifswitch;

import java.util.Scanner;

public class C01If {

	public static void main(String[] args) {
		//단순 IF
		//if(조건식)
		//{
		//	참인 경우 실행되는 코드;
		//}
		
		int age=7;
//		
//		if(age>=8)
//		{
//			System.out.println("취학 아동입니다");
//		}
//		System.out.println("첫번째 IF문 벗어남");
//		if(age<8)
//		{
//			System.out.println("미취학 아동입니다");
//		}
//		System.out.println("두번째 IF문 벗어남");
//		System.out.println("프로그램을 종료합니다");
		
		
		//IF-ELSE문
		//if(조건식)
//		{
//			//참인 경우 실행될 코드
//		}
//		else
//		{
//			//거짓인 경우 실행될 코드
//		}
		
//		if(age>=8)
//		{
//			System.out.println("취학 아동입니다");
//		}
//		else
//		{
//			System.out.println("미취학 아동입니다");
//		}
//		System.out.println("프로그램을 종료합니다");
		
		
		//문제
		//정수 하나를 받아서 짝수면 "짝수입니다"
		//홀수면 "홀수입니다"를 출력하세요
		
//		Scanner sc = new Scanner(System.in);
		
//		int num1 = sc.nextInt();
//		if(num1%2==0)
//		{
//			System.out.println("짝수입니다");
//		}
//		else
//		{
//			System.out.println("홀수입니다");
//		}
		
		//문제
		//정수 하나를 받아서 3의배수면 "3의배수입니다"
		//4의 배수면 "4의 배수 입니다"를 출력하세요
		
//		int num2 = sc.nextInt();
//		
//		if(num2%3==0)
//		{
//			System.out.println("3의 배수입니다");
//		}
//		if(num2%4==0)
//		{
//			System.out.println("4의 배수입니다");
//		}	
					
			
		
		//문제
		//두 정수를 입력받아서 큰수를 출력하세요(IF-ELSE)
		
//		int num3 = sc.nextInt();
//		int num4 = sc.nextInt();
//		
//		if(num3>num4)
//		{
//			System.out.println("큰수 : " + num3);
//		}
//		else
//		{
//			System.out.println("큰수 : " + num4);
//		}
		
		
		//3의 배수이면서 4의 배수라면 출력
		//3의 배수가 아니면서 5의 배수라면 출력
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
		
//		if(num%3==0)
//		{
//			//3의 배수인 경우
//			if(num%4==0) 
//			{
//				System.out.println("3의 배수이면서 4의 배수");
//			}
//		}
//		else 
//		{
//			//3의 배수가 아닌경우
//			if(num%5==0) 
//			{
//				System.out.println("3의 배수가 아니면서 5의 배수");
//			}
//		}
		
//		if(num%3==0 && num%4==0) 
//		{
//			System.out.println("3의 배수이면서 4의 배수");
//		}
//		else 
//		{
//			//3의 배수 또는 4의 배수가 아닌 경우
//		}
//		if(num%3!=0 && num%5==0) 
//		{
//			System.out.println("3의 배수가 아니면서 5의 배수");
//		}
		
		//ELSE-IF문
		//예제
		//국어, 영어, 수학 각각의 점수가 40점 이상이 되어야 하고, 총평균이 60점 이상이 되면 "합격" 출력, 아니라면 "불학격" 출력
		
		//국어가 40점 이하냐?	-> 불합격
		//영어가 40점 이하냐?	-> 불합격
		//수학이 40점 이하냐?	-> 불합격
		//평균이 60점 미만이냐?	-> 불합격
		//아니라면 -> 합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국, 영, 수 입력 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		double avg = (double)(kor+eng+mat)/3;
		
		if(kor<40) 
		{
			System.out.println("불합격!");
		}else if(eng<40) 
		{
			System.out.println("불합격!");
		}else if(mat<40) 
		{
			System.out.println("불합격!");
		}else if(avg<60.0) 
		{
			System.out.println("불합격!");
		}else 
		{
			System.out.println("합격!");
		}
		
		
		
	
		//문제(강사와 같이 합니다)
		//세 정수를 입력 받아서 큰수를 출력하세요(단순 IF문으로만)
		
		
		
		
		
		

	}

}
