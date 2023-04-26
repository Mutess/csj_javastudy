package com.sist.util;
/*
		StringTokenizer : 문자열 분리
		1) split() => 대체
		2) 빅데이터 / 네트워크 / 웹
		-----------------------
		기능
		  = 생성자
		  	StringTokenizer st = new StringTokenizer ("구분할 문자열", 구분자) => 구분자별로 자름
		  	ex)String s1 = "애니메이션/어드벤처/코미디";
		  	StringTokenizer st = new StringTokenizer (s1, "/") => 구분자별로 자름
		  	
		  	StringTokenizer st = new StringTokenizer ("구분할 문자열") => 공백별로 자름
			ex) String s2 = "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
		  	StringTokenizer st = new StringTokenizer (s2) => 공백별로 자름
		  	
		  = 기능
		  	1) countTokens() : 분리된 데이터 갯수
		  	2) nextToken() : 분리된 데이터 읽기
		  	3) hasMoreToken() : 분리 갯수만큼 루프수행
 
 */
import java.util.*;
public class 라이브러리_StringTokenizer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "애니메이션/어드벤처/코미디";
//		StringTokenizer st = new StringTokenizer(s1,"/");
//		System.out.println(st.countTokens()); // 자른 데이터를 셀때
//		System.out.println(st.nextToken()); // 자른 데이터를 가져올 때
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		String s2 = "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬" 
				  +" 박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬" 
				  +" 박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				  +" 박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				  +" 박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				  +" 박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				  +" 박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬";
		StringTokenizer st = new StringTokenizer(s2);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
		
		
		
		
//		System.out.println(st.countTokens());
//		int a = st.countTokens();
//		for (int i = 0; i<a ;i++) {
//			System.out.println(st.nextToken());
//		}
//		System.out.println(st.countTokens()); // 자른 데이터를 셀때
//		System.out.println(st.nextToken()); // 자른 데이터를 가져올 때
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
	}

}
