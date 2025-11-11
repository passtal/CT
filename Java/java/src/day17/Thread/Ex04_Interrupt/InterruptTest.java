package day17.Thread.Ex04_Interrupt;

public class InterruptTest extends Thread {

	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(3000);
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("스레드 끝");
	}
	
	public static void main(String[] args) throws InterruptedException {
		InterruptTest test = new InterruptTest();
					
		test.start();
		Thread.sleep(3000);
		
		// interrupt → Not Runnable 인 상태의 스레드를 Runnable 상태가 되도록 요청하는 것
		
		// Runnable 상태 ↔ Not runnable 상태 전환 (R → 작업중지요청 / NR → R 상태로 변경)
		test.interrupt();
	}

}
