package lambda;

// 2. 매개변수가 있고, 반환값이 없는경우
interface Greet2 {
	
	public void hello(String name);
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Greet2 greet;
		
		// 매개변수의 타입은 실행시 대입되는 값에 따라 자동으로 인식된다.
		// 때문에 매개변수의 타입은 일반적으로 생략한다.
		greet = (/* String */ name) -> {
			System.out.println(name + "님 안녕하세요");
		};
		
		greet.hello("홍길동");
		
		// 매개변수가 단 1개만 있는경우 소괄호() 생략이 가능하다.
		// 단 타입을 명시하면 소괄호를 써줘야된다 (예-> (String name) -> System.out.println(name + "님 안녕하세요"); )
		greet = name -> System.out.println(name + "님 안녕하세요");
		greet.hello("성춘향");

	}
}