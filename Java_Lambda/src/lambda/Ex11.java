package lambda;

import java.util.*;

public class Ex11 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("사과");
		list.add("딸기");
		list.add("포도");
		list.add("바나나");
		list.add("수박");
		
		// forEach 은 Consumer 함수형 인터페이스를 받을수 있다.
		list.forEach(fruit -> System.out.println(fruit));
		
	}
}