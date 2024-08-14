package io.sungjuk;

import java.io.*;

public class SungJukMain {

	public static void main(String[] args) throws Exception {
		
		// sungjuk.txt 파일에는
		// 이름:국어성적:영어성적:수학성적
		// 예) 홍길동:85:98:72
		// 파일에 있는 데이터를 읽어서 각 학생의 성적에 대한
		// 총점과 각 학생의 평균을 구한 후에
		// 콘솔뷰에 이름, 총점, 평균 출력하기
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "sungjuk.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String name = "";
		int kor, eng, math, sum, average = 0;

		while(true) {
			
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] strArray = str.split(":");
			
			name = strArray[0];
			kor = Integer.parseInt(strArray[1]);
			eng = Integer.parseInt(strArray[2]);
			math = Integer.parseInt(strArray[3]);
			
			sum = kor + eng + math;
			average = sum / 3;
			
			System.out.println("이름: " + name + ", 총점: " + sum + ", 평균: " + average);
			System.out.println();
			
		}
		br.close();
		
	}
}