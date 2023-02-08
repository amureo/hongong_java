package sec01.exam03;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return 3.14159*r*r;
	}
}
