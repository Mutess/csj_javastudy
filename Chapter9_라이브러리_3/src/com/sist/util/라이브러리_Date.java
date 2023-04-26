package com.sist.util;
import java.text.SimpleDateFormat;
/*
	Date : java.util
	 1) 시스템의 현재 시간 및 날짜를 읽어오는 클래스
	    --------------------
	 2) Data클래스의 단점 => 기능이 빈약하다.
	 			|		  날짜만 저장하는 클래스 (오라클의 데이터형과 호환)
	 			|
	 		   보완 => Calendar
	 3) Date => SimpleDateFormat => java.text
	 			---------------- 원하는 스타일로 날짜 변경
	 4) 사용처 : 웹(등록일)
 */
import java.util.*;
public class 라이브러리_Date {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일 hh시:mm분:ss초"); //Month는 MM 대문자 , 분은 mm 소문자
		System.out.println(sdf.format(date));
		/*
			년도 : yyy(023) or yyyy(2023)
			월 : M => MM , M (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
					 --
					 01 , 11, 12
			일 : d => dd, d
			시간 : h => hh, h
			분 : m => mm , m
			초 : s => ss , s
			
			Date => 호환, 날짜만 저장하는 기능 (오라클) => DATE
		 */
		
	}
}
