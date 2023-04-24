package com.sist.exception;
/*
 		267=> try~catch (예외복구)
 		
 		try : 정상실행하는 코딩
 		catch : 예외가 발생시에 복구하는 과정 (여러개 사용이 가능 => 순서) => 계층구조
 		-----------------------------------------------------------------
 		예외처리 => 소스상에서 수정이 가능한 에러(가벼운 에러)
 		------- 사전에 에러를 방지하는 프로그램
 				비정상 종료를 방지하고 정상 종료가 가능하게 만드는 목적
 					계층구조(예외처리 계층구조)
 					------
 					
 					Object : 모든 클래스의 상위 클래스(모든 클래스는 Object상속을 받는다.)
 					   |
 					Throwable : 에러의 최상위 클래스
 					   |
 			------------------------------
 			|							|
 		  Error						Exception
 		  ------					---------
 		처리가 불가능					처리가 가능
 	=>  메모리 부족				=>  0으로 나누는 경우
 	=> 	윈도우 충돌				=>  정수 변환의 문제
 								=>  형변환, 파일명이 틀린 경우
 								=>  Web에서 URL/IP 틀린 경우
 								=>  객체가 null일때 주소가 접근하는 경우
 								
 				Exception : 예외처리의 최상위 클래스
 				---------
 					|
 				1) CheckedException : 컴파일시에 예외처리를 했는지 여부 확인
 									  반드시 예외처리를 해야한다.
 									  
 				2) UnCheckException : 컴파일시에 예외처리를 확인하지 않는다
 									  필요시에만 예외처리
 									  
 				Exception
 					|
 		--------------------------------------------------
 		1) CheckedException
 					|
 				=> IOException : 파일 입출력, 메모리 입출력, 네트워크 입출력
 					(java.io)
 				=> SQLException : 오라클 연결 (오라클이 인식하는 언어 : SQL)
 					JDBC ==> DBCP => ORM (MyBatis, JPA)
 					Web = 핵심 (데이터베이스 연동)
 					(java.sql)
 				=>  malformedURLException : IP/Web URL
 					(java.net)
 				=>  classNotFoundException : 클래스이름으로 메모리 할당 => 클래스명, 패키지명 틀린경우
 					= 스프링에서 주로 사용하는 기술 (리플렉션) 
 											 ------- A a = new A(); Class.forName("A")
 											 private까지 접근이 가능
 				=>  InterruptedException : 쓰레드 (한개의 프로세스안에서 여러개의 작업을 동시에 제어) 
 					충돌과 관련
 				=>  java.lang / java.util => 예외처리와 관련이 없다.
 				=>  예외처리는 필수 : 정상상태를 유지 => 견고한 프로그램
 				
 		2) UnCheckException : 예외처리는 필요한 경우에만 사용
 				Exception
 					|
 		(가장큼)	RuntimeException : 실행시 (인터프리터) => 사용자입력, 프로그램 실수
 					|
 				NumberFormatException : 정수변환에서 에러
 					=> Wrapper : 기본형을 사용하기 쉽게 클래스형으로 만들어줌
 								boolean => Boolean
 								int => Integer
 								double => Double
 					   Integer.parseInt(" 10"); => 이런 에러남 // 윈도우/Web은 문자열만 사용하기 때문에
 					   	웹에서 전송된 데이터를 받는 경우
 					   	------------------------
 					   		String getParameter() => 정수형 변환
 					   	Jsoup : 데이터 수집 (String)
 				ArrayIndexOutBoundsException : 배열범위 초과
 				-------------------------------- 컬렉션
 				arithmeticException : 0으로 나눌 경우
 				NullPointExcetion : 객체나 배열에 주소가 없는 경우
 					A a;,int[] arr; => null ==> 반드시 주소값을 입력후 사용
 					---- A a = new A();
 				ClassCastException : 클래스 형변환이 잘못된 경우
 				class A 
 				class B extends A
 				B b = (B)new A(); Exception 예외발생코드
 				--------------------------------------
 				A a = new B();
 				B b = (B)a; 정상수행코드
 				
 		예외처리의 기본 (267page)
 		try~catch
 		---------
 		형식 
 			try {
 				정상수행이 가능한 코딩 => 지금까지 소스가 들어간다.
 			}catch (예외처리 종류 설정)
 			{
 				수행과정에서 오류발생시 처리되는 부분
 			}
 			-------------------------------------------
 			
 			try ~ catch => 소스 전체 처리 : 종료
 						   -----------
 						   부분 처리 : 제외
 				
 				
 */
public class 예외처리_예외복구_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try {
			for (int i = 1; i <= 10; i++) {
				try {  //여기에 try-catch를 쓰면 for문 안에 있기때문에 예외처리후 다시 for문으로 돌아가서 수행(좋은거임)
				int j = (int)(Math.random()*3);
				int k = i/j;
				System.out.println("i="+i+" ,k="+k);
				}catch (Exception ex) {System.out.println("0으로 나울수 없습니다");}
				
			}
		//}catch (Exception ex) {
			
	//	}
	}

}
