package sec04.exam04;

public class QStopExample {
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode=System.in.read();
			System.out.println("keycode: "+keyCode);
			if(keyCode==113) {
				break;
			}
		}
	}
}
