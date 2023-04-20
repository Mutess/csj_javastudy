package com.sist.main;

/*
 		232~233page
 		-------
 		추상클래스 (abstract)
 		==> 메소드 관련 (구현이 안된 메소드)
 			------------------------- 상속 관련 (오버라이딩)
 			** 오버라이딩
 			   -------
 			   => 상속을 받아서 기존의 기능을 변경해서 사용하는 기법 (modify)
 			   => 조건
 			   1) 상속관계가 존재
 			   => 추상클래스는 단독으로 사용이 불가능
 			   	  미완성된 클래스
 			   => 사용법은 상속을 내린 후에 상속을 받을 클래스를 통해서
 			   	  메모리 할당이 되는 상태
 			   	  class A
 			   	  class B extends A
 			   	  => A a = new B(); ==> 정상
 			   	  --------------------------
 			   	  => A a = new A(); ==> 오류
 			   2) 메소드명 동일
 			   3) 리턴형 동일
 			   4) 매개변수가 동일 (매개변수가 다른 경우 => 오버로딩)
 			   5) 접근지정어는 확대 / 축소하면 오류 발생
 			      -------
 			      private < default < protected < public
 		*** 기본 목적 : 여러개의 클래스를 모아서 한개의 이름으로 제어
 					  ----				 ---
 		*** 프로그램 설계 (미완성된 클래스)
 			= 요구사항 분석
 			  벤치마킹 : 여러개의 사이트를 참조
 			  예) 로그인 => 10000개의 레시피
 			  	회원가입 => 망고플레이트
 			  	   예약 => CGV
 			  	   결제 => 옥션
 			  	   
 			= 프로그램에 맞게 구현해서 사용
 			  예)
 			  	void btnClick() 
 			  	{
 			  		계산기 1번 버튼
 			  	}
 			  	=> 로그인 버튼 ==> 여기서는 무슨 버튼을 눌러야 로그인이 되는지 모름 (안되는 예)
 			  
 			  = 프로그램에 맞게 구현해서 사용
 			  예) // 그래서 추상클래스를 사용 // 구현이 되어있으면 안됨
 			  	void getConnection(); 
 			  	=> 데이터베이스 연결
 			  	=> 오라클, MS-SQL, MySQL, mariaDB...
 			  	   ----			 -----------------
 			  	   	
 			  = 한개의 객체로 여러개를 제어하는 프로그램
 			  	게시판
 			  	갤러리게시판
 			  	댓글형 게시판
 			  	묻고 답하기
 			  	-----------
 			  	
 	추상클래스
 	-------
 	==> 공통적으로 사용하는 부분 (코딩 내용이 다르게 만들 경우)
예)      게시판 : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기
 	묻고 답하기 : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기 , 답변하기
 	 댓글게시판 : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기, 댓글
 	 후기게시판 : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기, 업로드
 	 
 	 abstract class Board 
 	 {
 	 	목록출력();
 	 	찾기(){} // 찾기기능은 어디에 들어가도 기능이 비슷하기에 구현을 함
 	 	글쓰기();
 	 	내용보기(){} //기능은 어디에 들어가도 기능이 비슷하기에 구현을 함
 	 	수정하기(){} //기능은 어디에 들어가도 기능이 비슷하기에 구현을 함
 	 	삭제하기(){} //기능은 어디에 들어가도 기능이 비슷하기에 구현을 함
 	 }
 	 ***권장 사항 : 한개 이상의 추상메소드를 포함한다.
 	  					   ------- 구현이 안된 메소드
		abstract(이게 붙어있으면 구현이 안된 메소드) void find();
		Board content() {}
		void write() {}
	추상클래스의 특징 
	1) 단일 상속 => extends
	2) 메소드가 구현이 안된것이 있으면 미완성 클래스
	   => 메모리에 단독으로 저장이 불가능
	   abstract class A
	   => A a = new A() = X(에러)
	3) 상속을 내려서 구현된 클래스를 이용해서 메모리 할당
	   abstract class A
	   class B extends A
	   ------------------ 구현이 안된 메소드를 구현한다.
	   => A a = new B(); : 묵시적 형변환
	   			-------- 여기가 무조건 하위클래스가 들어가야함
	   	  double d = 10; 자동 형변환
	   => A a = new B();
	   	  B b = (B)a; ======> 명시적 형변환
	   *** 클래스는 상속관계, 포함관계 => 크기를 잴 수 있다.
	   상속을 내리는 클래스 > 상속을 받는 클래스
	   포함하고 있는 클래스 > 포함되는 클래스보다 크다
	   
	   class A
	   class B extends A ==> A > B ==> is-a
	   
	   class A
	   {
	   		B b = new B();
	   }
	   class B ==> A > B ==> has-a
	4) 목적 : 관련된 여러 클래스를 묶어서 한개의 이름으로 관리
			 -------------
			 => 공통적인 기능
			 => 버스, 마을버스, 고속버스 ,좌석버스
			 	----------------------------- 버스
			 => 개, 돼지, 말,...
			 	----------------- 동물
			 => 선, 네모, 삼각형, 원,...
			 	----------------- 도형
	
	5) 선언된 메소드가 있는 경우 => 		 	
	
 */
import java.io.*;
abstract class 도형 { //필요한 데이터를 하나로 모아주는 것
	//무조건 구현이 필요
	public abstract void draw();  //추상 메소드
	
	//필요시에 오버라이딩
	public void color() {
		System.out.println("검정색"); //기본값 설정
	}
}
class 선 extends 도형 {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("선을 그린다.");
	}
}
class 네모 extends 도형 {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("네모을 그린다.");
	}
}
class 원 extends 도형 {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다.");
	}
}
class 세모 extends 도형 {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("세모을 그린다.");
	}
}
//interface A {
//	
//}
/*
 	 	1. 일반 클래스 => new (O)
 	 	2. 추상 클래스 => 구현후 사용
 	 	3. 인터페이스  => 추상클래스와 동일 (O)
 	 	4. 종단 클래스 => 상속해서 확장이 불가능
 	 	5. static   => 메모리 => 클래스명으로 접근
 	 	---------------------------------
 */
//abstract class B {  
//	public abstract void aaa(); //필수로 구현
//	public  void bbb() {}       //필요하면 구현 아니면 안해도 됨
//	public  void ccc() {}
//	public abstract void ddd();
//	public abstract void eee();
//}
//class C extends B{ //상속을 받으면 구현의 강제성이 생김
//
//	@Override
//	public void aaa() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void ddd() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void eee() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
public class 추상클래스 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오버라이딩 기법
		도형 a = new 선();
		a.draw();
		a = new 원();
		a.draw();
		a = new 네모();
		a.draw();
		OutputStream io; //추상클래스인 이유 : 파일에 글쓰는 클래스인데 어떤 파일에 어떤 글이 들어갈지 몰라서 추상클래스임
	}

}


