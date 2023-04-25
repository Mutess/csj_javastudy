package com.sist.String;
/*
	concat : 문자열 결합(+)
	
	String s1 = "Hello ";
	String s2 = "Java";
	s1.concat(s2) ==> "Hello Java";
	
	==> concat ==> MySQL LIKE문장을 만들 때
		WHERE name LIKE CONCAT('%', '홍', '%')
오라클	WHERE name LIKE '%'||'홍'||'%'  // ||문자열 결합


	endsWith : 끝나는 문자열이 같은 경우에 사용
	boolean endsWith(String s)
	String concat(String s)
	---------------------------------------
	필수로 기억해야 할것
	charAt()
	equals() : 대소문자 구분 , equalsIgnorecase() : 대소문자 구분없이 비교
	-------- ID, PWD 비교    ---------------- 영어검색, 영문이름
	indexOf(), 									lastIndexOf()
	--------- 위치확인(앞에서 문자나 문자열의 위치확인)    ------------ 뒤에서부터 찾음
	length() : 문자의 갯수
	startsWith() : 시작문자열이 같은 경우 => 서제스트
	substring() : 원하는 문자열을 자르는 경우
	trim() : 공백제거
	split() : 특정문자로 자르는 경우
	contains() : 포함문자열인지 확인
	ValueOf() : 모든 데이터형을 문자열로 변환
 */
public class 라이브러리_String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		 String s1 = "Hello "; // 공백도 문자다
		 String s2 = "Java!!"; // 
		 System.out.println(s1.concat(s2));
		 System.out.println(s1+s2);
		 
		 
		 if (s2.endsWith("!!")) {
			 System.out.println("!!자로 끝났다.");
		 }
		 else {
			 System.out.println("!!자로 끝나지 않았다."); 
		 } */
		
		//equals() : 대소문자 구분 , equalsIgnorecase() : 대소문자 구분없이 비교
		String[] data = {"Java", "java", "JAVA", "JAva", "JAVa", "jaVA", "javA"};
		for (String s:data) {
			if(s.equals("java")) {
				System.out.println(s);
			}
		}
		// equals는 대소문자를 구분해서 비교
		// 원형은 boolean equals (String s)
		// 라이브러리 외울때 1) 기능 2) 리턴형 3) 매개변수 4) 사용처 : 로그인, 상세보기
		System.out.println("=========equalsIgnorecase()==============");
		for (String s:data) {
			if (s.equalsIgnoreCase("java")) {
				System.out.println(s);
			}
			
		}
		/*
				equalsIgnoreCase : 대소문자를 구분하지 않고 비교
				원형 : boolean equalsIgnoreCase(String s)
				사용처 : 검색, 영문이름 , 영문으로 된 데이터를 찾는 경우
				한글 => equals
				한글 => 자음으로 찾기 => 사용자 정의로 만들어야 함(자바, 오라클)
				
		 */
		int max = 0;
		System.out.println("===========length()============");
		String[] data2 = {"apple",
						  "avocado", 
						  "banana",
						  "blackberry",
						  "blueberry",
						  "cherry tomato",
						  "cherry",
						  "coconut",
						  "grape",
						  "kiwi",
						  "lemon",
						  "lime",
						  "mango",
						  "melon",
						  "orange",
						  "papaya",
						  "peach",
						  "pear",
						  "persimmon",
						  "pineapple",
						  "plum",
						  "strawberry",
						  "tangerine",
						  "tomato ",
						  "watermelon" };
		// 1. 각 과일명의 문자길이를 출력
		for (String s:data2) {
			System.out.println(s+":"+s.length());  //문자길이 구할 때
		}
		for (String s:data2) {
			if (max < s.length()) {
				max = s.length();
			}
		}
		for (String s:data2) {
			if (s.length() == max) {
				System.out.println(s);
			}
		}
		int min = max;
		for (String s:data2) {
			if (min > s.length()) {
				min = s.length();
			}
		}
		for (String s:data2) {
			if(s.length() == min) {
				System.out.println(s);
			}
		}
		
		/*
			length() : 문자갯수
			원형 : int length()
			사용처 => 문자제한이 있는 경우, 비밀번호
			오라클 => VARCHAR(10)
		 */
		
		System.out.println("==============================");
		System.out.println("가장 큰 이름의 과일명을 출력하세요 : ");
		System.out.println(max);
		System.out.println("가장 적은 이름의 과일명을 출력하세요 : ");
		System.out.println(min);
		
		
		System.out.println("=================startsWith=================");
		// startsWith => 시작문자열이 같을때 
		// 원형 : boolean startsWith(String s)
		// 사용처 : 자동 완성기 (검색기), 쿠키 검색
		// 쿠키 => Key는 중복없이 => 구분 : Hotel1 Hotel2
		
		for (String s:data2) {
			if (s.startsWith("p")) {
				System.out.println(s);
		/*		try {
					Thread.sleep(1000); //CheckedException
				}catch(Exception ex) {} */
			}
		}
		System.out.println("==============trim()=============");
		/*
			trim() : 좌우공백을 제거해줌
			원형 : String trim()
			사용처 : 로그인, 회원가입, 검색...
			사용자가 입력시 => 공백을 입력시 지워주는 역할
		 */
		String id = "admin";
		if (id.equals(" admin ".trim())) { //좌우만 공백을 지워줌
			System.out.println("같은 ID입니다.");
		}
		else {
			System.out.println("다른 ID입니다.");
		}
		
		System.out.println("================contains================");
		for (String s:data2) {
			if (s.contains("a")) {
				System.out.println(s);
			}
		}
		/*	contains : 포함문장열을 찾을 경우
		  	원형 : boolean contains(String s)
		  	사용처 : 검색, 추천
		  	추천 => 네이버 블로그, 카페 => 포함된 영화명 언급횟수를 따져서 추천수 증가 
		*/
		System.out.println("===============valueOf===============");
		/*
			valueOf : String에서 유일한 static메소드
			모든 데이터형을 문자열로 변환
			원형 : static String valueOf((type)) => 오버로딩된 상태
			사용처 : 자바에서 윈도우 전송, 네트워크 전송, 웹(String만 인식)
		 */
		
		System.out.println(String.valueOf(10)+String.valueOf(30)); //모든 데이터형을 *문자열로 바꿔주는 거라 1030이 나옴
		
		System.out.println("===============substring===============");
		// substring(), indexOf(), lastIndexOf()
		
		String ss = "http://localhost:8080/JSPProject/main/main.do";
		String res = ss.substring(ss.lastIndexOf("/")+1);
		System.out.println(res);
		ss = ss.substring(ss.indexOf("//")+2);      //+1은 다음꺼부터 자르라는 뜻
		res = ss.substring(0, ss.indexOf("/"));     
		System.out.println(res);
		ss = "서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
		res = ss.substring(0,ss.indexOf("지"));
		System.out.println(res.trim());  //여기서 trim()을 주지 않으면 실제 지도 사용시 위치를 못찾음
		res = ss.substring(ss.indexOf("지")+2);
		System.out.println(res.trim());
		/*
			substring() : 문자열을 자르는 경우 //항상 substring은 indexOf, lastIndexOf랑 함께 쓰임
			오버로딩
			substring(int s) : s번째부터 마지막까지 잘라온다.
			substring(int s, int e) : s부터 e-1번째까지 잘라온다.
			원형 : String substring(int s)
			 	  String substring(int s, int e)
			사용처 : URL주소 제어, 주소 제어, 문자열이 긴 경우...
		 */
		ss = "홍길동,이순신,강감찬,박문수,을지문덕,심청이,춘향이";
		String[] names = ss.split(",");
		/*  특수문자별로 잘라서 배열에 저장...
			원형 : String[] split(String regexp)
			구분이 되어 있는 문자열이 있는 경우 분리...
		*/
		for (String name:names) {
			System.out.println(name);
		}
		ss = "갈비살"
				+ " 30,000원"
				+ "돼지갈비"
				+ " 17,000원"
				+ "돼지목살"
				+ " 15,000원"
				+ "삼겹살"
				+ " 15,000원";
		String[] menu = ss.split("원");
		for (String m:menu) {
			System.out.println(m+"원");
		}
		
		ss = "red?blue?green?black?white?yellow";
		String[] color = ss.split("\\?"); //or는 정규식에서 사용하는 기호 //| , ? , . , + , * , ^ // \\|이거랑 [|]이것도 가능
		for (String c:color) {
			System.out.println(c);
		}
		System.out.println("================replace()===============");
		/*	replace() : 문자나 문자열 변경
			원형 : String replace (char old, char new)
				  String replace (String old, String new)
		
		*/
		ss = "https://mp-seoul-image-production-s3.mangoplate.com/756210_1667892732041968.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
		//이걸 오라클에 저장 ==> &가 Scanner의 역할을 함 그래서 오라클에 저장시에 이름을 &을 다른 이름으로 바꿔서 저장을 해야함
		res = ss.replace("&", "#");
		System.out.println(res);
		System.out.println(res.replace("#", "&"));
		//데이터 수집 => html울 제거...
				
	}

}
