package sec01.exam04;

public class Outter {
	public void method1(final int arg) {
		final int localVariable=1;
		// arg=100; // error
		// localVariable=100; // error
		class Inner{
			public void method() {
				int result = arg+localVariable;
			}
		}
	}
	public void method2(int arg) {
		int localVariable=1;
		// arg=100; // error
		// localVariable=100; // error
		class Inner{
			public void method() {
				int result = arg+localVariable;
			}
		}
	}
}
