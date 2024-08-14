package io.sungjuk;

import java.io.*;
import java.util.*;

class SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public SungJuk() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}

public class SungJukMainTeacher {

	public static void main(String[] args) throws Exception {
		
		// 선생님 답
		
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
		
		// 파일 새로 저장
		FileWriter fw = new FileWriter(dir + File.separator + "newSungJuk.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		// 파일 읽기
		List<SungJuk> list = new ArrayList<>();
		
		String line = null;
		
		while(true) {
			
			SungJuk sungJuk = new SungJuk();
			
			line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			String[] strArray = line.split(":");
			
			for(int i = 0; i < strArray.length; i++) {
				
				switch(i) {
				    case 0:
				    	sungJuk.setName(strArray[i]);
				    	break;
				    case 1:
				    	sungJuk.setKor(Integer.parseInt(strArray[i]));
				    	break;
				    case 2:
				    	sungJuk.setEng(Integer.parseInt(strArray[i]));
				    	break;
				    case 3:
				    	sungJuk.setMath(Integer.parseInt(strArray[i]));
				    	break;
				}
			}
			
			int total = sungJuk.getKor() + sungJuk.getEng() + sungJuk.getMath();
			
			sungJuk.setTotal(total);
			
			double avg = total / 3.0;
			
			sungJuk.setAvg(avg);
			
			list.add(sungJuk);
		
		}
		
		list.forEach(s -> {
			System.out.println("------------------------------------------");
			System.out.println("이름: " + s.getName());
			System.out.println("국어점수: " + s.getKor());
			System.out.println("영어점수: " + s.getEng());
			System.out.println("수학점수: " + s.getMath());
			System.out.println("총점: " + s.getTotal());
			System.out.printf("평균: %.2f\n", s.getAvg());
			System.out.println("------------------------------------------");
		});
		
		// 파일 새로 저장
		for(SungJuk s : list) {
			pw.printf("이름: %s, 국어점수: %d, 영어점수: %d, 수학점수: %d, 총점: %d, 평균: %.2f\n", s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg());
			pw.flush();
		}
		pw.close();
		br.close();
	}
}