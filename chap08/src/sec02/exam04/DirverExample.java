package sec02.exam04;

public class DirverExample {

	public static void main(String[] args) {
		Driver driver=new Driver();
		
		Bus bus=new Bus();
		Taxi taxi=new Taxi();

		driver.drive(bus);
		driver.drive(taxi);
		
	}

}
