package chapter1;

public class Valiable {

public static void main(String[] args) {
		
		// 변수 (variable)
		// 데이터를 메모리에 저장하는데 사용하는 기본 요소
		// 변수를 생성(선언)할 때는 반드시 해당 변수가 어떤 형태의 데이터를 가질 수 있는지 지정해야함
		
		// 선언(생성) 방법
		// 데이터타입 변수명;
		int number1;	// 정수를 담을 수 있는 number1이라는 이름을 가지는 메모리 공간을 생성
		
		// 초기화(초기값을 넣는) 방법
		// 변수 = 데이터;
		number1 = 9;	// number1이라는 메모리 공간에 9라는 데이터를 초기값으로 넣음
		
		// 선언과 동시에 초기화 방법
		// 데이터타입 변수명 = 데이터;
		int number2 = 37;	// 정수를 담을 수 있는 number2 라는 이름을 가지는 메모리 공간을 생성하고 그 공간에 초기값 37을 넣음

		System.out.println(number1);
		System.out.println(number2);
		
		// 변수는 선언 후 반드시 초기화 이후에 사용할 수 있음
		// int number3;
		// System.out.println(number3);
		
		// 변수에 지정된 타입의 데이터가 아니면 할당이 불가능
		// int number3 = 3.14;
		
		number1 = 12;	// 처음 변수에 값을 할당하는 행위가 아니기 때문에 해당 코드는 초기화가 아님
		System.out.println(number1);
//		
//		// 비문법상의 규칙
//		// 1. 띄워쓰기 규칙
//		// web site address 
//		// - Camel Case : 띄워쓰기를 표현 할 때 띄워쓰기를 제거하고 바로앞글자를 대문자로 표시
//		String WebSiteAddress;
//		// -Snake Case: 띄워쓰기를 표현할 때 띄워쓰기 자리에 _로 표시
//		String web_site_address;
//		 - Upper : 대문자 표시
//		 - Lowwer : 소문자 표시
		
//		 UpperCamelCase : 클래스, 인터페이스 (첫문자를 대문자로 시작)
//		 lowerCamelCase : 변수, 함수, 메서드 (첫문자를 소문자로 시작)
//		 UPPER_SANKE_CASE : 상수형(변경 불가형) 변수
//		 lower_snake_case : 변수, 함수, 메서드(모든 문자를 소문자로 작성)
		
		// 상수 (CONSTANT)
		// 초기화가 이루어지면 변경이 불가능한 변수
		// 변수 선언 시에 데이터 타입 앞에 final 키워드를 붙여서 선언
		// final 데이터타입 변수명(상수명);
		final int MAX;
		MAX = 100;
		// 상수 선언과 동시에 초기화
		final int MIN = 100;
		


		
	}


}
