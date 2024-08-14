package interface1;

interface Animal {
//	public static final int MAX_AGE = 500; // public static final 생략 가능(상수는 static final 써여됨..)
	int MAX_AGE = 500;
	
//	public abstract void sound(); // public abstract 생략 가능( 추상메서드는 abstract 써야됨..) 
	
	void sound();
	
	public default void defaulMethod() { // 인터페이스에서 예외적..
		System.out.println("default 메소드");
	}
	
	public static void staticMethod() { // 인터페이스에서 예외적..
		System.out.println("static 메소드");
	}
}

class Dog implements Animal {
	
	// 추상메서드는 무조건 오버라이딩해서 재정의 해야됨!!(강제 기능)
	@Override
	public void sound() {
		
	}
	
}

class Cat implements Animal {
	
	// 추상메서드는 무조건 오버라이딩해서 재정의 해야됨!! (강제 기능)
	@Override
	public void sound() {
		
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		//인터페이스 -> 상수랑, 추상메소드만 사용할수도 있다(예외도 있긴함.)
		
//		Animal animal = new Animal();
		//인터페이스는 객체 생성 할수 없다.
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println();
		
		Animal[] myAnimals = new Animal[2];
		
		myAnimals[0] = new Dog();
		myAnimals[1] = new Cat();
		
		myAnimals[0].sound();
		myAnimals[1].sound();
	
	}
}