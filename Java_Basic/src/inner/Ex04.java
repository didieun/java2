package inner;

// 로컬 클래스 - 메소드 안에 선언한 클래스 ( 잘 사용안함)
class Outer4 {
	
	public void method() {
		
		class LocalInner { // 로컬클래스 - 로컬클래스는 메소드 안에서만 사용이 가능한 클래스이기 때문에 접근제한이 필요가 없다. static 도 붙일수가 없다
		
			int x = 100;
			
			void disp() {
				System.out.println("methodInner x: " + x );
			}
			
		}
		
		LocalInner inner = new LocalInner();
		
		inner.disp();
		
	} 
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		Outer4 outer = new Outer4();
		
		outer.method();

	}
}