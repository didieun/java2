package thread;

class Food extends Thread {
	
	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			System.out.println("음식을 먹습니다. i: " + i);
		}
		
	}
}

class Music extends Thread {
	
	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			System.out.println("음악을 듣습니다. i: " + i);
		}
		
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		System.out.println("!! 메인 시작 !!");
		
		Food food = new Food();
		Music music = new Music();
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		// 스레드에 우선순위를 지정하여 실행제어를 할 수 있다.
		// 정수로 표현하며 가장 높은 우선순위는 10
		// 가장 낮은 우선순위는 1, 기본값은 5이다.
		// 우선순위가 높을수록 더 많은 시간을 확보할 수 있다.
		
		// 가장 높은 우선순위로 지정(100% 는 아니고 일단 요청은 한다) 더 많은 시간을 확보해준다 
		food.setPriority(Thread.MAX_PRIORITY);
		
		// 가장 낮은 우선순위로 지정 (100% 는 아니고 일단 요청은 한다)
		music.setPriority(Thread.MIN_PRIORITY);
		
		food.start();
		music.start();
		
		try {
			
			food.join(); // main 스레드가 food 의 작업이 끝날때까지 대기
			music.join(); // main 스레드가 music 의 작업이 끝날때까지 대기
			
		} catch(Exception e) {}
		
		System.out.println("!! main 끝 !!");

	}
}