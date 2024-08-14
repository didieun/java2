package thread;

// 데몬스레드는 일반스레드의 작업을 돕는 보조적인 역할을 하는 스레드이다.
// 일반스레드가 모두 종료되면 데몬스레드는 강제적으로 자동 종료된다.
// 데몬스레드는 무한루프와 조건문을 이용해서 대기하고 있다가 특정조건이
// 만족되면 작업을 수행하고 다시 대기하도록 작성한다.

class MyDaemon extends Thread {
	
	public int playTime;
	
	@Override
	public void run() {
		
		// 일반 스레드
		while(true) {
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {}
			
			if(playTime == 60) {
				System.out.println("게임을 플레이 한지 1시간이 지났습니다.");
			}
			
			if(playTime == 90) {
				System.out.println("게임을 플레이한지 1시간 30분이 지났습니다.");
			}
		}
	}
}

public class Ex07 {

	public static void main(String[] args) throws Exception {
		
		MyDaemon daemon = new MyDaemon();
		
		daemon.setDaemon(true); // 데몬스레드 지정
		// 데몬스레드는 스레드를 생성한 다음에 실행하기 전에
		// setDaemon 메소드를 호출하여 true 로 명시한다.
		
		daemon.start();
		
		for(int i = 10; i <= 120; i += 10) {
			
			Thread.sleep(1000);
			System.out.println(i + "분 동안 게임을 플레이중...");
			
			if(i == 60) {
				daemon.playTime = 60;
			}
			
			if(i == 90) {
				daemon.playTime = 90;
			}
			
		}

		System.out.println("게임을 종료합니다.");
		
	}
}