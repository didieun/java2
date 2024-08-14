package lambda;

import java.util.function.*;

public class Ex07 {

	public static void main(String[] args) {
		
		// Supplier 함수형 인터페이스
		// 역할: 생성자 역할. 매개값이 없고, 반환값이 있다.
		
		// 제너릭은 반환타입
		Supplier<String> supplier;
		
		supplier = () -> {
			return "Hello World";
		};
		
		// 생략
		// supplier = () -> "Hello World";
		
		String msg = supplier.get();
		
		System.out.println("얻은 값: " + msg);
	
	}
}