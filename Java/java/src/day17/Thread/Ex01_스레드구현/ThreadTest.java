package day17.Thread.Ex01_스레드구현;

/*
 * 스레드 구현 방법 1
 * → Thread 클래스 상속하기
 */

class MyThread extends Thread {
	
	/*
	 * 스레드가 실행할 코드를 정의
	 * → MyThread 라는 스레드를 객체로 생성하여
	 *   start() 메소드 호출 시, 실행할 코드를 정의한다.
	 */

	@Override
	public void run() {
		
		// 200번 반복하면서 현재 어떤 스레드가 CPU 점유하고 있는지 확인
		for (int i = 0; i <= 200; i++) {

			// 현재 실행 중인 스레드 이름
			String threadName = Thread.currentThread().getName();
			System.out.println(i + " : " + threadName);
		}
	}
	
}

public class ThreadTest {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		MyThread thread1 = new MyThread();
		
		// [스레드N].start(); 새로운 스레드N이 생성되어 run() 메소드를 실행
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.start();
		
		System.out.println("끝");
		
		/*
		 * 결론 : 스레드는 한 번에 하나씩만 수행할 수 있다.
		 * 스레드가 동시에 수행되는 것처럼 보여도 실제로는 CPU가 빠른 속도로 스레드들을 교체하면서 명령어를 처리한다.
		 * → 시분할 처리 : CPU
		 * → 병렬 처리 : GPU
		 */
		
		return;
	}

}
