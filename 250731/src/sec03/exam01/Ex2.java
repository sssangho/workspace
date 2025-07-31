package sec03.exam01;

interface AA {
	int method(String s);
}

class BB implements AA {

	@Override
	public int method(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

}
public class Ex2 {

	public static void main(String[] args) {
		AA a = new BB();

	}

}
