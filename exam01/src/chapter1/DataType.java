package chapter1;

public class DataType {

	public static void main(String[] args) {
		
//		기본형 데이터 타입
//		정수형 데이터 타입: 실수부가 존재하지 않는 정수를 나타냄(부호를 가지고 있음)

//		byte : 1byte = 8bit의 크기를 가지는 정수형 데이터 타입 -128 ~ 127까지의 크기(255)를 가짐
		byte byte1 = -128;
//		byte1 = 128; 데이터 타입의 크기를 넘어가는 값을 넣을 경우 오류발생

		// short : 2byte = 16bit 크기를 가지는 정수형 데이터 타입 -32,768 ~ +32,767까지의 크기(65,535)를 가집
		short short1 = 128;
		short1 = 32767;
//		short1 = 32768; 데이터 타입의 크기를 넘어가는 값을 넣을 경우 오류발생
		
//		int : 4byte = 32bit의 크기를 가지는 정수형 데이터 타입 
		int int1 = 32_768;
		int1 = 2_147_483_647;
//		정수형 리터럴 상수는 int 타입
//		int1 = 2_147_483_648L;
		
//		long : 8byte = 64bit의 크기를 가지는 정수형 타입
		long long1 = 3_000_000_000L;
		
//		int 형태의 정수 타입이 가장 많이 사용됨
//		byte 나 short 타입의 형태는 메모리 공간을 절약할대 사용되는 정수형 타입
//		큰 수를 다룰때 사용되는 정수형 타입 :  long
		
//		정수형  int를 연산 결과를 저장하는 데이터 타입                                                                                                             으로 사용할 때는
//		연산 결과가 범위를 초과할 수 있는지 주의할 필요가 있음
		int a = 200000, b = 300000;
		int result = a + b;
		System.out.println(result);
		result = a * b;
		System.out.println(result);
		
//		실수형 데이터 타입 : 실수부를 가지는 데이터 타입
		
//		float : 4byte = 32bit의 크기를 가지는 실수형 데이터 타입 
//		소수점 6 ~ 7 자리에서 오차발생 
//		실수형 리터럴 상수는 double 타입
		float float1 = 3.14159265358979323846265008f;
		System.out.println(float1);
		
//		double : 8byte = 64bit의 크기를 가지는 실수형 데이터 타입
//		소수점 15 ~ 17 자리에서 오차발생
		double double1 = 3.149265358979323846265008;
		System.out.println(double1);
		
		
	}

}
