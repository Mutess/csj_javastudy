package com.sist.util;

import java.util.StringTokenizer;

/*
		네트워크 
		
		동작 과정
		String s = "red|green|blue|black|yellow";
		=> split , StringTokenizer
		=> StringTokenizer st = new tringTokenizer(s,"|")
		   ----------------------------------------------
		   String[] coloer = s.split("\\|") "\\" 정규식 => 같은 패턴인걸 찾을때
		   			=> 원형 : split(String regex) ==> 원형에 regex가 들어있으면 정규식을 작성해라라는 뜻
		   			StringTokenizer st = new StringTokenizer(s,"|")
		   			
		   				hasMoreTokens
		   				
		   			-------------------------
			cursor	->  before First
		   			-------------------------
		   				red		=> nextToken() //값을 읽어옴
		   			-------------------------
		   				green	=> nextToken()
		   			-------------------------
		   				blue	=> nextToken()
		   			-------------------------
		   				black	=> nextToken()
		   			-------------------------
		   				yellow	=> nextToken()
		   			-------------------------	
		   				after Last	=> nextToken() => false(읽기 종료)
		   			-------------------------
		   			
		   			****갯수가 초과되면 오류남 (그래서 HasMoreTokens를 사용)
		   			
 */
public class 라이브러리_StringTokenizer_2 {

	public static void main(String[] args) {
		String s = "red|green";
		StringTokenizer st = new StringTokenizer(s, "|");
/*		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken()); */
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
