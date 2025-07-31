package sec02.verify.exam02;

public class SnowTireExample {

	public static void main(String[] args) {
		Tire tire1 = new SnowTire();
		if(tire1 instanceof SnowTire) {
			SnowTire snowTire1 = (SnowTire) tire1;
			System.out.println("클래스 타입 변환됨");
		} else {
			System.out.println("클래스 타입 변환 안됨");
		}
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}
}
