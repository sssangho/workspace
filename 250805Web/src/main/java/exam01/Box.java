package exam01;

public class Box {
	private Object object; // Object 클래스는 모든 클래스의 조상
	
	public void set(Object object) { // setter
		this.object = object;
	}
	
	public Object get() { //getter
		return object;
	}
}
