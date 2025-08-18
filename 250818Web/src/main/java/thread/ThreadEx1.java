package thread;

class Task2 extends Thread {

	@Override
	public void run() {
		for (int i=0; i < 5; i++) {
			System.out.print("삐");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Task1 implements Runnable {

	@Override
	public void run() {
		for (int i=0; i < 5; i++) {
			System.out.print("삐");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		Thread th = new Thread(new Task1());  // 인터페이스
		th.start();
		
		Thread th1 = new Task2();  // 상속 
		th1.start();
		
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i=0; i < 5; i++) {
					System.out.print("삐");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		th2.start();

		for (int i=0; i < 5; i++) {
			System.out.print("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
