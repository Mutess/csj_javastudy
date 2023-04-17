package com.sist.main;
/*
 *   1. 클래스 구성요소
 *   class ClassName {
 *   -----------------------------
 *     변수 (멤버변수)
 *     1) 멤버변수(인스턴스)
 *     	  [접근지정어] 데이터형 변수명; //어느 클래스까지 사용이 가능한지 설정
 *     	  => new를 사용시마다 메모리가 따로 생성되는 변수\
 *     	  => new를 이용해서 반드시 메모리를 만들고 사용해야 된다.
 *     	  => 자동 초기화가 된다.
 *     		 기본형 
 *     			int => 0
 *     			long => 0L
 *     		 	double => 0.0
 *     			boolean => false
 *     
 *     		 참조형 (배열, 클래스) => 배열, 클래스는 메모리 주소를 참조해서 저장된 모든 데이터를 관리
 *     						  ** 배열은 같은 크기의 데이터만 관리 (사과박스, 배박스)
 *     						  ** 클래스는 다른 크기의 데이터 관리 (종합과일세트)
 *     						  ** 초기화는 null (주소가 배정되지 않은 상태)
 *     
 *     2) 정적변수 (공유변수) => 메모리 공간을 한개만 생성 => 모든 객체가 공유
 *     	  [접근지정어] static 데이터형 변수명;
 *     					   ------
 *     					   기본형, 배열, 클래스 (데이터형이다)
 *     					   => new을 사용하지 않아도 컴파일러에 의해 자동 메모리 저장
 *     
 *     3) 변수 사용 방법 
 *     	  인스턴스 변수
 *     	  ----------
 *     		반드시 메모리에 저장
 *     		class A {
 *     			int aa;
 *     		}
 *     
 *     		A a = new A();
 *     		a.aa = 100;
 *     		- 객체(인스턴스)를 통해서 접근해야 된다.
 *        정적 변수
 *        	class A {
 *        		static int a;
 *        	}
 *        	메모리 할당을 안해도 된다.
 *        	=> A.a (클래스명으로 접근이 가능) => 클래스변수, 공유변수
 *     *** 보안 중심
 *     		1) 모든 멤버변수는 private 데이터를 은닉화
 *     *** 멤버변수는 사용이 가능한 옵션 : static, final(상수)
 *   -----------------------------------------------------
 *     2) 생성자 
 *     		= 특징
 *     			1) 생성자는 클래스명과 동일
 *     			2) 생성자는 리턴형을 가지고 있지 않다. (void도 리턴형을 가지고 있어서 생성자가 아님)
 *     			3) 오버로딩(중복메소드 중복) => 생성자는 필요시에는 여러개를 만들 수 있다.
 *     			   *** 생성자를 만들지 않는 경우 (컴파일러가 자동으로 기본 생성자를 만들어 준다)
 *     			   오버로딩 => 같은 메소드명으로 여러개의 기능을 만들어서 사용
 *     			   = 메소드명이 동일
 *     			   = 매개변수의 갯수나 데이터형이 다르다.
 *     			   = 한개의 클래스안에서 제작
 *     			   = 리턴형은 관계없다.
 *     			   예)
 *     				plusInt (int a, int b)
 *     				plusDouble (double d1, double d2)
 *     				plusString (String s1, String s2)
 *     				plusChar (char c1, char c2)
 *     				plusByte 
 					plusIntDouble
 					 |
 					 |
 					plus(int a, int b) (매개변수의 데이텨형을 다 다르게 잡으면 다른 메소드로 인식함) (이것이 오버로딩)
 					plus(double d1, double d2)
 					plus(String s1, String s2)
 					
 					= 역할
 					  게시판
 					  이름 / 게시판 / 내용
 					  이름 + 제목으로 찾기
 					  이름 + 내용 이런식으로 바뀌면서
 					  
 					  = 객체 생성시에 호출되는 메소드
 					  	생성자 호출시에는 반드시 new생성자 ()
 					  					   ----------
 					  					   
 					  = 멤버변수의 초기화
 					  	= 외부에서 데이터를 읽어서 초기화 (구현)
 					  	*** 초기화
 					  	1) 명시적 초기화
 					  		class A {
 					  			int a = 10;
 					  			static int b = 20;
 					  		}
 					  	2) 초기화 블록 : 멤버변수, static 변수 초기화가 가능
 					  		 => this 사용이 가능
 					  		 class A {
 					  		 	int a;
 					  		 	{// 클래스 안에서는 for문 사용이 불가해서 이러면 초기화 블록를 사용해서 구현을 할 수 잇음
 					  		 	for (int i = 0; i < 10; i++) {
 					  		 		a=i;
 					  		 		}
 					  		 	} ==> 인스턴스 초기화 블록
 					  		 }
 					  	3) static 초기화 블록 : static변수만 가능
 					  		 => this 사용이 불가능
 					  		 class A {
 					  		 	static int a;
 					  		 	static 
 					  		 	{ == static 블록 ///static이고 쓰고 블록 열면 됨
 					  		 	for (int i = 0; i < 10; i++) {
 					  		 		a=i;
 					  		 		}
 					  		 	}
 					  		 	
 					  		 }
 					  	4) 생성자 : 멤버변수, static 변수 초기화 가능
 					  				=> 가장 많이 사용된다.
 					  		 => this 사용이 가능
 					  		 class A {
 					  		 	static int a;
 					  		 	a() {
 					  		 	for (int i = 0; i < 10; i++) {
 					  		 		a=i;
 					  		 		}
 					  		 	}
 					  		 	
 					  		 }
 					  	*** 인스턴스 변수는 생성자를 주로 이용한다.
 					  	*** static변수는 생성자보다 static블록을 많이 사용함
 					  	*** 생성자는 필요시마다 호출해야 됨
 					  		초기화 블록은 자동 호출
 		
 	   순서
 	   명시적 초기화 ==> static 블록 ==> 인스턴스 블록 => 생성자
 	   => 초기화 (1. 윈도우, 2.네트워크 연결, 3. 파일 읽기, 4. 데이터베이스)
 	   => 오버로딩을 지원
 	   	  ------ 생성자를 여러개 사용이 가능
 	   	  class A {
 	   	  	this()
 	   	  	A() {
 	   	  		==> 기본 생성자 => 생성자가 존재하지 않는 경우 자동 생성된다.
 	   	  	}
 	   	  	this(10)
 	   	  	A(int a){
 	   	  		=> 다른 생성자를 호출이 가능
 	   	  		this() = 생성자 블록 첫줄에 사용이 가능
 	   	  		초기값을 주기 위해서 사용자로부터 받는다.
 	   	  	}
 	   	  	this(10, "") => A(10, "")
 	   	  	A(int a, String n;) {
 	   	  		초기값을 주기 위해서 사용자로부터 받는다
 	   	  	}
 	   	  }
 	   	  
 	   	  void display (int int int)
 	   	  void display (int double int)
 	   	  void display (int int float)
 	   	  void display (double double double)
 	   	  
 	   	  => display (10.5, 10, 'C')
 	   	  		double int char
 	   	  		
 	   	  this() => 생성자 호출 (자신의 생성자)
 	   	  this => 자신의 객체
 	   	  ----
 	   	  	구분자 => 지역변수와 멤버변수가 같은 경우에 구분
 	   	  	class A {
 	   	  		int a;
 	   	  		void disp(int a) {
 	   	  			//a를 사용하면 => 매개변수값만 사용이 가능
 	   	  		}
 	   	  	}
 	   	  	
 	   	  	==> 멤버메소드 (static이 아닌 메소드)
 	   	  		=> 모든 멤버변수
 *   -----------------------------------------------------
 *    메소드 : 다른 클래스와 연결 담당 (메세지)
 *    		  멤버변수에 대한 제어
 *    		  반복제거, 재사용, 수정.....
 *    				  ---------
 *    				  한가지 기능만 수행이 되게 만든다.
 *    		  	메소드는 호출시에 처음부터 끝까지 수행 => 호출한 위치로 돌아간다.
 *    			웹에서 동작하는 부분이 메소드다
 *    			-----------------------
 *    			메뉴 클릭, 버튼 클릭, 이미지 클릭 ...
 *    			엔터...
 *    	멤버메소드 
 *    	 [접근지정어] 리런타입 메소드 (매개변수목록) 선언부 {
 *    	 	구현부
 *       }
 *       공유 메소드
 *       [접근지정어] static 리런타입 메소드 (매개변수목록) 선언부
 *       --------- ------
 *       static [접근지정어]
 *       {
 *       	구현부
 *       }
 *       메소드 호출
 *       멤버메소드
 *         클래스 객체명 = new 생성자();
 *         객체명.메소드()
 *       공유메소드
 *         클래스명.메소드()
 *         
 *       메소드 유형
 *       -----------------
 *       리터타입  	매개변수
 *       ----- 한개만 사용이 가능 (결과값이 많은 경우 ==> 클래스 ,배열)
 *         O		  O
 *         O		  X
 *         X		  O
 *         X		  X
 *         
 *         예)
 *         	  사용자 로그인 요청
 *         	  boolean ==> String id, String pwd
 *         	  plus : 사용자는 두개의 정수 ==> 결과값은 더한 값
 *            검색 : 사용자는 검색어를 보낸다. => 찾은 모든 내용
 *            ----------------------------------------
 *            	  String[] find(String findData)
 *        상세보기 => 한개만 찾는다 (번호로 구분)
 *        		  Movie detail (int 영화번호)
 *   -----------------------------------------------------
 *   

 *   }
 */

public class 클래스_구성요소_1 {
	/*class A {
		int b;
		static int a;
		{
			b = 10;
			a = 10;
		}
		
		//static 안에는 인스턴스만 사용할 수 있음.
		/*static {
			for (int i = 1;i < 10; i++) {
				a=i;
			}
		}
	}
		A() {
			for (int i = 1;i < 10; i++) {
				a=i;
			}
		}
	
	}*/
	
	class D {
		int a = 10;
	}
	
	class C extends D{
//		int a = 20;  //메소드 오버라이딩
		int aaa = 20;
		void display(int a) {
			System.out.println(a);
			System.out.println(this.a);
			this.a = a; // this는 제일 위에 있는 멤버변수의 주소를 가리킴
			//지역변수에 없으면 멤버변수에서 찾음
			aaa();
		}
		void aaa() {
		}
		// C클래스가 가지고 있는 메소드가 아니다. ==> 공유목적
		static void bbb() {
			
		}

	public static void main(String[] args) {
		//System.out.println(A.a);
		B bb = new B();
		System.out.println(bb.a);
		System.out.println(B.b);
		
		}
	}
}
class B {
	int a = 10;
	static int b = 20;
	{
		System.out.println("인스턴스 초기화 블록(변경 전) : a=" +a);
		a = 100;
		System.out.println("인스턴스 초기화 블록(변경 후) : a=" +a);
	}
	static {
		System.out.println("static인스턴스 초기화 블록(변경 전) : b=" +b);
		b = 100;
		System.out.println("static인스턴스 초기화 블록(변경 후) : b=" +b);
	}
	B() {
		System.out.println("인스턴스 생성자 블록(변경 전) : a=" +a);
		a = 1000;
		System.out.println("인스턴스 생성자 블록(변경 후) : a=" +a);
		
		System.out.println("static인스턴스 생성자 블록(변경 전) : b=" +b);
		b = 2000;
		System.out.println("static인스턴스 생성자 블록(변경 후) : b=" +b);
	}
}

