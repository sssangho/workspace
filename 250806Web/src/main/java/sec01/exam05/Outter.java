package sec01.exam05;
// exam05 : 중첩 클래스의 접근 제한 - 로컬 클래스에서 사용제한
public class Outter {
	public void method1(int arg) {
		int var = 1;  // 특성상 final
//		arg = arg + 200; // final arg
//		var = 2;
		class Inner {
			public void method() {
				int result = arg + var;
			}
		}
	}
}
