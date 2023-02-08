package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class C {
	public void method() {
		A a=new A(); // error
		a.field="value"; // error
		a.method(); // error
	}
}
