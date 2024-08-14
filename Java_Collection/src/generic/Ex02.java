package generic;

class Box<E> {
	private E obj;
	
	// getter, setter 자동완성방법 
	// -> getObj 입력후 ctrl + 스페이스바 한뒤 엔터
	// -> setObj 입력후 ctrl + 스페이스바 한뒤 엔터
	public E getObj() {
		return obj;
	}
	
	public void setObj(E obj) {
		this.obj = obj;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		//Box box = new Box();
		
		//box.setObj("Hello World");
		
		// Object 타입이기때문에 (String) 타입으로 casting 해줘야됨. 
		// 이럴경우 매번 casting을 주면 성능저하가 오므로 제네릭을 사용
		// String str = (String)box.getObj();
		// System.out.println(box.getObj());
		
		// 위의 주석처리 한부분을 제네릭 하는 방법
		Box<String> box = new Box<String>();
		
		box.setObj("Hello World");
		
		String str = box.getObj();

		System.out.println(str);
	}

}