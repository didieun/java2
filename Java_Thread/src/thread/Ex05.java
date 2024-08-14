package thread;

import java.util.Scanner;

//스레드가 효율적으로 언제 사용되는지..?
// 굳이 여러개를 만든는 이유가..?

class MyThread3 extends Thread {
	
	@Override
	public void run() {
		
		for(int i = 10; i >= 0; i--) {
			
			try {
				
				Thread.sleep(1000);
				// sleep 메소드는 지정된 시간동안
				// 스레드를 일시정지 상태로 만든다.
				System.out.println(i);
				
			} catch(InterruptedException e) {
				
			}
		}
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		// 스레드를 효율적으로 하는 방법!
		// 두 스레드가 서로 다른작업을 하는 경우에는 멀티스레드가 효율적이다.
		// 예) 사용자로부터 입력을 받는 작업을 하는 경우 입력을 기다리는 동안
		// 다른 스레드에서는 다른 작업을 할 수 있다.
		
		MyThread3 myThread = new MyThread3();
		
		myThread.start();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요.");
		
		String str = scan.next();
		
		System.out.println(str);

	}
}