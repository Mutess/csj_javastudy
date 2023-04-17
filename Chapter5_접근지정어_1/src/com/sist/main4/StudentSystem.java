package com.sist.main4;

import com.sist.main3.Student;
//패키지명이 다르면 => 사용시에 반드시 import를 사용한다.
import java.util.Scanner;
public class StudentSystem {
	private Student[] std = new Student[3]; // 배열이라서 3정도의 크기의 공간만 만든거라서  현재 null값임 //그래서 초기화가 되어있지 않음 (메모리가 할당된것이 아님) // 주소를 가르키지 못해서 에러남
	// 1. 학생 초기화
	/*
	 *   1.  명시적 초기화 => 객체 생성시 모든 객체값이 동일
	 *   ----------------------------------------
	 *   2.  생성자 사용
	 *   3.  초기화 블록
	 *   4.  메소드
	 *   --------------------입력 값을 받거나 외부에서 데이터를 읽기
	 *   								  ----------------- 크롤링, 파일
	 *   *** class 블록에서는 선언과 동시에 초기화만 가능
	 *   -------------- 제어문, 외부 라이브러리 호출 불가능 {}
	 */
	public void init() {//학생 등록
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i<std.length; i++) {
			std[i] = new Student(); // 배열은 모든 저장공간이 null (그래서 메모리 연결를 시켜야 함)
			// ----------------------------- 메모리 연결하는 부분
			System.out.print("학번 입력 : ");
			std[i].setHakbun(scan.nextInt());
			System.out.print("이름 입력 : ");
			std[i].name = scan.next();
			System.out.println("국영수 점수 입력 : ");
			std[i].setKor(scan.nextInt());
			std[i].setEng(scan.nextInt());
			std[i].setMath(scan.nextInt());
			System.out.print("성별 입력 : ");
			std[i].setSex(scan.next());
		}
	}
	//1 - 1출력
	public void display() {  //default => 같은 패키지안에서만 접근이 가능 //그래서 모든 메소드는 뭐든지 public을 사용
		for (Student s:std) {
			System.out.println(s.getHakbun()+" "+ s.name+" "+ s.getKor()+" "+s.getEng()+" "+s.getMath()+" "+ s.getSex()+" "+s.getTotal()+" "+s.getAvg()+ " " +s.getScore()+ " "+ s.getRank());
		}
	}
	// 2. 평균 구하기
	public void stdAvg() {
		for (int i  = 0; i < std.length; i++) {
			std[i].setAvg(std[i].getTotal() / 3.0);  //비공개
			//std[i].avg = std[i].getTotal() / 3.0) //공개
		}
	}
	// 3. 총점 구하기
	public void stdTotal() {
		for (int i  = 0; i < std.length; i++) {
			std[i].setTotal(std[i].getKor()+std[i].getEng()+std[i].getMath());  //메소드를 통해서 접근
		}
	}
	// 4. 학점 구하기
	public void stdScore() {
		char c = 'A';
		for (int i = 0; i<std.length; i++) {
			switch((int)(std[i].getAvg())/ 10) {
			case 10 : case 9 : 
				c = 'A';
				break;
			case 8 :
				c = 'B';
				break;
			case 7 : 
				c = 'C';
				break;
			case 6 :
				c = 'D';
				break;
			default :
					c = 'F';
			}
			std[i].setScore(c);
		}
	}
	// 5. 등수 구하기
	public void stdRank() {
		for (int i = 0; i<std.length; i++) {
			std[i].setRank(1);
			for (int j = 0; j <std.length; j++) {
				if (std[i].getTotal()<std[j].getTotal()) {
					std[i].setRank(std[i].getRank()+1);
				}
			} // 등수 구하는 방식 같은 메모리를 2개 가져다 놓고 2 메모리안에 있는 값들을 하나하나씩 비교하다가 비교하는 값이 자신보다 크면 +1을 해주는 것을 반복하다보면 등수가 나옴
		}
	}

}
