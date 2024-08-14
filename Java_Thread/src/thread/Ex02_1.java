package thread;

// 2. Runnable 인터페이스를 구현한 클래스로부터 작업스레드 구현
class MyThread2_1 implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			
			System.out.println(Thread.currentThread().getName());
			// Thread.currentThread(): 현재 실행중인 스레드를 반환한다.
			
		}
		
	}
	
}

public class Ex02_1 {

	public static void main(String[] args) {
		
		// Runnable 인터페이스를 상속받은 클래스의 객체를 생성
		Runnable run = new MyThread2_1();
		
		// Thread 클래스로부터 객체를 생성할때
		// Runnable 인터페이스를 상속받은 클래스의 객체를
		// 생성자의 매개값으로 주어 작업스레드 객체를 생성
		Thread myThread = new Thread(run);
		
		myThread.start();
		
		System.out.println("main 스레드");
		
		// 스레드 방식이 2가지 인데
		// 간단한 1번째 방식( Thread 상속받아서 )으로 하면되는데
		// 왜 번거롭게 Runnable 을 방식으로 하는 이유는
		// 1번은 다중 상속을 받을수 없기 때문에
		// 2번은 상속받을게 있으면 아래와 같이 인터페이스를 구현하고 상속 받으면 된다.
		// ex ) class MyThread2 extends A implements Runnable { ... }
	}
}