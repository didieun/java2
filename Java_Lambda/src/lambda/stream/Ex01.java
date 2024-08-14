package lambda.stream;

import java.util.*;
import java.util.stream.*;

public class Ex01 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Melon", "Banana", "Apple", "Strawberry");

		Stream<String> listStream = list.stream();
		// 원본의 데이터가 아닌 별도의 Stream 을 생성함으로
		// 원본의 데이터를 변경하지 않는다.
		
		Stream<String> sortList = listStream.sorted();
		// .sorted() : 요소들을 오름차순으로 정렬
		
		list.forEach(fruit -> System.out.println("원본 요소: " + fruit));
		
		System.out.println();
		
		sortList.forEach(fruit -> System.out.println("정렬된 요소: " + fruit));
		
	}
}