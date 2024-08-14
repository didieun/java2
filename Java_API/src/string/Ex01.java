package string;

public class Ex01 {

	public static void main(String[] args) {
		// String 클래스이다.
		// 문자열은 프로그램에서 굉장히 많이 사용되기 때문에
		// 자바에서는 String 을 기본형과 같은 형식으로 사용할 수 있도록 해두었다.
		
		// 문자열이 객체로 생성되고 str1에는 주소값이 저장(이것을 자동박싱이라고함) 
		// str1, str2은 같은 객체 참조한것
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hi";
		
		System.out.println(str1 == str2); // true(주소값이 같음)
		System.out.println(str1 == str3); // false(주소값이 다름)
		System.out.println();
		
		String str4 = new String("World");
		String str5 = new String("World");
		
		System.out.println(str4 == str5); // str4, str5은 객체가 각각 따로따로 생성이 되기때문에 주소값이 다름
		System.out.println(str4.equals(str5));
		// equals : 원본객체와 매개값으로 주어진 객체의 문자열을 비교 후
		// 			문자열이 같으면 true, 문자열이 다르면 false
	}

}