package sec01.exam01;

class G {
	void gmethod() {}
}

class H {
	void hmethod() {
		G g = new G();
		g.gmethod();
	}
}

interface D {}

class E implements D {}
class F implements D {}

class A {
	D d1 = new E();
	D d2 = new F();
}

class B {
	A a;
}

class C extends A {
	
}
public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
