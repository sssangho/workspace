package thread;

public class ThreadB extends Thread {
	public void run() {
		for(int i=0; i < 2; i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
