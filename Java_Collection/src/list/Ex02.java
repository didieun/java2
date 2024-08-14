package list;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		
		// String 타입의 ArrayList를 생성한 후
		// 연애인 이름 5명을 저장하기
		// 이름을 향상된 for 문과 일반 for 문으로 출력학
		
		List<String> list = new ArrayList<>();
		
		list.add("변우석");
		list.add("김석진");
		list.add("장원영");
		list.add("전지현");
		list.add("안유진");
		
		for(String name : list) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번: " + list.get(i));
		}
	}

}