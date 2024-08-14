package lambda;

// 어노테이션이란 메타데이터라고 볼 수 있다.
// 프로그램이 실행할때 추가적인 정보를 제공하면서
// 필요한 처리를 하는 코드
// 메타정보는 주정보가 아닌 부가적인 정보이다.

// 람다식으로 구현할 수 있는 인터페이스는
// 단 하나의 추상메소드를 포함하는 함수형 인터페이스만 가능하다.
// 두개 이상의 추상메소드가 선언되는 오류를 예방하고자
// @FunctionalInterface 라는 어노테이션을 사용할 수 있다.

@FunctionalInterface
interface Greet {
	
	// 1. 매개변수가 없고, 반환값이 없는경우
	public void hello();
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		// 매개변수가 없는경우는 반드시 소괄호() 를 넣어줘야된다
		Greet greet = () -> {
			System.out.println("Hello World");
		};
		
		greet.hello();
		
		greet = () -> System.out.println("안녕하세요~!");
		// {} 안에 실행할 코드가 하나만 있으면 중괄호{}를 생략할수가 있다. (실행문이 하나밖에 없다면)
		greet.hello();

	}
}