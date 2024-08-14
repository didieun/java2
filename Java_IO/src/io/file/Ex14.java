package io.file;

import java.io.*;

public class Ex14 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Student student = (Student)ois.readObject();
		
		System.out.println("학번: " + student.getStudentID());
		System.out.println("이름: " + student.getName());
		System.out.println("나이: " + student.getAge());
		
		ois.close();
		
	}
}