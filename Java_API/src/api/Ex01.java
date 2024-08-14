package api;

import java.util.Objects;

//Java 의 모든 클래스는 Object 의 자식클래스나, 자손 클래스이다

class Person extends Object {
	
	private String name;
	private int age;
	private final String SSN;
	
	// 초기화 생성자 빠르게 만들어 주는법
	// 마우스 우클릭 -> source -> generate Constructor using Fields 클릭!
	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.SSN = ssn;
	}

	// 다른객체지만 정보가 같으면 같은 객체로 만들어주는 방법( 메소드 재정의 ) 
	// 마우스 우클릭 -> source -> generate hashCode() and equals() 클릭!
	
	// 객체가 데이터가 같을 때에는 같은 hashCode 값을 
	// 얻을 수 있도록 재정의
	@Override
	public int hashCode() {
		return Objects.hash(SSN, age, name);
	}
	
	// 매개값으로 주어진 객체와 현재 객체의 데이터가 같을때에는
	// true 를 반환하도록 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(SSN, other.SSN) && age == other.age && Objects.equals(name, other.name);
	}

	// toString 재정의!
	// 마우스 우클릭 -> source -> generate toString() 클릭!
	// 가치있는 정보를 얻을 수 있도록 재정의
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", SSN=" + SSN + "]";
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 20 ,"123456-1234567");
		Person person2 = new Person("홍길동", 20 ,"123456-1234567");
		
		// hashCode는 객체가 가지고있는 고유한 정수값(객체마다 다른 정수값)
		System.out.println(person1.hashCode()); 
		System.out.println(person2.hashCode());
		
		// equals 는 object equals 이기 때문에 객체가 같은지 다른지 비교하는것( == 이거와 동일)
		// person1, person2는 다른 객체이므로 false
		System.out.println(person1.equals(person2));
		
		// Object 메소드 toString(객체 정보 반환)
		System.out.println(person1.toString());
		
	}

}
