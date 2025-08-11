package ramda;

public class Main {

	public static void main(String[] args) {
		FunctionalInterf fi = new FunctionalInterf() {
			
			@Override
			public void anyMethod() {
				System.out.println("anyMethod()");
			}
		};
		
		FunctionalInterf fi1 = () -> {
				System.out.println("anyMethod()");
			};
			
		fi.anyMethod();
		fi1.anyMethod();
	}

}
