package map;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		
		// <String, String> 타입의 HashMap 객체 생성
		// 아이디와 비밀번호 4개 저장하기
		// keySet 메소드로 key 객체를 Set 타입으로 얻은 후
		// Iterator 를 사용하여 아이디와 비밀번호 출력
		
		Map<String, String> map = new HashMap<>();
		
		map.put("hong", "1234");
		map.put("mong", "1111");
		map.put("sung", "2222");
		map.put("jang", "3333");
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			String id = keyIter.next();
			String pw = map.get(id);
			
			System.out.println("아이디: " + id + ", 비밀번호: " + pw);
			
		}	
	}
}