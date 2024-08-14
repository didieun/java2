package thread;

class EatThread extends Thread {
	
	@Override
	public void run() {
		
		try {
			while(true) {
				
				System.out.println("식사를 하는중..");
				sleep(1000);
				// sleep 은 무조건 예외처리를 해줘야됨

			}
		} catch(InterruptedException e) { // interrupt 을 실행하면 InterruptedException 예외처리가 발생되며 종료
			
			System.out.println("식사를 마칩니다.");
			
		}
		
	}
	
}

public class Ex06 {

	public static void main(String[] args) {
		
		EatThread eatThread = new EatThread();
		
		eatThread.start();
		
		try {
			Thread.sleep(5000);
			
		} catch(InterruptedException e) {
			
		}
		
		eatThread.interrupt();
		// 스레드가 일시정지 상태에 있을때 이 스레드에 대해서
		// interrupt 메소드를 호출하면 이 스레드는 실행 대기상태로 바뀐다.
		// 즉 멈춰있던 스레드를 깨워서 실행가능한 상태로 만드는 것이다.
		
	}
}