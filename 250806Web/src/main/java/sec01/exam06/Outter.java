package sec01.exam06;
// exam06 : 중첩 클래스의 접근 제한 - 중첩클래스에서 바깥 클래스 참조 얻기
public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
	
	public static void main(String[] args) {
		Outter.Nested nested = new Outter().new Nested();
		nested.print();
	}
}
