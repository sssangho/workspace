package sec01.exam04;

public class MyClass {
	
	RemoteControl rc = new Television(); // TV
	
	MyClass() {
		
	}

	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();  // 지역변수
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) { // 매개 변수의 다형성
		rc.turnOn();
		rc.setVolume(5);
	}
	
}
