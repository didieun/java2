package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		// String 타입의 HashSet 객체를 생성한 후 
		// 과일의 이름 5개 저장하기
		// Iterator 를 사용하여 과일의 이름 출력하기
		
		Set<String> set = new HashSet<>();
		
		set.add("사과");
		set.add("포도");
		set.add("수박");
		set.add("바나나");
		set.add("메론");
		
		Iterator<String> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			String fruit = setIter.next();
			System.out.println(fruit);
		}

	}

}
