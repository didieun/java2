package api;

public class Ex03 {

	public static void main(String[] args) {
		
		long time1 = System.currentTimeMillis();
		// 현재 시간을 읽어서 밀리센컨드값을 long 으로 반환

		System.out.println(time1);
		
		long time2 = System.nanoTime();
		// 현재시간을 읽어서 나노세컨드값을 long 으로 반환
		
		System.out.println(time2);
		
		long start = System.nanoTime();
		
		for(int i = 0; i < 1000000; i++) {}
		
		long end = System.nanoTime();
		
		System.out.println("for문 걸린시간: " + (end - start) + "ns");
	}

}