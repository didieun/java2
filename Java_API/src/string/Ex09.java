package string;

import java.util.*;

public class Ex09 {

	public static void main(String[] args) {
		
		// StringTokenizer 클래스는 문자열을 토큰으로 분리하는데 사용하는 클래스
		// 지정된 구분자를 기준으로 문자열을 여러개의 토큰으로 나누는 기능 제공
		// 각 토큰은 문자열에서 분리된 부분 문자열을 나타낸다.
		
		String str = "Hello:JAVA:World";
		// 토큰은 부분문자열임( Hello, JAVA, World)
		
		StringTokenizer tokenizer = new StringTokenizer(str, ":");
		// 첫번째 인자로는 분리할 문자열, 두번째 인자는 구분자
		
		// hasMoreTokens: 아직 처리하지 않은 토큰이 남아있는지
		//				  확인 후 true/false 반환
		// nextToken: 다음 토큰을 반환
		
		while(tokenizer.hasMoreTokens()) {
			
			String token = tokenizer.nextToken();
			System.out.println(token);
			
		}

	}

}