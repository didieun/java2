package map;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(new Integer(1), new String("홍길동"));
		
		map.put(2, "성춘향");
		map.put(3, "이순신");
		map.put(4, "이몽룡");
		map.put(1, "장보고");
		// 동일한 key 로 객체를 저장하면
		// value 객체가 대체된다.( 홍길동이 장보로 대체가된다.)
		
		System.out.println("전체 Entry 수: " + map.size());
		
		System.out.println(map); // 전체 출력
		
		// get : key 객체로 value 객체를 얻을 수 있다.
		String str = map.get(1);
		System.out.println(str);
		
		String str2 = map.get(7);
		// key 객체가 존재하지 않는다면 null 값을 반환
		System.out.println(str2);
		System.out.println();
		
		// keySet : 전체 key 객체들을 Set 타입으로 반환
		Set<Integer> keySet = map.keySet();
		
		Iterator<Integer> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			int key = keyIter.next();
			
			String value = map.get(key);
			
			System.out.println("key: " + key + ", value: " + value);
		}
		System.out.println();
		
		
		map.remove(1); // key 객체로 Entry 삭제
		map.remove(2);
		
		System.out.println(map);
		
		map.clear(); // 전체 삭제
		
		if(map.isEmpty()) {
			// map 컬렉션이 비어있으면 true
			// 비어있지 않으면 false 반환
			System.out.println("비어있음");
		}
		
	}

}