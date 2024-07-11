// 클래스 : 공통된 속성과 기능을 정의해둔 것
// [접근제어자] class 클래스명 {속성 , 기능}

class ExampleClass1 {
//	속성 : 클래스가 가질 수 있는 정보나 상태
//	일반적으로 변수로 표현
	int attribute1;
	double attribute2;
	
//	기능 : 클래스가 가질 수 있는 행동이나 작업 (메서드)
//	[접근제어자] 반환티입 메서드명 (매개변수타입 매개변수명[, ...] )
//	{메서드의 기능 구현}
	
	int method (int arg1) {
//		기능구현
//		반환티입이 void가 아니면 반드시 return으로 결과값을 반환해야함
		
		return 0;
	}
}
	
// 스마트폰 
// - 속성 : 제조사(String), 제조일자(String), 모델명(String), 전화번호(String), 어플리스트(String[]), 전원상태(boolean) 
// - 기능 : 전화걸기, 어플설치, 문자보내기, 휴대폰정보보기, 전원누르기

class SmartPhone{
	
//	스마트폰에 대한 속성
	String manufacturer;//제조사
	String manufactureDate; // 제조일자
	String modelName; // 모델명
	String telNumber; //전화번호
	String[] appList = new String[0]; //어플 리스트
	boolean powerStatus; // 전원상태

//	기능
	void printInfo () {
		System.out.println("=======정보=======");
		System.out.println("제조사 : " + manufacturer);
		System.out.println("제조날짜 : " + manufactureDate);
		System.out.println("모델명 : " + modelName);
		System.out.println("전화번호" + telNumber);
	}
	
	void call (String toTelNumber) {
		
		System.out.println(telNumber + "가" + toTelNumber + " 로 전화를 겁니다");
	}
	
	void appInstall (String appName) {
		
		String[] newAppList = new String[appList.length + 1];
		
		for(int i = 0; i < appList.length; i++) {
			newAppList[i] = appList[i];
		}
		newAppList[newAppList.length - 1] = appName;
		appList = newAppList;
		
	}
	
	void sendMsg (String toTelNumber, String message) {
		System.out.println(telNumber + "가" + toTelNumber + "에게" + message + " 발송했습니다.");
	}
	
	void pressPowerButton () {
		
		powerStatus = !powerStatus;
		
	}
	
}

public class ClassAndObject {
	
	
	public static void main(String[] args) {
		
		
		

	}

}
