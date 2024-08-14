package list;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();

		list.add("사과");
		list.add("딸기");
		list.add("포도");
		list.add("바나나");
		list.add("수박");
		
		// Iterator: 반복자
		// 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화 한 것
		
		Iterator<String> iterator = list.iterator();
		// Iterator 는 인터페이스여서 new 연산자(생성자)를 생성 못함 
		// 컬렉션의 iterator 메소드를 호출하여
		// 객체를 얻어올 수 있다.
		
		// hasNext: 컬렉션에서 가져올 객체가 있는지 확인 후 true / false 반환
		// next: 컬렉션에서 하나의 객체를 가져온다.
		// remove:  next 메소드로 가져온 요소를 삭제한다.
		
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
		}
		System.out.println();
		
		iterator = list.iterator();
		// Iterator 는 1회성이기 때문에
		// 필요하면 다시 객체를 얻어와야 한다.
		
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
			iterator.remove();
		}
		System.out.println();
		
		if(list.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}

}