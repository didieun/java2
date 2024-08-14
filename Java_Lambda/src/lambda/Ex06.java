package lambda;

import java.util.function.*;

public class Ex06 {

	public static void main(String[] args) {
		
		// Consumer 함수형 인터페이스
		// 역할: 소비자역할. 매개값이 있고, 반환값이 없다.
		
		Consumer<String> consumer;
		
		consumer = (msg) -> {
			System.out.println("입력값: " + msg);
		};
		
		// 생략
		//consumer = msg -> System.out.println("입력값: " + msg);
		
		consumer.accept("Hello World");
		
		int[] array = {1, 2, 3, 4, 5};
		
		// 매개변수의 타입은 int[] 타입의 Consumer 함수형 인터페이스 선언 후
		// 각 배열 요소의 합을 구한 후 출력
		
		Consumer<int[]> consumer2;
		
		consumer2 = intArray -> {
			int sum = 0;
			
			for(int i : intArray) {
				sum += i;
			}
			
			System.out.println("배열 요소의 합은: " + sum);
		};
		
		consumer2.accept(array);
	}
}