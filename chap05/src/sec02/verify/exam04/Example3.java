package sec02.verify.exam04;

public class Example3{
	public static void main(String[] args){
		int max=0;
		int[] array={1,5,3,8,2};
		for(int item : array){
			max=(max<item)?item:max;
		}
		System.out.println("max : "+max);
	}
}