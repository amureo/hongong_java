package sec04.verify.exam03;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("[필수 정보 입력");

		System.out.print("이름 : ");
		String name=scanner.nextLine();

		System.out.print("주민번호 앞 6자리 : ");
		String birth=scanner.nextLine();

		System.out.print("전화번호 : ");
		String tel=scanner.nextLine();

		System.out.println();

		System.out.println("[입력한 내용");
		System.out.println("1. 이름: "+name);
		System.out.println("2. 주민번호 앞 6자리: "+birth);
		System.out.println("3. 전화번호: "+tel);
	}
}
