package thread;

// 1. Thread 클래스를 상속한 자식클래스로부터 작업스레드 구현
class MyThread1 extends Thread {
	
	// run 메소드를 오버라이딩 하여 작업코드를 작성
	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			System.out.println("나의 첫번째 스레드");
		}
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		// 작업 스레드 객체 생성
		MyThread1 myThread = new MyThread1();
		
		
//		myThread.run(); // 마지막에 "main 스레드" 가 온다
		myThread.start(); // 맨처음에 "main 스레드" 가 온다
		// run 메소드가 호출되면서 독립적인 호출스택이 생성되고
		// 스레드가 종료되면 작업에 사용된 호출스택은 소멸된다.
		
		System.out.println("main 스레드");
		
	}
}