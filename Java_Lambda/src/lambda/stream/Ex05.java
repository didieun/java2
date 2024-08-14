package lambda.stream;

import java.util.*;
import java.util.stream.*;

public class Ex05 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		int sum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
		// .reduce() : 메소드의 첫번째 매개변수는 초기값이며
		// 두번째 매개변수는 이진연산자이다.
		
		long count = numbers.stream().count();
		// .count(): 요소의 개수를 반환함. long 타입으로 반환
		
		System.out.println("요소의 합: " + sum);
		System.out.println("요소의 갯수: " + count);

	}
}