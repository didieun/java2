package Wrapper;

public class Ex01 {

	public static void main(String[] args) {
		// 매개변수로 객체가 요구되는 경우
		// 기본형이 아닌 객체로 저장해야 하는 경우
		// 문자열을 기본값으로 변환해야 하는 경우
		// 객체간의 비교가 필요한 경우 등에 wrapper 클래스가 쓰인다.
		// 자바 Collection 인터페이스는 객체만 취급하기 때문에
		// 기본타입을 객체로 사용해야 하는 경우가 있다.
		
		
		Integer obj = new Integer(100);
		// 기본타입의 값을 내부에 갖고있는 객체를 생성(박싱)
		
		int value = obj.intValue();
		// 포장객체에서 기본타입의 값을 얻는다.(언박싱) 
		
		System.out.println(value);
		
		Integer obj2 = 100; // 자동 박싱

	}

}
