package com.sist.main;
/*
 	   1. 사용처 => 응용을 하면 어디서 어떤 것을 사용해야 좋은지 알 수 있음
 	   -------------------
 	   인터페이스 : 추상클래스의 일종 (보완)
 	   	 1) 다중 상속
 	   	 2) 인터페이스는 클래스와 동일 (상속을 받으면 상위클래스다.)
 	   	 3) 설계만 되어 있다. (구현이 안된 메소드만 모아서 선언)
 	   	 4) 장점
 	   	 	---
 	   	 	= 기능 설계 => 개발시간 단축 ----------------------개발 기간 8개월
 	   	 	  아키텍처 설계(PM) 	   DBA
 	   	 	  	  3개월				1개월
 	   	 	= 요구사항 분석 =>    데이터베이스 설계 => 데이터 수집
 	   	 	-----------------------------------------
 	   	 		추상 클래스 / 인터페이스 설계
 	   	 				 => 화면 UI ==> 퍼블리셔		==> 1개월
 	   	 				 => 구현	   ==> 웹 프로그래머    ==> 2개월
  	   	 				 => 테스팅   ==> 테스터 		==> 1개월
 	   	 				 => 배포	   ==> PL			==> 1개월
 	   	 			
 	   	 	= 표준화 가능 : 같은 메소드를 사용
 	   	 	  -------- Spring (통합)
 	   	 	  프레임워크 : 세트 ==> MyBatis, JPA, Jquery, VueJS, React
 	   	 	= 서로 관계없는 클래스 연결해서 사용이 가능
 	   	 	= 유지보수가 편리하다.
 	   	 	  (수정)
 	   	 	= 독립적으로 사용이 가능
 	   	------------------------------------
 	   	클래스 여러개를 묶어서 한개의 이름으로 제어가 가능
 	   			List(*****) 가변형  Map, Set
 	   			 |
 	   	---------------------------------------------------
 	   	| 			   |			|			|			|
 	  ArrayList	  LinkedList	  Vector	  Queue		  Stack
 	  
 	  List list = new ArrayList()
 	  list = new Vector()
 	  list = new LinkedList()
 	  list = new Queue()
 	  list = new Stack()
 	  
 	  웹에서 가장 많이 사용하는 라이브러리(3대 라이브러리)
 	  1. String
 	  2. List
 	  3. Integer (int를 사용하게 편리하게 만든 클래스)
 	  	 웹 /윈도우 => 모든 데이터형(String)
 	  	 page=1   => "1" => 1(int) ==> Wrapper클래스
 	  	 <input type = text> = 문자열로 보냄
  	  	 JTextField = 문자열로 보냄
  	  	 
  	  	 
  	  => 형식) 
  	  	 [접근지정어] interface InterFaceName 
  	  	 {
  	  	 		-----------------------------
  	  	 			상수
  	  	 				int a; ==> 오류
  	  	 				---------------
  	  	 				(public static final) int a = 10;
  	  	 				-------------------- 자동 추가
  	  	 		-----------------------------
  	  	 			추상메소드
  	  	 				void display();
  	  	 				(public abstract) void display();
  	  	 				----------------- 자동추가
  	  	 		-----------------------------
  	  	 }
  	  	 자동추가
  	  	 1) import java.lang.*; => String, Math...
  	  	 2) 메소드 => void aaa()
  	  	 			{
  	  	 				=> return;
  	  	 				---------자동 추가
  	  	 			}
  	  	 3) 생성자 => class A
  	  	 			{
  	  	 				=> A(){}
  	  	 				--------자동추가
  	  	 			}
  	     4) 인터페이스
  	     	변수선언 => (public static final) int a = 10;
  	     			  (public abstract) void disp();
  	     			  구현이 가능한 메소드
  	     			  (public) default void aaa(){}
  	     	interface는 상수, 메소드 => public만 사용한다.
  	    = 선언만 되어있다 = 상속을 내린다.
  	      => 상속받은 클래스가 구현을 해서 사용 (오버라이딩 기법)
  	    = 다증 상속을 지원한다.
  	      -------
  	      상속 과정
  	      -------
  	      interface A //선언만
  	      class B extends A ==> 오류
  	      		  -------- 확장해서 사용
  	      class B implements A
  	      		  ---------- 구현후 사용
  	      
  	      interface ==> interface 
  	      interface A
  	      interface B (extends) A // 확장
  	      
  	      interface ==> class
  	      interface A 
  	      class B  (implements) A  //구현
  	      --------------------------------
  	      class   ==>   interface ==> 오류
  	      --------------------------------
  	      
  	      interface A
  	      interface B extends A
  	      class C implements B ===> 단일상속
  	      
  	      interface A
  	      interface B
  	      class C implements A,B   ===> implements는 다중상속이 가능
  	      
  	      interface A
  	      interface B
  	      class C
  	      class D extends implements A,B ==> 이렇게 다중상속을 받을 수 있음
  	      
  	      class E extends JFrame implements MouseListener, KeyListener,ActionListener, Runnable
  	      => game : 마우스이용, 키보드이용, 버튼이용, 쓰레드
  	      
  247page => 형식
  		  일반 메소스 == 오류
  		  interface A {
  		  	JDK1.8이상 => 
  		  	default void display(){}
  		  	abstract void doGame();
  		  }
  		  
  		  interface A {
  		  	 
  		  	void aaa();
  		  }
  		  class B implements A { //구현이 되어있지 않는데 구현된걸 가져오라고 해서 오류남
  		  		
  		  }
  		  
  		  
  		  interface A {
  		  	 
  		  	void aaa(); //접근지정어가 default로 되어있어서 오류남
  		  }
  		  class B implements A { 
  		  		public void aaa(){}
  		  }
  		  
  		  249page
  		  1) 인터페이스는 객체를 생성할 수 없다 (구현이 안된 메소드를 가지고 있기 때문에 메모리에 저장 불가능) ==> 익명의 클래스를 이용하면 사실 가능함
  		  	 인터페이스 = new 구현한 클래스()
  		  
  		  2) 인터페이스는 다중상속이 가능하다
  		  	 class A implements interface , interface... 여러개 상속 가능
  		  	 							---
  		  	 							컴마는 나음
  		  3) 

 */
interface AA {
	int a = 10;
	void aaa();
}
interface BB {
	int a = 20;
	void bbb();
}
class CC implements AA,BB { // CC cc => aaa(), bbb(), print()에 접근가능
	//충돌이 안된 이유는 AA.a, BB.a로 다른 메모리에 있어서 그럼
	public void print() {
		System.out.println(AA.a);
		System.out.println(BB.a);
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("BB.bbb 구현");
		
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AA.aaa 구현");
	}
}
/*
 		class A 
 		class B extends A ===> B   ============> B b = new B();
  하지만	class C
 */

interface A {
	void display();
//	private int a = 10; //인터페이스는 항상 public이고 접근지정어는 축소시키면 안됨
}
class B {
	A a = new A() {
		public void display() {
		}
	};
}


public class 인터페이스 {

	public static void main(String[] args) {
//		CC c = new CC();
//		c.print();
		CC c = new CC(); //한번에 쓸 수 있게 메모리 할당
		c.aaa();
		c.bbb();
		
		
		/////////////////////
		AA aa = new CC(); //implements도 extends와 동일하게 적용
		// 단점은 bbb()는 사용불가
		aa.aaa();
		//print에 접근못함
		//aa.bbb();
		BB bb = new CC();
		bb.bbb();
		//print에는 접근못함

	}

}
