package io.file;

import java.io.*;

public class Ex10 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "ox.txt");
		
		// ox퀴즈
		// 1000개의 ox들이 있다.
		// 0는 1점 x는 점수가 없다!
		// 만약 연속으로 0가 등장할경우 점수가 2배!
		
		// (예시)
		// ooxxxxoo (1+2+1+2) 6점
		// ooooxooo (1+2+4+8+1+2+4) 22점
		// 1000 개의 ox 점수합을 구하세요.
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		int totalScore = 0; // 총 점수의 합을 구한 변수
		int score = 0; // 한 줄의 점수를 저장할 변수
		
		while(true) {
			
			String ox = br.readLine(); // 한줄 읽어오기
		
			// 더이상 읽어올 데이터가 없으면 null 을 반환
			if(ox == null) { // text 에서 파일의 끝은 null 이다.
				break; // while 문 종료
			}
			
			char[] charArray = ox.toCharArray();
			
			score = 1; // 점수를 1점으로 최기화
			
			for(int i = 0; i < charArray.length; i++) {
				if(charArray[i] == 'O') {
					totalScore += score;
					score *= 2; // 점수를 2배로 설정
				} else { // 'X' 일때
					score = 1;
				}
			}
			
		}
		
		System.out.println("O X 의 총 점수의 합: " + totalScore + "점");
		
		br.close();
	
	}
}