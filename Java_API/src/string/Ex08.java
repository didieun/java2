package string;

public class Ex08 {

	public static void main(String[] args) {
		
		// StringBuffer 클래스는
		// 가변 문자열을 처리하기 위한 클래스이다.
		
		StringBuffer sb = new StringBuffer();
		
		// append -> 문자열을 뒤에 추가
		sb.append("Hello"); 
		sb.append(" ");
		sb.append("World!");
		System.out.println(sb.toString());
		
		// insert -> 지정한 위치에 문자열 삽입
		// 첫번째 인자로는 인덱스, 두번째 인자로는 추가할 문자열
		sb.insert(6, "Java ");
		System.out.println(sb.toString());
		
		// delete -> 지정할 위치의 문자열을 삭제(특정 범위의 문자열 삭제)
		// 첫번째 인자로는 시작할 인덱스 , 두번째 인자로는 마지막 인덱스(마지막 인덱스는 포함안하고 그전 까지)
		sb.delete(6, 10); // 예) 인덱스 6부터 9까지(10은 미포함) 문자열 삭제
		System.out.println(sb.toString());
		
	}

}