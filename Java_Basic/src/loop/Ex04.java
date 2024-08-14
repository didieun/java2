package loop;

public class Ex04 {

	public static void main(String[] args) {
		// while 문 break, continue
		
		int a = 0;
		
		// break -> 안에있는 코드는 실행하지 않고 반복문 실행종료
		while(a < 10) {
			System.out.println(a);
			
			if (a == 5) {
				break; // a 가 5와 같으면 반복문 종료
			}
			
			a++;
		}

		System.out.println();
		
		// continue -> 반복문 안에서만 사용가능 , 실행 흐름을 바꿈
	
		a = 0;
		
		// 아래는코드는 무한반복
		while(a < 10) {
			System.out.println(a);
			
			if (a == 5) {
				continue;
			}
			
			a++;
		}
		
		// 
		while(a < 10) {
			
			a++;
			
			if (a == 5) {
				continue;
			}
			
			System.out.println(a);
			
		}
	}

}
