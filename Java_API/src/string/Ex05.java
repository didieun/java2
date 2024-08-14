package string;

public class Ex05 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		// indexOf: 문자열에 지정한 문자가 처음 몇번째에 있는지를 정수로 반환
		System.out.println(str.indexOf("l"));
		
		// lastIndexOf: 문자열에 지정한 문자가 마지막 몇번째 있는지를 정수로 반환
		System.out.println(str.lastIndexOf("l"));
		
		System.out.println();
		
		String str2 = "A:B:C:D:abcd";
		// split: 지정한 구분자로 문자열을 나눌 수 있다.(배열로 반환)
		String[] strArray = str2.split(":");
		for(String s : strArray) {
			System.out.println(s);
		}
		
		System.out.println();
		
		String str3 = "ABCDEFG";
		// substring: 문자열에서 지정한 범위에 속하는 문자열을 반환
		String str4 = str3.substring(2);
		System.out.println(str4);
		String str4_1 = str3.substring(2,5); // 시작 범위에 값은 포함하고, 끝나는 범위에 값은 포함하지 않는다.
		System.out.println(str4_1);
		
	}

}