package io.file;

import java.io.*;

public class Ex09 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
//		br.readLine(); // 이방법은 시간이 너무 많이 듬... 아래의 반복문 사용
		
		while(true) {
			
			String msg = br.readLine(); // 한줄 읽어오기
			
			// 더이상 읽어올 데이터가 없으면 null 을 반환
			if(msg == null) { // text 에서 파일의 끝은 null 이다.
				break; // while 문 종료
			}
			
			System.out.println(msg);
			
		}
		
		br.close();
	}
}