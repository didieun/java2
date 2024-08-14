package loop;

public class Ex01 {

	public static void main(String[] args) {
		// for 문 (반복문)
		
		int i;
		
		for(i = 1; i <= 5; i++) {
			System.out.println("for문 안입니다. i : " + i);
		}

		System.out.println("for문을 나왔습니다. i : " + i);
		
		System.out.println();
		
		// for 안에서 j 를 선언함. 그러므로 for 안에서만 사용가능
		for(int j = 1; j <= 5; j++) {
			
			System.out.println(j + " ");
			
		}
		
		System.out.println();
	}

}
