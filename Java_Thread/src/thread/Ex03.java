package thread;

public class Ex03 {

	public static void main(String[] args) {
		
		// Runnable 인터페이스의 익명클래스를 만든다.
		// run 메소드를 오버라이딩 하여 실행 코드를 작성한다.
		// "나의 세번째 스레드" 100번 출력
		
		// Thread 클래스로부터 객체를 생성할때 
		// Runnable 인터페이스 타입의 익명객체를 넣어서 생성한다.
		// start 메소드를 호출하여 독립적인 스레드를 실행시킨다.
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0; i < 100; i++) {
					System.out.println("나의 세번째 스레드");
				}
				
			}
		};
		
		Thread myThread = new Thread(run);
		
		myThread.start();

	}
}