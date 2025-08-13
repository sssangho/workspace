package thread;

public class BeepTask2 extends Thread {

	@Override
	public void run() {
		for( int i =0; i<5; i++) {
			System.out.print("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 0.5초 지연 500ms
		}
	}
}
