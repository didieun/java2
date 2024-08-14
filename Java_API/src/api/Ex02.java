package api;

import java.util.Objects;

// ** 연습 **

// Member 클래스를 만든다.
// 필드는 private String name; private int age; private final String SSN;
// 생성자의 매개변수로 매개값을 받아 필드 초기화
// equals, hashCode, toString 메소드를 오버라이딩 하여 재정의(이클립스 기능)

class Member {
	private String name;
	private int age;
	private final String SSN;
	
	// 생성자 초기화
	public Member(String name, int age, String sSN) {
		super();
		this.name = name;
		this.age = age;
		SSN = sSN;
	}

	// hashCode 재정의(오버라이딩) -> 데이터 같을때 코드값 같게 만듬
	@Override
	public int hashCode() {
		return Objects.hash(SSN, age, name);
	}

	// equals 재정의(오버라이딩) -> 데이터 같을때는 true 반환
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(SSN, other.SSN) && age == other.age && Objects.equals(name, other.name);
	}

	// toString 재정의(오버라이딩)
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", SSN=" + SSN + "]";
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		Member member1 = new Member("홍길동", 20, "123456-1234567");
		Member member2 = new Member("홍길동", 20, "123456-1234567");
		Member member3 = new Member("성춘향", 22, "123456-2234567");

		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
		
		System.out.println(member1.equals(member2));
		System.out.println(member1.equals(member3));
		System.out.println();
		
		System.out.println(member1.toString());
		System.out.println(member3.toString());
	}

}