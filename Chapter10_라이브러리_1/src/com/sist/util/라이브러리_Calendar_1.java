package com.sist.util;
/*
	라이브러리
		= 자바에서 지원
		  java.lang , java.util, java.io , java.net, java.text, java.sql
		  => 웹 : javax.xml, javax.servlet
		= 외부업체에서 지원
		  Jsoup(HTML Parse(끌어오기), 셀레니움), MyBatis, Spring, DBCP...
		
		= java.lang, String, System, Math, StringBuffer
		= import 생략
		= Object => 최상위 클래스, 모든 데이터형을 받을 수 있다.
		  저장할때 => 일반 기본형, 사용자정의 클래스 => 기본적으로 설정 Object (이때 중요한게 형변환)
		  형변환
		  	=>주요기능
		      clone() : 복제 (새로운 메모리 생성) => 디자인패턴 (GOF 23)
		      finalize() : 소멸자 (자동호출 => 메모리해제)
		      toString() : 객체를 문자열화
		      equals() : 객체 비교 (기본은 객체의 주소값, 오버이라드 사용시 실제 문자열을 비교)
		= system : gc()
				   System.out , System.in => 표준 입출력
		= Math : 수학
				 = round() : 반올림
				 = ceil() : 올림
				 = random() : 난수발생
		= StringBuffer : 문자열이 많은 경우 (제어)
				= append() : 문자열  결합
				= delete() : 문자제거
				= insert() : 문자열 추가
				----------------------- String에 존재하지 않는다
		= String : 문자열을 쉽게 제어가 가능하게 만든 클래스
					=> 웹, 윈도우, 빅데이터 (AI)
					=> equals(), trim(), substring(indexOf(), lastIndexOf()랑 같이 쓰임), length(), valueOf(), contains(), startsWith(), split(), replace(), replaceAll()
	
	java.util : 사용빈도가 높음
	----------
		= StringTokenizer : 문자열 분리 (쉽게 분리)
			= conuterToken() : 분리된 단어의 갯수
			= hasMoerTokens() : 분리된 갯수만큼 루프(반복문)를 돌릴때
			= nextToken() : 실제 분리된 단어 읽기
		= Wrapper : 기본형을 클래스화 (기능을 수행)
		  -------
		  	Integer => int
		  	Double => double
		  	Boolean => boolean
		  	Long => long 을 클래스화 시킨것이 Wrapper
		  	-----------------------------------------parseInt(), parseDouble(), parseBoolean, parseLong()
		  												=> 웹은 무조건 데이터가 String이라서 
		  														String
		  												=> 요청 <======> 요청처리(응답)
		  														String
		  														
		  => 기본형 / Wrapper는 호환
		  	Integer i = 10; ==> 클래스의 주소값이 아닌 실제값(리터럴) 대입
		  	------------------- 오토박싱(박싱)
		  	int a = new Integer(10) ==> 기본형에서 클래스 객체값을 받는다.
		  	------------------- 언박싱
		  	
		= Random
		 	=> nextInt(int bound)
		 	   nextInt(10) => 0~9
		
		= Arrays : 배열을 쉽게 관리할 수 있다.
			=> sort() : 정렬
			=> toString() : 배열 출력
			=> asList() : List형 변환
		
		= 날짜 관련
		 	Date : 기능이 없다 => 다른 프로그램과 호환
				   오라클 / MySQL에서 전송된 날짜 데이터를 받는 경우에 사용
				   날짜 저장용으로 주로 사용
			Calendar : 날짜에 대한 기능이 필요시 사용
					   Date를 보완한 클래스
					   날짜 설정
					   = set() => 년도/월/일/시간/분/초
					   = get() 
					   = 요일 읽기 => get(Calendar.DAY_OF_WEEK)
					   = 각달의 마지막 날
					   	 getActualMaximum() 
					   	 
		= 배열을 대체
		  = 페이지 만들때 int curpage = Integer.parseInt(page*10)-10;
		  			   								 (page-1)*10 이랑 같음
		  = 3대 클래스
		  	= String (이해도 필요 (웹))
		  	= Integer(parseInt 필요)
		  	= List
		  	
		  컬렉션 (데이터를 쉽게 관리) => 10개 (자동으로 저장공간이  설정)
		  
		  		Collection
		  			|
		  	-------------------
		  	|				  |
		   List				 set			Map => 인터페이스(구현이 안된 클래스)
		    |				  |				 |
		ArrayList(O)	   HashSet(O)	  HashMap(O)
		  Vector		   TreeSet		  HashTable
		LinkedList-Queue
		==> 제네릭 <안에 변환할 데이터형 및 클래스>
		
		List : 순서가 있음, 중복허용 (데이터베이스)
		Set : 순서가 없고, 중복이 없음
		Map : Key값은 순서가 없고 중복이 없음 하지만 Value(값)는 중복을 허용함 (도서관에 활용)
 */
//Calendar응용
import java.util.*;
public class 라이브러리_Calendar_1 {
	
	public static void main(String[] args) {
		//사용자로부터 년도/월 => 예약 / 체크인, 체크아웃 ==> 달력을 만들어야함
		Scanner scan = new Scanner(System.in);
		System.out.print("년도와 월를 입력하세요(2023 4) : ");
		int year = scan.nextInt();
		int month = scan.nextInt();
		
		//1일자의 요일을 가지고 옴 (4 => 4월 1일) 항상 달력을 만들땐 1일자의 날짜가 필요함
		Calendar cal = Calendar.getInstance();
		// 추상클래스는 메모리 할당을 못함 (즉, 미완성 클래스(구현이 안된 상태))
		// 구현할 클래스를 이용한다., 싱글턴 (NewInstance(), getInstance)
		/*
				static => 클래스명.메소드명() 이런 형태면 static 메소드
				Math.random()
				클래스명 객체명 = new 생성자() == 저 둘이 같으면 일반클래스 
				-----			  ------ == 저 둘이 다르면 추상클래스, 상속, 인터페이스
				클래스명 객체명 = 메소드명() => 추상클래스
		 */
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); //-1을 주는 이유는 Calendar.MONTH는 0부터 시작함
		cal.set(Calendar.DATE, 1);
		
		// 요일 구하기
		int week = cal.get(Calendar.DAY_OF_WEEK)-1; //요일 구함 week => 1번부터 시작하니까 -1을 해줌 0부터 시작할꺼라서
		// 입력달의 마지막날
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		//달력 출력
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(year+"년도 "+month+"월");
		System.out.println("\n");
		for (String s:strWeek) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for (int i = 1; i<=lastday; i++) {
			if (i == 1) { //맨처음 => 공백을 설정
				for (int j = 0; j<week; j++) {
					System.out.print("\t");
				}
			}
			//달력 출력
			System.out.printf("%2d\t", i);
			week++; 
			if (week > 6) { //일요일이면 다음줄에 출력
				week=0;//일요일
				System.out.println(); //다음줄에 출력
			}
		}
	}
}
