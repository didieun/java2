package wrapper;

public class Ex03 {

	public static void main(String[] args) {
		// 문자열을 기본타입으로 값 변경
		String strNum = "100";
		
		// 문자열을 기본타입으로 값을 변경하고 반환
		int num = Integer.parseInt(strNum);
		
		System.out.println(num);

		// 실수인 문자열을 기본타입으로 값 변경
		strNum = "3.14";
		
		// 실수인 문자열을 기본타입으로 값을 변경하고 반환
		double num2 = Double.parseDouble(strNum);
		
		System.out.println(num2);
	}

}
