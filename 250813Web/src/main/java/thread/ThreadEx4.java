package thread;

import java.util.stream.IntStream;

public class ThreadEx4 {

	public static void main(String[] args) {
//		Thread th = new Thread(new Runnable() {  // 익명의 구현객체
//			
//			@Override
//			public void run() {
//				for( int i =0; i<5; i++) {
//					System.out.print("띵");
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					} // 0.5초 지연 500ms
//				}
//			}
//		});
//		th.start();
		
		// 람다식으로 변경하기
//		Thread th = new Thread(() -> {
//			for( int i =0; i<5; i++) {
//				System.out.print("띵");
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} // 0.5초 지연 500ms
//			}
//		});
//		th.start();
		
		// 스트림으로 변경하기
	
		Thread th = new Thread(() -> {
			IntStream.rangeClosed(1, 5).forEach((i) -> {
				System.out.print("띵"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 0.5초 지연 500ms
			});
		});

//		th.start();
		
		for( int i =0; i<5; i++) {
			System.out.print("삐");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 0.5초 지연 500ms
		}
	}
}
