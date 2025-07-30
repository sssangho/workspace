package sec02.exam04;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
//		Vehicle v1 = bus; 
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
