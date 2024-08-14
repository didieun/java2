package set;

import java.util.*;
class Person {
	
	private String name;
	private int age;
	private final String SSN;
	
	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.SSN = ssn;
	}
	
	public void profile() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주민번호: " + SSN);
	}

	@Override
	public int hashCode() {
		return Objects.hash(SSN, age, name);
	}

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
	
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<>();
		
		set.add(new Person("홍길동", 20, "123456-1234567"));
		set.add(new Person("성춘향", 22, "123456-2222222"));
		set.add(new Person("이몽룡", 23, "123456-3333333"));
		set.add(new Person("홍길동", 20, "123456-1234567"));
		
		Iterator<Person> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			Person person = setIter.next();
			person.profile();
			System.out.println();
		}

	}

}