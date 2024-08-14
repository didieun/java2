package io.file;

import java.io.*;

public class Ex12 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Person person = (Person)ois.readObject(); 
		// 읽어 올때는 readObject(); 읽어오고 객체로 알아서 저장함 (역직렬화)
		// 타입은 Object 이기 때문에 (Person) 으로 casting 해줘야됨
		
		System.out.println("이름: " + person.name);
		System.out.println("나이: " + person.age);
		
		ois.close();

	}
}