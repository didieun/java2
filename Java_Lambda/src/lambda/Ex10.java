package lambda;

import java.util.function.*;

public class Ex10 {

	public static void main(String[] args) {
		
		// Predicate 함수형 인터페이스
		// 역할: 매개값을 확인 후 논리값(true / false) 반환
		
		Predicate<Integer> predicate;
		
		predicate = (num) -> {
			return num >= 80;
		};
		
		// 생략
		// predicate = num -> num >= 80;
		
		if(predicate.test(77)) {
			System.out.println("합격 입니다.");
		} else { 
			System.out.println("불합격 입니다.");
		}

	}
}