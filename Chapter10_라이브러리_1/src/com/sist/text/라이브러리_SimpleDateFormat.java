package com.sist.text;
/*
		java.text => 출력 형태를 만들어서 사용 (변경)
		------------
			SimpleDateFormat : 날짜 변경
			DecimalFormat : 숫자변환
			-------------- 가격 출력시 10000 => 10,000원
			MessageFormat : 데이터베이스 => INSERT, UPDATE에 사용
			--------------
			String name="", sex="", addr="", tel="";
			int age = 10;
			
			String sql = "INSERT INTO member VALUES(" + "'" + name + "','" + sex+"','" + addr + "','" + tel + "','" + age + "','";
			이거보단
			String sql = "INSERT INTO member VALUES('{1}', '{2}', '{3}', '{4}', '{5});  
 */
import java.util.*;
import java.text.*;
public class 라이브러리_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(); //패키지가 충돌하는 경우 import java.util.Date 이걸 쓰거나 java.util.Date date = new java.util.Date(); 이렇게 쓰거나
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); //SimpleDateFormat은 출력형식을 간단하게 만들어줌
		//yyyy-MM-dd , yyyy/MM/dd
		System.out.println(sdf.format(date));
		/*					오라클
			yyyy 년도   =>	rrrr
			MM 월	   =>	mm
			dd 일 	   =>	dd
			hh 시간	   =>	hh24
			mm 분	   =>	mi
			ss 초	   =>	ss
		 */
	}

}
