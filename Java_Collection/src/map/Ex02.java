package map;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		
		// <String Integer> 타입의 HashMap 생성 후
		// 과목과 성적 4개를 저장하기
		// 국어, 영어, 수학, 자바
		// key 객체를 사용하여 value 를 얻은 후 성적 출력하기
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("국어", 80);
		map.put("영어", 85);
		map.put("수학", 95);
		map.put("자바", 100);
		
		// key 값으로 value 값 가져오기
		int kor = map.get("국어");
		int eng = map.get("영어");
		int math = map.get("수학");
		int java = map.get("자바");
		
		System.out.println("국어 점수: " + kor);
		System.out.println("영어 점수: " + eng);
		System.out.println("수학 점수: " + math);
		System.out.println("자바 점수: " + java);
		
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			int value = map.get(key);
			
			System.out.println("과목: " + key + ", 점수: " + value);
		}
	}
}