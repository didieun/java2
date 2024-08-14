package lambda;

import java.util.function.*;

public class Ex09 {

	public static void main(String[] args) {
		
		// Operator 함수형 인터페이스
		// 역할: 매개값을 연산 후 결과 반환하기
		
		UnaryOperator<Integer> unaryOperator;
		// 하나의 값을 받아서 연산을 수행하고 결과를
		// 동일한 데이터 형식으로 반환
		
		unaryOperator = (num) -> {
			return num * num;
		};
		
		// 생략
		// unaryOperator = num -> num * num;
		
		int result = unaryOperator.apply(5);
		System.out.println("5의 제곱: " + result);
		
		// BinaryOperator 함수형 인터페이스
		// 두 개의 동일한 형식의 데이터를 받아서 연산을 수행후 
		// 그 결과를 동일한 데이터 형식으로 반환
		
		BinaryOperator<Integer> binaryOperator;
		
		binaryOperator = (a, b) -> {
			return a + b;
		};
		
		// 생략
		// binaryOperator = (a, b) -> a + b;
		
		int result2 = binaryOperator.apply(10, 20);
		System.out.println("10 + 20: " + result2);
		
	}
}