package sec01.exam01;

public class Single1Ex {

	public static void main(String[] args) {
//		Single1 sg2 = Single1.s1();
//		Single1 sg = new Single1();
		Single1 sg = Single1.getS1();
		Single1 sg1 = Single1.getS1();
		if (sg == sg1) {
			System.out.println("같은 객체");
		}

	}

}
