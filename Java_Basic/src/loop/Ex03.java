package loop;

public class Ex03 {

	public static void main(String[] args) {
		// do - while 문
		
		int a = 100;
		
		while(a == 200) {
			System.out.println("while문 안입니다.");
		}
		
		System.out.println("while문 밖입니다.");
		
		System.out.println();
		
		do {
			System.out.println("do ~ while문 안입니다.");
		} while(a == 200); // 세미콜론
		
		System.out.println("do ~ while문 밖입니다.");

	}

}
