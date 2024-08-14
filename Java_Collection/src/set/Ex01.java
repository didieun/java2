package set;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		// Set: 데이터의 저장순서를 유지하지 않는다.
		//      테이터의 중복저장을 허용하지 않는다.
		
		Set<String> set = new HashSet<>();
		
		set.add(new String("홍길동"));
		set.add("이순신");
		set.add("이몽룡");
		set.add("이몽룡"); // 중복 x
		
		System.out.println("총 객체의 수: " + set.size());
		
		// set 은 순서대로 저장이 되는게 아니기때문에 인덱스 갯수대로 가져오는 get 메소드가 없다.
		// 만약 데이터를 가져오고싶으면 iterator 메소드를 사용해서 쓰면된다.
		
		Iterator<String> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			String str = setIter.next();
			System.out.println(str);
			
		}
		System.out.println();
		
		boolean bool =set.remove("홍길동"); // .remove 는 논리값으로 저장됨 잘삭제하면 true, 아니면 false
		
//		System.out.println(bool);
		
		if(bool) {
			System.out.println("홍길동이 삭제되었습니다.");
		}
		
		System.out.println();
		
		setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			String str = setIter.next();
			System.out.println(str);
			
		}
		System.out.println();
		
		set.clear(); // 전체 삭제
		
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}

}