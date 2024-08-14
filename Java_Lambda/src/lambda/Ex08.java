package lambda;

import java.util.function.*;

public class Ex08 {

	public static void main(String[] args) {
		
		// Function 함수형 인터페이스
		// 역할: 맵핑(타입변환)하기. 매개값과 리턴값이 있다.
		
		Function<String, Integer> function;
		// 제네릭<> 첫번째 타입은 매개변수 타입, 두번째는 반환타입
		
		function = (strNum) -> {
			int num = Integer.parseInt(strNum);
			return num;
		};
		
		// 생략
		// function = strNum -> Integer.parseInt(strNum);
		
		int num = function.apply("100");
		System.out.println("맵핑 값: " + num);
		
	}
}