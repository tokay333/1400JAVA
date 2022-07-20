package Ch09ClassBasic;

import java.util.Scanner;
/*
class SumCal
{
	//멤버변수
	Scanner sc = new Scanner(System.in);
	
	
	//인자 o , 반환 o
	int sum1(int x,int y) {
		return x+y;
	}
	//인자 o , 반환 x
	void sum2(int x, int y) {
		System.out.println("void sum2(x,y) = " + (x+y));
	}
	//인자 x , 반환 o
	int sum3()
	{
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		 
		return x+y;
	}
	//인자 x , 반환 x
	void sum4()
	{	 
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("void sum4(x,y) = " + (x+y));
	}
}
*/
class Subclass
{
	//속성
		Scanner sc = new Scanner(System.in);
		// [문제] sub1, sub2, sub3, sub4 함수를 만들어보고 메인메서드에서 사용
		// void sub1 ()
		// void sub2 (int x, int y)
		// int sub3 (int x, int y)
		// int sub4 ();
		
		void sub1() 
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println("void sub1(x,y) : " + (x-y));
		}
		void sub2(int x, int y) 
		{
			System.out.println("void sub2(x,y) : " + (x-y));
		}
		int sub3(int x, int y) 
		{
			return x-y;
		}
		int sub4() 
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			return x-y;
		}

}

/*
public class C06MethodTest {

	public static void main(String[] args) {
		
		//객체 생성
		SumCal obj1= new SumCal();
		
		//함수호출
		int result = obj1.sum1(10,20);
		System.out.println("sum1(10,20) = " + result);
		
		obj1.sum2(30, 40);
		
		int result3 = obj1.sum3();
		System.out.println("sum3() = " + result3);
		
		obj1.sum4();
*/

public class C06MethodTest {

	public static void main(String[] args) {
		
		//객체 생성
		Subclass obj2= new Subclass();
		
		//함수호출
		obj2.sub1();
				
		obj2.sub2(40, 30);
		
		int result3 = obj2.sub3(40, 30);
		System.out.println("sub3(40, 30) = " + result3);
		
		int result4 = obj2.sub4();
		System.out.println("sub4() = " + result4);

	}

}
