package sec01.jdbc;

import javax.swing.JFrame;

interface InterTest{
	void method();
}
public class MyFrame extends JFrame {

	public static void main(String[] args) {
		InterTest it = new InterTest() {

			@Override
			public void method() {
				System.out.println("method");
				
			}
		};
		it.method();
	}

}
