package com.sist.main2;
/*
 * boolean은 getter/setter를 사용하면 get이 아닌 is가 붙는다.
 * 		1. 캡슐화로 만든다.
 * 		// => 데이터 보호
 * 		// => 데이터를 은닉화(private) / 메소드를 통해서 접근이 가능(통신을 담당 (다른 클래스를 연결))
 * 		   => 사용자 정의 데이터형 => 필요에 의해서 데이터를 묶어서 관리할 목적으로 만든다.
 * 	       => 사용자 정의 데이터형 => ~VO () 
 */
public class 문제1 {
	class PlayingCard { 
			int kind; 
			int num; 
			static int width; 
			static int height; 
			PlayingCard(int k, int n) { 
				kind = k; 
				num = n; 
			}
			
			/*
			 * 인스턴스 변수 : 데이터를 각각 저장시에 사용
			 * 정적변수 (공유변수) : 공통으로 사용되는 변수 => 메모리가 1개만 생성
			 * 		=> width , height
			 * ----------------------------- 프로그램이 종료시까지 메모리 유지 (자동 초기화)
			 * 지역변수 : 메소드에서 선언되는 변수 (지역변수, 매개변수)
			 * 			=> 메소드 안에서만 사용 ({}을 벗어나면 사라짐)
			 * 			=> 반드시 초기화후 사용
			 * 			=> k, n
			 */
			//캡슐화 문제
	class SutdaCard {
			private int num;
			private boolean isKwang;
			public int getNum() {
				return num;
			}
			public void setNum(int num) {
				this.num = num;
			}
			public boolean isKwang() {
				return isKwang;
			}
			public void setKwang(boolean isKwang) {
				this.isKwang = isKwang;
			}
	}
	//캡슐화 문제
	class Student {
			private String name;
			private int ban;
			private int no;
			private int kor;
			private int eng;
			private int math;
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getBan() {
				return ban;
			}
			public void setBan(int ban) {
				this.ban = ban;
			}
			public int getNo() {
				return no;
			}
			public void setNo(int no) {
				this.no = no;
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
		}

	}
}
