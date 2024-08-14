package method;

public class Ex02 {
	
	// 메소드 오버로딩
	// 같은 이름의 메소드를 여러개 선언하는 것
	// 조건: 매개변수의 타입, 갯수, 순서 중 하나가 달라야 한다.
	// ** 메소드 오버로딩 하는 이유! 하나의 이름으로 다양한 기능을 수행하기 위해
	
	public static void profile(String name) {
		System.out.println("이름: " + name);
	}
	
	public static void profile(String name, int age) {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	

	public static void main(String[] args) {
		
		profile("홍길동");
		System.out.println();
		profile("홍길동", 20);
		
	}

}