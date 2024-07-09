package chapter1;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int inputNumber = scan.nextInt();
		System.out.println("입력하신 숫자는 : " + inputNumber + " 입니다.");
		scan.close();
		

	}

}
