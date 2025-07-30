package sec01.exam01;

public class TryCatchEx1 {

	public static void main(String[] args) {
		try {
			Class.forName("asdfasfasf");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("언제나 실행!");
		}
	}
}
