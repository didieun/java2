package inner;

// 정적 멤버 클래스 ( 잘 사용안함)
class Outer3 {
	
	private int x = 100;
	private static int y = 200;
	
	static class Inner3 {   // 정적 멤버클래스 - 모든 종류에 필드와 메소드를 선언할수있다.
		
		private int z = 300;
		private static int zz = 400;
		
		public void disp() {
			
			// System.out.println("Outer x : " + x);
			// 정적멤버클래스에서 바깥클래스의 인스턴스 멤버는 사용 x
			
			System.out.println("Outer y: " + y);
			System.out.println("Inner z: " + z);
			System.out.println("Inner zz: " + zz);
			
		}
	}
}

public class Ex03 {

	public static void main(String[] args) {
		
		Outer3.Inner3 inner = new Outer3.Inner3();
		
		inner.disp();
		
	}
}