package sec02.verify.exam04;

public class Example {
	public static void main(String[] args) {
		int pencils=534;
		int students=30;

		int pencilsPerStudent=pencils/students;
		System.out.println(pencilsPerStudent);

		int pencilsLeft=pencils%students;
		System.out.println(pencilsLeft);
	}
}
