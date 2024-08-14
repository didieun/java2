package lambda.stream;

import java.util.*;
import java.util.stream.*;

public class Ex03 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		Stream<Integer> numberStream = numbers.stream().map(num -> num * 2);
		
		List<Integer> newNumbers = numberStream.collect(Collectors.toList());
		
		System.out.println("원래 숫자: " + numbers);
		System.out.println("2를 곱한 결과: " + newNumbers);

	}
}