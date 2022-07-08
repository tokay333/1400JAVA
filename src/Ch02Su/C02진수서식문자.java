package Ch02Su;

public class C02진수서식문자 {


public static void main(String[] args)
{

	//접두사
	//0		: 8진수
	//0X	: 16진수
	//0b	: 2진수
	//10진수로 변환
	System.out.printf("10진수로 변환 : %d\n", 0b00001111);
	System.out.printf("10진수로 변환 : %d\n", 173);		
	System.out.printf("10진수로 변환 : %d\n", 0255);		
	System.out.printf("10진수로 변환 : %d\n", 0xAD);		
	
	//8진수로 변환
	System.out.printf("8진수로 변환 : %o\n", 173);		
	System.out.printf("8진수로 변환 : %o\n", 0255);		
	System.out.printf("8진수로 변환 : %o\n", 0xAD);
	
	//16진수로 변환
	System.out.printf("16진수로 변환 : %x\n", 173);		
	System.out.printf("16진수로 변환 : %x\n", 0255);		
	System.out.printf("16진수로 변환 : %x\n", 0xAD);
	
	
}
}