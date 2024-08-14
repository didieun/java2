package lambda.stream;

import java.util.*;
import java.util.stream.*;

public class Ex02 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Stream<Integer> numbers = list.stream();
		
		Stream<Integer> filterNumbers = numbers.filter(num -> num % 2 == 0);
		
		List<Integer> FilterList =  filterNumbers.collect(Collectors.toList());
		// collect 메소드를 사용하여 필터링된 요소들을 수집 후
		// Collectors.toList(): 수집한 요소들을 리스트로 반환
		
		System.out.println("원본: " + list);
		System.out.println("짝수: " + FilterList);

	}
}