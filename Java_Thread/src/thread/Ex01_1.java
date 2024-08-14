package thread;

// 1. Thread 클래스를 상속한 자식클래스로부터 작업스레드 구현
class MyThread1_1 extends Thread {
	
	// run 메소드를 오버라이딩 하여 작업코드를 작성
	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			System.out.println("나의 첫번째 스레드");
		}
		
	}
}

public class Ex01_1 {

	public static void main(String[] args) {
		
		// 작업 스레드 객체 생성
		MyThread1_1 myThread = new MyThread1_1();
		
		// 스레드 이름 가져오기
		String name = myThread.getName();
		System.out.println(name);
		
		// 스레드 이름 변경하기
		myThread.setName("나의 첫번째 스레드");
		System.out.println(myThread.getName());
		

		
	}
}