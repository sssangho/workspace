package dp.templateMethod;

public class Main {

	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('가');  // 쌍따움표가 아닌 따움표
		d1.display();
		
		d1 = new StringDisplay("Hello");
		d1.display();
	}
}
