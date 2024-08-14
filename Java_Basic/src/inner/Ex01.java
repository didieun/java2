package inner;

// Inner 클래스에서 Outer 클래스멤버 접근예제 ( 80~90% 사용)

class Outer1 {
	private int x = 100;
	
	private static int y = 200;
	
	public void outerMethod1() {
		System.out.println("public 바깥클래스 메소드");
	}
	
	public void outerMethod2() {
		System.out.println("private 바깥클래스 메소드");
	}
	
	// 클래스 안에 선언된 클래스를 내부클래스라고함
	class Inner1 { // 인스턴스 멤버클래스
		
		private int z = 300;
		
		//private static int zz = 400;
		// 인스턴스 멤버클래스에서 정적멤버는 선언할 수 없다.
		//(정적멤버는 메모리에 먼저 올라가는걸 멤버) 정적 멤버는 static 이다.
		
		public void disp() {
			System.out.println("Outer x: " + x);
			System.out.println("Outer y: " + y);
			System.out.println("Inner z: " + z);
			outerMethod1();
			outerMethod2();
			// 안쪽클래스에서 바깥클래스의 멤버는 사용 가능하다.
			
		}
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		Outer1 outer = new Outer1();
		// 우선 바깥클래스의 객체생성을 해준다.
		
		Outer1.Inner1 inner = outer.new Inner1();
		// 생성된 객체로 안쪽클래스의 객체생성을 해준다.
		
		inner.disp();

	}
}