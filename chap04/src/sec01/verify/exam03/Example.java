package sec01.verify.exam03;

public class Example {
	public static void main(String[] args) {
		int score=85;
		System.out.print("등급은 ");
		if(score<70){
			System.out.print("D");
		} else if(score<80){
			System.out.print("C");
		} else if(score<90){
			System.out.print("B");
		} else{
			System.out.print("A");
		}
		System.out.print("입니다.");
	}
}
