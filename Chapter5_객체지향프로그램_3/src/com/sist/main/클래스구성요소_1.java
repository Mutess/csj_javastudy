package com.sist.main; // 제일 최상단에 있어야함 package -> import -> class
//폴더  => 관련된 java파일 저장 = 찾기
// 다른 패키지의 클래스를 불러올때 반드시 import를 사용해야 된다.
//import com.sist.main.클래스구성요소_1;
//import com.sist.main.*;
//import java.util.*;
// *은 java.util 안에 있는 모든 클래스를 가져옴
//숫자을 앞에 사용할 수 없다.

//주의점 : 만들때 (예약어)키워드는 시용할 수 없다. (대소문자 구분 => 소문자 권장), 특수문자 사용가능
//ex) com.sist.class, com.sist.int com.sist.public
//다른 패키지에서는 같은 이름의 클래스를 만들 수 있다.
// => 메소드 => 접근방식을  .을 사용함
// => 인스턴스 메소드 => static이 없는 메소드 => 메모리에 따로 저장
// 클래스의 분리
/*
 * 	클래스 분리
 * 	 = 데이터형
 * 	 = 액션 (동작) => 메소드
 * 	 -------------------
 * 
 *   1) 데이터형
 *   2) 데이터 처리
 *   3) 조립 => main => 메인보드
 *   ------------------------------------------
 *   메소드 => 140
 *   
 *   1. 메소드의 구성요소
 *   	리터타입(결과값) 메소드명 (매개변수 -> 요청데이터) => 선언부
 *   	{
 *   		구현부
 *   		return 결과값
 *   			   ----
 *   	}
 *      
 *      리턴타입 : 사용자 요청한 내용을 처리후 결과값의 데이터형
 *      		 1) 결과값이 있는 경우
 *      		 2) 결과값이 없는 경우=> void
 *      		 리턴타입 / return의 값은 항상 일치하지 않는다.
 *      		 -----    ------
 *      		 항상 리턴타입이 결과값보다는 크거나 같다.
 *      			 ------  ----
 *      			  int     10.5  => 오류
 *      			 double    10 	=> 정상 수행
 *      		
 *      		3) 리턴타입이나 결과값은 1개만 나온다.
 *      		   ** 여러개일 경우 : 배열, 클래스를 이용한다.
 *      						   --   ----  주소 => 얕은 복사
 *      
 *      		예) int[] display()
 *      			{
 *      				int[] arr = new int[5];
 *      				return arr;
 *      			}
 *      		=> int[] arr = display()
 *      		=> int[] arr = new int[5];
 *      		   int[] arr2 = arr;
 *      
 *      
 *      		   class A
 *      		   A display() {
 *      				A a = new A();;
 *      				return a;
 *      		   }
 *      
 *      		   A aa = display() ==> aa=a
 *      
 *      		   String display() {
 *      				String s = "Hello";
 *      				return s;
 *      		   } 
 *      
 *      		   리턴형 : 기본형, 배열, 클래스 (사용자 정의 데이터형)
 *      		   return int => 10..
 *      				  double => 10.5...
 *                        char => 'A'
 *                        배열 => 배열명 (주소)
 *                        int[] arr = new int[5];  // arr에 값을 채웠으니까 
 *                        return arr; //리턴은 값을 채워넣은 arr만 반환함
 *                        클래스 => 객체명(주소)
 *                        A a = new A();
 *                        retrun a;
 *         매개변수 : 사용자 요청값
 *          getView (int page)
 *          		 --------- 볼 페이지
 *          findData(String s)
 *          		 --------- 찾을 값
 *          login(String id, String pwd)
 *          	  --------------------- 로그인에 필요한 id, pwd 값
 */
class Student {
	int hakbun;
	String name;
	String sex;
	int kor;
	int eng;
	int math;
}
class StudentSystem {
/*	int getHakbun() {
		return 1;
	}
	String getName() {
		return "홍길동";
	}
	String getsex() {
		return "남자";
	}
	int getKor() {
		return 90;
	}
	int getEng() {
		return 80;
	}
	int getMath() {
		return 78;
	} */
	Student getData() {		//앞에 Student는 int와 같은 데이터형임
		Student s = new Student();
		s.hakbun = 2;
		s.name = "심청이";
		s.sex = "여자";
		s.kor = 90;
		s.eng = 80;
		s.math = 100;
		
		return s;
	}
}
public class 클래스구성요소_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student();
		StudentSystem ss = new StudentSystem();
//		hong.hakbun = ss.getHakbun();
//		hong.name = ss.getName();
//		hong.sex = ss.getsex();
//		hong.kor = ss.getKor();
//		hong.eng = ss.getEng();
//		hong.math = ss.getMath();
		
		Student shim = ss.getData();

	}

}
