package list;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		// 제너릭 뒤에 오는 new ArrayList<>에 생략이 가능하다, 앞부분도 List 만 써줘도 된다.
		List<String> list = new ArrayList<>();
		
		// List: 데이터를 일렬로 늘어놓은 자료구조
		// 데이터의 중복허용, 순서 중요
		
		list.add(new String("홍길동"));
		list.add("성춘향");
		list.add("이몽룡");
		// 홍길동, 성춘향, 이몽룡 순서대로 저장이 된다.
		
		// 저장된 전체 객체에 갯수를 알고 싶으면(정수로 반환됨)
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		
		// 향상된 for 문
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println();
		
		// 객체 중간에 데이터를 넣을려면..
		list.add(0, "이순신"); // index 0번에 "이순신" 객체를 끼워넣는다.
		// 결과 -> 이순신 홍길동 성춘향 이몽룡
		list.add(2, "장보고");
		// 결과 -> 이순신 홍길동 장보고 성춘향 이몽룡
		
		list.set(0, "세종대왕"); // index 0번에 객체를 "세종대왕" 으로 대체한다.
		// 결과 -> 세종대왕 홍길동 장보고 성춘향 이몽룡
		
		String str2 = list.get(2); // index 2번의 객체를 얻는다.
		System.out.println(str2);
		System.out.println();
		
		// 일반 for 문
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		
		list.remove(1); // index 1번의 객체를 삭제
		// 결과 -> 세종대왕 장보고 성춘향 이몽룡
		list.remove("장보고"); // "장보고" 객체를 삭제
		// 결과 -> 세종대왕 성춘향 이몽룡
		
		// 일반 for 문
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		
		System.out.println(list.contains("홍길동"));
		System.out.println(list.contains("성춘향"));
		// contains: List 안에 매개값으로 주어진 객체가 있는지 확인 후
		//			 객체가 있다면 true 반환, 아니라면 false 반환 
		
		list.clear();
		// List 안에 저장된 모든 객체를 삭제
		
		if(list.isEmpty()) {
			// 리스트 안이 비어있으면 true 반환
			// 비어있지 않으면 false 반환
			
			System.out.println("비어있음");
		}
		
	}

}