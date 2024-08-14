package lambda;

// 3. 매개변수가 없고, 반환값이 있는경우
interface Greet3 {
	
	public String hello();
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		Greet3 greet;
		
		greet = () -> {
			return "홍길동님 안녕하세요";
		};
		
		System.out.println(greet.hello());
		
		// 실행코드가 return 문만 있는경우
		// 중괄호{}와 return 문 생략이 가능하다.
		greet = () -> "성춘향님 안녕하세요";
		
		System.out.println(greet.hello());
		
	}
}