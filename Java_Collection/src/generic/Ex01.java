package generic;

public class Ex01 {

	public static void main(String[] args) {
		
		// Object: Object 클래스는 자바의 최상위 클래스
		// Object 타입의 변수는 모든 객체를 참조할 수 있다.
		
		Object[] obj = new Object[5];
		
		obj[0] = new Integer(100);
		obj[1] = 3.14;
		obj[2] = new Character('A');
		obj[3] = "Hello World";
		obj[4] = true;
		
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}

	}
}