package sec02.verify.exam09;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		double value1=Double.parseDouble(sc.next());
		System.out.print("두 번째 수: ");
		double value2=Double.parseDouble(sc.next());
		System.out.println("-----------------");
		System.out.println("결과: "+((value2==0.0 || value2==0)?"무한대":value1/value2));
	}
}
