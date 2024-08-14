package clazz;

class Parent { // 부모클래스
	int parentField = 100;
	
	public void parentMethod() {
		System.out.println("부모클래스 메소드");
	}
}

class Child extends Parent { // 자식클래스
	int childField = 200;
	
	public void childMethod() {
		System.out.println("자식클래스 메소드");
	}
}

public class Ex03 {
	//상속

	public static void main(String[] args) {
		Child child = new Child();
		
		System.out.println(child.parentField);
		System.out.println(child.childField);
		
		System.out.println();
		
		child.parentMethod();
		child.childMethod();

	}

}