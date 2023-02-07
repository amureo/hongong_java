package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {
	public static void main(String[] args) {
		A a=new A();

		a.field1=1;
		a.field2=1; //error
		a.field3=1; //error

		a.method1();
		a.method2(); //error
		a.method3(); //error
	}
}
