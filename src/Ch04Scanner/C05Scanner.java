package Ch04Scanner;

import java.util.Scanner;

public class C05Scanner {

	public static void main(String[] args) {
//		이름을 입력하세요 : 홍길동
//		홍길동 님의 나이를 입력하세요 : 34
//		홍길동 님의 주소를 입력하세요 : 대구광역시 달서구 ~~0동
//		
//		[PROFILE]
//		이름 : 홍길동
//		나이 : 34 세
//		주소 : 대구광역시 달서구 ~~0동
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : " );
		String str = sc.next();
		System.out.print("홍길동 님의 나이를 입력하세요 : " );
		String str1 = sc.next();
		System.out.print("홍길동 님의 주소를 입력하세요 : " );
		sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println("[PROFILE]");
		System.out.printf("이름 : %s\n", str);
		System.out.printf("나이 : %s 세\n", str1);
		System.out.printf("주소 : %s\n", str2);

		
//		--------------------------------------------------------
//		문제
//		--------------------------------------------------------
//		1 Scanner 를 이용해서 키보드로 입력한 두수를 덧셈하여 결과를 출력해보세요
//
//		[예시]
//		----------------------------
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("첫번째 수 : ");
//		String strNum1=_____________;
//
//		System.out.print("두번째 수 : ");
//		String strNum2=_____________;
//
//		int num1 = ________________;
//		int num2 = ________________;
//
//		int result = num1 + num2;
//		System.out.println("덧셈 결과 : " + result);
//		----------------------------

		
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println("덧셈 결과 : " + sum);
		
		
//		2 Scanner를 이용해서 이름, 주미번호 앞 6자리 , 전화번호를 키보드에서
//		입력받고 출력하는 코드를 작성해보세요
//
//
//		[예시]
//		----------------------------
//		[필수 정보 입력]
//		1. 이름 : ______________ENTER
//		2. 주민번호 6자리 : ______________ENTER
//		3. 전화번호 : ____________ENTER
//
//		[입력한 내용]
//		이름 : 홍길동
//		주민번호 : 123456
//		PH : 010-222-3333
//		----------------------------

		System.out.println("[필수정보입력]");
		System.out.print("1. 이름 : " );
		String str4 = sc.next();
		System.out.print("2. 주민번호 6자리 : " );
		String str5 = sc.next();
		System.out.print("3. 전화번호 : " );
		String str6 = sc.next();
		
		System.out.println("[입력한 내용]");
		System.out.printf("이름 : %s\n", str4);
		System.out.printf("주민번호 : %s\n", str5);
		System.out.printf("PH : %s\n", str6);

		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
