package com.sist.io2;
/*
		시작하자마자 List에 담고 시작하는 해야함
 */
import java.util.*;
import java.io.*;
public class StudentSystem {
	//모든 학생을 읽어서 메모리에 저장
	private static List<Student> stdList = new ArrayList<Student>();
	
	// 파일을 읽어서 메모리(stdList)에 저장
	// Web, window = String
	static {
		FileReader fr = null; // 무조건 null값을 주고 시작해야 에러가 안남  // int i = 0 이거랑 같음
		try {
			fr = new FileReader("c:\\java_datas\\school.txt");
			StringBuffer sb = new StringBuffer();
			int i = 0;
			while ((i = fr.read())!= -1) {
				sb.append((char)i);
			}
			//홍길동|90|90|90|270|90.00\r\n //파일에서 \r\n은 다음줄로 넘어가라는 뜻임
			String[] stds = sb.toString().split("\n"); // \n이 안되면 \r\n을 넣어줘야함
		
			// 학생별 구분
			for (String ss:stds) {
				StringTokenizer st = new StringTokenizer(ss, "|");
				//학생 데이터별 구분
				Student s = new Student();
				s.setHakbun(Integer.parseInt(st.nextToken()));
				s.setName(st.nextToken());
				s.setKor(Integer.parseInt(st.nextToken()));
				s.setEng(Integer.parseInt(st.nextToken()));
				s.setMath(Integer.parseInt(st.nextToken()));
				int total = s.getKor()+s.getEng()+s.getMath();
				s.setTotal(total);
				s.setAvg(total/3.0);
				stdList.add(s);
			}
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch (Exception ex) {}
		}
	}
	//메뉴
	public int menu() {
		System.out.println("========메뉴========");
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 등록");
		System.out.println("3. 학생 수정");
		System.out.println("4. 학생 삭제");
		System.out.println("5. 저장 및 종료");
		int no = 0;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //키보드값을 읽을때 사용하는 IO 무조건 예외처리를 해야함 Scanner를 대체
			System.out.print("메뉴번호 입력 : ");
			String str = in.readLine();
			no = Integer.parseInt(str);
		}catch (Exception ex) {}
		return no;
	}
	public void process() {
		while (true) {
			int no = menu();
			if (no == 5) {
				System.out.println("안녕히 가세요");
				FileWriter fw = null; //한글 저장시 
				//FileOutputStream이거 보단 => FileWriter가 편리함
				try { //이걸 사용하면 파일에 내용이 저장됨
					fw = new FileWriter("c:\\java_datas\\school.txt");  //통신이 되게 통로를 만들어준다는 느낌
					// 자바프로그램과 파일 연결 => 스트림 (출력 스트림)
					// 2byte씩 전송한다. (문자 스트림) => 한글(byte)
					// 알파벳이나 숫자는 1byte, 2byte 상관없이 가능
					String temp = "";
					for (Student ss : stdList) {
						temp += ss.getHakbun() + "|" + ss.getName() + "|" + ss.getKor() + "|" + ss.getEng() + "|" + ss.getMath() + "\n";
					}
					fw.write(temp);
				}catch (Exception ex) {
					ex.printStackTrace();
				}finally {
					try {
						fw.close();
					} catch (Exception ex) {}
				}
				break;
			}
			else if (no == 1) {
				for (Student ss : stdList) {
					int total = ss.getKor()+ss.getEng()+ss.getMath();
					ss.setTotal(total);
					ss.setAvg(total/3.0);
					System.out.println(ss.getHakbun()+" "+ss.getName()+" "+ss.getKor()+" "+ss.getEng()+" "+ss.getMath()+" "+ss.getTotal()+" "+String.format("%.2f", ss.getAvg()));
				}
			}
			else if (no == 2) {
				try {
					BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //키보드값 읽어오는 것
					System.out.print("이름 입력 : ");
					String name = in.readLine();
					System.out.print("국어점수 입력 : ");
					String kor = in.readLine();
					System.out.print("영어점수 입력 : ");
					String eng = in.readLine();
					System.out.print("수학점수 입력 : ");
					String math = in.readLine();
					
					//시퀀스 => 자동 증가 번호 만들기 => 구분자(학번)
					int max = 0;
					for (Student ss : stdList) { //학번이 하나씩 증가하게 만들어줌 만약 3이 있으면 자동으로 다음에 4번을 넣어줌
						if (ss.getHakbun() > max) {
							max = ss.getHakbun();
						}
					}
					Student s = new Student();
					s.setName(name);
					s.setHakbun(max+1);
					s.setKor(Integer.parseInt(kor));
					s.setEng(Integer.parseInt(eng));
					s.setMath(Integer.parseInt(math));
					
					stdList.add(s);
					
				}catch (Exception ex) {}
			}
			else if (no == 4) {
				try {
					BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("학번을 입력하세요 : ");
					String hak = in.readLine(); // == scan.nextInt()
//					int i = 0;
					for (Student ss:stdList) {
						if (ss.getHakbun() == Integer.parseInt(hak)) {
							stdList.remove(ss); //stdList.remove(i); 
							break;
						}
//						i++;
					}
				}catch (Exception ex) {}
			}
		}
	}
}
