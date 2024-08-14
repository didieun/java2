package lambda;

// 인터페이스가 필요하다.
interface MyInterface {
	
	public void hello();
	
}

// 구현클래스 만듬(인터페이스 사용)
class MyClass implements MyInterface {
	
	// 인터페이스의 hello 메소드 재정의(오버라이딩)
	@Override
	public void hello() {
		System.out.println("Hello World");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		// 1번째 방식: 인터페이스를 구현한 구현클래스로부터 객체생성을 하여 사용
		MyClass myClass = new MyClass();
		myClass.hello();
		
		System.out.println();
		
		// 2번째 방식: 인터페이스로부터 익명클래스를 만들어서 익명객체 사용
		MyInterface myInter = new MyInterface() {
			
			@Override
			public void hello() {
				System.out.println("Hello World!!");
			}
			
		};
		myInter.hello();
		
		System.out.println();
		
		// 3번째 방식:  람다식 방법으로
		// 람다식이란 함수를 하나의 식으로 표현한 것
		// 함수를 람다식으로 표현하면 메소드의 이름이 필요없기 때문에
		// 람다식은 익명함수의 한 종류라고 볼 수 있다. 
		
		MyInterface inter = () -> {
			System.out.println("Hello World!!!!!");
		};
	
		inter.hello();
	}
}