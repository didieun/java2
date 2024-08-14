package string;

// API는 다른사람이 만든 라이브러리이기때문에 우리는 사용방법을 배우는거다.

public class Ex04 {

	public static void main(String[] args) {
		
		// String 메소드
		
		String str = "Hello World";
		
		// charAt:  해당 위치의 문자 하나를 char 타입으로 반환
		char ch = str.charAt(6);
		System.out.println(ch);
		
		// isEmpty: 해당 문자열이 비어있는지 확인 후 true / false 반환 (비어있으면 true, 안비어있으면 false)
		boolean bool = str.isEmpty();
		System.out.println(bool);
		
		// length: 문자열의 길이를 정수로 반환
		int length = str.length();
		System.out.println(length);
		
		// toCharArray:  문자열을 한글자씩 char 배열로 반환
		char[] charArray = str.toCharArray();
		for(char c : charArray) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		// replace: 문자열을 교체해준다.
		// 현재 str 문자열은 Hello World 인데 Hi World로 교체방법
		String newStr = str.replace("Hello", "Hi"); // replace(현재 문자열, 교체할 문자열)
		System.out.println(newStr);
	}

}