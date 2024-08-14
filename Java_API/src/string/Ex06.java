package string;

public class Ex06 {

	public static void main(String[] args) {
		
		String str = "abcDEF";
		// toLowerCase: 문자열에 대문자를 소문자로 변환
		System.out.println(str.toLowerCase());

		// toUpperCase: 문자열에 소문자를 대문자로 변환
		System.out.println(str.toUpperCase());
		
		// toString: 문자열을 그대로 반환
		System.out.println(str.toString());
		
		System.out.println();
		
		String str2 = "    java Hollo World     ";
		// trim: 문자열의 앞 뒤 공백만 없애준다.
		System.out.println(str2);
		System.out.println(str2.trim());
		
	}

}