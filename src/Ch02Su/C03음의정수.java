package Ch02Su;




//CPU는 가산회로가 존재해서 가산회로에 의해 가산처리(+)를 할 수 있다? OO
//CPU는 감산회로가 존재해서 감산회로에 의해 감산처리(-)를 할 수 있다? X

//보수개념을 도입해서 사용자가 뺄셈요청시 덧셈으로 치환하여 뺄셈과 동일한 결과값을 전달해준다
//10 - 3 =  7
//10 + 7 =  7
//
//75 - 32 =  43
//75 + 68 =  43
//777-222 =  555
//777+778 = 1555
//
//
//
//00000101 = 5   
//11111010 =    (1의보수)
//11111011 = -5 (2의 보수)
//---------------
//100000000 = 0
//        
//2보수값 변환되었을때 왼쪽 끝비트를 부호비트로
//해석합니다.
//왼쪽 끝 비트가 0이라면 양수
//왼쪽 끝 비트가 1이라면 음수

public class C03음의정수 {
	public static void main(String[] args) {
		System.out.printf("%d\n", (byte)(0b10001010));

	



//문제
//10진수		->		2진수
//11			->		00001011
//-11			->      11110101
//111			->
//-111			->
//96			->		01100000
//-96			->		10100000
//
////문제
//2진수		->		10진수
//10001010	-> -128+8+2= -118
//11000101	->
//01110101	->
//11001100	->


//00000000 = 0
//00000001 = 1
//00000010 = 2
//00000011 = 3
//01111111 = 127
//10000000 = -128
//10000001 = -128 + 1
//10000010 = -128 + 2
//10000011 = -125
//10000100 = -128+4
//11111111 = -128+127 = -1

}
}