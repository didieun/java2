package method;

public class Ex01 {
	
	public static void hello() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello World");
			
			if(i == 2) {
				return;
				// return 값이 없는 void 메소드에서
				// return 문을 사용하면 메소드 강제종료
				
				// for 문 종료 -> break;
				// method 종료 -> return;
				// 프로그램 강제 종료 -> System.exit( );
			}
		}
	}
	
	public static int sum(int a, int b, int c) {
		
		return a + b + c;
	}
	
	// 예를 들어 매개 변수가 100개 일때, 매개값을 가변적으로 받는 경우! 
	
	public static int sum2(int... nums) {
		
		// 매개변수를 배열값으로 변환한다.
		int sum = 0;
		
		for(int i : nums) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		hello(); // 메소드 호출
		
		int result = sum(10, 20, 50);
		System.out.println(result);
		
		int result2 = sum2(1, 2, 3, 4, 5);
		System.out.println(result2);
	}

}