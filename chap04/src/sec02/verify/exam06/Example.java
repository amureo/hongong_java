package sec02.verify.exam06;

public class Example {
	public static void main(String[] args) {
		for(int i=0;i<4;i++){
			for(int j=3;j>i;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
