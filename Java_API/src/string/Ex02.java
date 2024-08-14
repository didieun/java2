package string;

public class Ex02 {

	public static void main(String[] args) {
		
		String strAge = "20";
		
		String strHeight = "176.4";
		
		System.out.println("홍길동 나이: " + strAge);
		System.out.println("홍길동 키: " + strHeight);
		
		System.out.println();
		
		// 홍길동의 나이가 1살이 더 올라갔고
		// 키가 2.3cm 더 커졌습니다.
		// 새로운 나이와 키를 계산하여 출력하기
		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strHeight);
		
		age = age + 1;
		height = height + 2.3;
		
		System.out.println("새로운 나이: " + age );
	
		//printf?? 공부하기
		System.out.printf("새로운 키: %.2f", height );	
	}

}