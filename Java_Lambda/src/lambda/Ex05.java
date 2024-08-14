package lambda;

// 4. 매개변수가 있고, 반환값도 있는 경우
interface Greet4 {
	
	public String hello(String name);
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		Greet4 greet;
		
		greet = (name) -> {
			return name + "님 안녕하세요";
		};
		
		System.out.println(greet.hello("홍길동"));
		
		// 매개변수가 하나고, 실행코드가 return 만 있으면
		// 소괄호(), 중괄호{}, return 생략가능
		greet = name -> name + "님 안녕하세요";
		
		System.out.println(greet.hello("성춘향"));

	}
}