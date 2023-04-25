package com.sist.lib;
/*
 		1. java.lang
 			Object : 모든 클래스의 상위 클래스 (모든 클래스는 상속을 Object로 받는다.)
 				기능(메소드)
 				= toString() : 자주 사용이 된다, 객체를 문자열화 시킨다.
 							   => 오버라이딩
 				= clone() : 객체 복제 => prototype = 복제해서 사용한다는 의미
 					  참조 : 같은 메모리를 이용 (얕은 복사)
 					  복제 : 다른 메모리를 제작 (깊은 복사)
 				= finalize() : 소멸자 함수 (호출되면 메모리 해제)
 				= equals() : 객체비교
 				
 			String : 문자열 저장하고 관리하는 클래스
 				기능 (메소드)
 				= equals() : 문자열을 비교할 때 사용
 					==은 주소값을 비교시 사용
 					로그인 처리, 상세보기, 아이디 증복체크, 비밀번호 비교...
 				= startsWith : 시작문자열이 같은 경우
 					=> 오라클 : 'A%'
 				= endsWith : 끝나는 문자열이 같은 경우
 					=> 오라클 : '%A'
 				= contains : 포함된 문자열(가장 많이 사용)
 				 	=> contains 사용시 추천하기 가능
 				 	=> 오라클 '%A%'
 			 	= replace : 문자나 문자열을 변경할 때
 			 		21.28.242.101
 			 		          102
 			 		          103..120 이건 바꾸는 걸 20번을 해야하지만 replaceAll은 한번에 교체가 가능함
 			 	= replaceAll : 문자나 문자열을 변경할 때(정규식) => 문자열의 형태
	 			 	21.28.242.101
	 			 		      102
	 			 		      103..120
	 			 	[0-9] {1,3}\\.[0-9] {1,3}\\.[0-9] {1,3}\\.[0-9] {1,3} 이 식은 IP전체를 한번에 바꿀때 사용
 			 	= trim : 좌우의 공백을 제거
 			 	= split : 특정 단어별로 나눠서 저장 => String[]
 			 		=> StringTokenizer
 			 	= valueOf : 모든 데이터형을 문자열로 변경
 			 	= length : 문자의 갯수
 			 	= substring() : 문자열을 자르는 경우 사용
 			 StringBuffer, StringBuilder...
 			 Wrapper : 기본형을 클래스
 			 	Byte, Integer, Double, Boolean , Float , Long...
 			 	System
 			 	Math
 			 	Thread
 			 	------------------ java.lang은 import를 생략할 수 있다.
 		2. java.util
 			Date/Calendar
 			StringTokenizer
 			Collection
 				|
 		---------------------------------------------------------
 		 | 					  | 							|
 	  **List				 Map	  				 Set(interface)
 		 |					  |								|
  **ArrayList		 **HashMap/ HashTable		    **hashSet/TreeSet
 	Queue LinkedList
 	Vector
 	Stack
 		2-1. java.text
 		3. java.io
 		4. java.net
 		5. java.sql
 		--------------------------기본 라이브러리
 		6. javax.xml
 		7. javax.servlet.http
 		8. 외부라이브러리 (자바에서 지원 X | 업체에서 지원 O )
 		   Open API => Jsoup , simple-json : mvnrepository.com
 		   org.
 		   com. //업체에서 만든 라이브러리
 		   
 		---------------- 1. DB(MyBatis, Hibernate(JPA))
 						 2. XML, JSON (VueJS, Ajax, React)
 						 3. 프레임워크 : Spring / Spring-Boot / Struts
 						 *** JSP(HTML=ThymeLeaf)
 		
 	    A a = new A();
 	    System.out.println("a="+a)
 	    						--  a.toString (생략)
 						 
 						 
 */
class A {
	int a = 10;
	int b = 20;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a=" + a + "b="+ b;
	}
	
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.toString());
		System.out.println(a);
	}

}
