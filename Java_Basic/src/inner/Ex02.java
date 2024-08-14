package inner;

// Outer 클래스에서 Inner 클래스 멤버 접근예제  ( 80~90% 사용)

class Outer2 {
	
	private int x = 100;
	
	public void disp() {
		
		System.out.println("Outer x: " + x);
//		System.out.println("Inner y: " + y);
		// 위는 에러남. 에러나는 이유는 객체를 생성해서 사용해야된다.
		
		Inner2 inner = new Inner2();
		System.out.println("Inner y: " + inner.y);
		inner.innerMethod1();
		inner.innerMethod2();
	}
	
	class Inner2 {
		
		private int y = 200;
		
		public void innerMethod1() {
			System.out.println("public 안쪽클래스 메소드");
		}
		
		public void innerMethod2() {
			System.out.println("private 안쪽클래스 메소드");
		}
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		
		outer.disp();
		
	}
}