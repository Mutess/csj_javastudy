package com.sist.lang;

import java.util.ArrayList;

/*
	Wrapper : 전체를 감싼다
	-------- CSS (container)
	프로그램 개발 => 기본형 데이터형을 객체단위로 저장할때
	
	List<int> => 오류
		----- 항상 클래스형이 들어가야함
	List<Integer> => 정상수행
	=> 기본형을 클래스화 해서 사용
	   ------------- Wrapper
	   
	   기본형					클래스형 		=> 기본형에 기능을 추가해서 클래스화 시킨 것 (Wrapper)
	   int					Integer
	   long					Long
	   byte					Byte
	   double				Double
	   boolean				Boolean
	   ---------------------------------------------------------------------------------
	   상표명 		별점(4.3)
	   -----		---
	   String 	 	double  ==> String(웹 => 문자열)
	
*/
public class 라이브러리_Wrapper_1 {

	public static void main(String[] args) {
		String s = "4.3";
		double d = Double.parseDouble(s); //(Wrapper클래스)String을 double형으로 바꿔줌
		/*  Wrapper 사용처 => 문자열을 원하는 데이터형으로 변경할떄 주로 사용
			=> 클라이언트에 배포 => 윈도우 / 브라우저 / 핸드폰
			================> 모든 데이터형이 문자열로 이루어져 있음 => 이걸 기본형 데이터로 변경
			클래스명 : 객체단위로 저장 (List<클래스형>)
			문자열 => 해당 데이터형으로 변환 ==> parse데이터형(); ==> static으로 이루어져 있음
			오토박싱 / 언박싱
			
				오토박싱 (클래스에 해당 데이터값을 설정)
				Integer i = 10; // 일반 데이터형이랑 호환이 되기에 실제들어가는 값만 입력 == String s = "";
				
				언박싱 (기본형에 클래스 객체를 설정)
				int aa = i; 
		 */ 
		Integer i = 100; // int i = 100;
		System.out.println("i="+i);
		int aa = i; //서로 호환이 됨
		System.out.println("aa="+aa);
		
		/*
			void display(Integer i1, Integer i2)
			=> display(10,20)
			
			page=1 ==> (int)"1" => 1
			page+1 ==> "1"+1 => 11
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		/*
			1. 문자열을 해당 데이터형으로 변환 (기본형 => 기능부여)
			   문자열 => 정수형 Integer.parseInt("10")
			   문자열 => 실수형 Double.parseDouble("4.5")
			   문자열 => 논리형 Boolean.parseBoolean ("true")
			   
			2. 객체단위로 저장할때가 있다 (자료구조 => Collection)
		 */
		
	}

}
