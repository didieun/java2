package inner;

// 익명 클래스
class Outer5 {
	
	public void aaa() {
		System.out.println("aaa");
	}
	
	public void bbb() {
		System.out.println("bbb");
	}
	
	public void ccc() {
		System.out.println("ccc");
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		// 익명 (자식) 클래스
		// 예를 들어 bbb 메소드를 수정하고 싶으면 원래는 Outer5 클래스를 상속받는 자식 클래스를 만든뒤
		// bbb 메소드를 오버라이딩 해서 재정의를 하지만, 그냥 한번만 사용하고 싶을때 익명 클래스를 사용하면된다. 
		Outer5 outer = new Outer5() {
			
			@Override // 메소드 재정의
			public void bbb() {
				System.out.println("bbbbb");
			}
			
		};
		
		outer.aaa();
		outer.bbb();
		outer.ccc();

	}
}