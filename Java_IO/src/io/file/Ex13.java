package io.file;

import java.io.*;

class Student implements Serializable {
	
	private int studentID;
	private String name;
	private int age;
	
	// 초기화 생성자
	public Student(int studentID, String name, int age) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}

	// getter, setter 메소드 생성
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Ex13 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		// Student 객체를 생성후
		// ObjectOutputStream 의 writeOject 메소드로
		// 객체를 직렬화하여 aaa.txt 파일에 저장하기
		
//		Student student = new Student(1234, "홍길동", 20);
//		
//		oos.writeObject(student);
		
		oos.writeObject(new Student(1234, "홍길동", 20));
		
		oos.close();

	}
}