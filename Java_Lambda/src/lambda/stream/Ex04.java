package lambda.stream;

import java.util.*;
import java.util.stream.*;

public class Ex04 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 6, 7);
		
		Stream<Integer> distinctNumbers = numbers.stream().distinct();
		// .distinct() : 중복된 요소가 제거되고, 새로운 스트림이 반환
		
		List<Integer> newNumbers = distinctNumbers.collect(Collectors.toList());
		
		System.out.println("원래숫자: " + numbers);
		System.out.println("중복제거: " + newNumbers);

	}
}