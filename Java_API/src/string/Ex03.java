package string;

public class Ex03 {

	public static void main(String[] args) {
		// 배열 전체를 String 객체로 생성하기
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str = new String(bytes);
		// 객체를 생성하고 매개값에 배열을 넣어주면 됨
		
		System.out.println(str);
		// 결과 Hello Java 라는 문자열이 출력
		
		// 배열의 인덱스 위치부터 길이 만큼 String 객체로 생성
		String str2 = new String(bytes, 6, 4); // new String(배열명, 시작위치, 길이)
		System.out.println(str2);
		
		// 문자열을 byte 배열로 반환(문자열을 기본타입으로)
		String str3 = "Hello Java";
		byte[] byteArray = str3.getBytes();
		
		for(byte b : byteArray) { // 향상된 for 문
			System.out.print(b + " ");
		}
		
	}

}