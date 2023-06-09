package com.sist.test;
/*
 * 1. 자바의 상속에 대한 설명 중 틀린 것은? 1
	1) 자바는 다중 상속을 허용한다.  //자바는 단일 상속을 기본으로 함 (다중 구현)
	2) 부모의 메소드를 자식 클래스에서 재정의(오버라이딩)할 수 있다.
	3) 부모의 private 접근 제한을 갖는 필드와 메소드는 상속의 대상이 아니다.
		자바의 상속은 내리상속
		제외는 static, 생성자, 초기화 블록, private(상속은 된다, 단지 접근이 안된다 ==> 상속의 예외조건)
		
	4) final 클래스는 상속할 수 없고, final 메소드는 오버라이딩 할 수 없다.
		final이 있는 경우 있는 그대로 사용 => String, Math, System도 상수

2. 클래스 타입 변환에 대한 설명 중 틀린 것은? 2
	1) 자식 객체는 부모 타입으로 자동 타입 변환된다.
		class A(동물)
		class B(사람) extends A => A(동물) a = new B(사람)() B(사람) b = new B(사람)() ==> A,B
	2) 부모 객체는 항상 자식 타입으로 강제 타입 변환된다.
	3) 자동 타입 변환을 이용해서 필드와 매개 변수의 다형성을 구현한다.
	4) 강제 타입 변환 전에 instanceof 연산자로 변환 가능한지 검사하는 것이 좋다
	
3. final 키워드에 대한 설명으로 틀린 것은? 1
	1) final 클래스는 부모 클래스로 사용할 수 있다.
	2) final 필드는 값이 저장된 후에는 변경할 수 없다.
	3) final 메소드는 재정의(오버라이딩)할 수 없다.
	4) static final 필드는 상수를 말한다.

4. 오버라이딩(Overriding)에 대한 설명으로 틀린 것은? 3
	1) 부모 메소드의 시그너처(리턴 타입, 메소드명, 매개 변수)와 동일해야 한다.
	2) 부모 메소드보다 좁은 접근 제한자를 붙일 수 없다.(ex. public > private)
	3) @Override 어노테이션을 사용하면 재정의가 확실한지 컴파일러가 검증한다.
	4) protected 접근 제한을 갖는 메소드는 다른 패키지의 자식 클래스에서 재정의할 수 없다.
		
5. Parent 클래스를 상속한 Child 클래스의 생성자에서 컴파일 에러가 발생한 이유는?

	public class Parent{
		public String name;
	 
		public Parent(String name){
			this.name = name;
		}
	}
	 
	public class Child extends Parent{
		private int studentNo;
	 
		public Child(String name, int studentNo){
			this.name = name;
			this.studentNo = studentNo;
		}
	}
	1) 생성자는 상속이 되지 않음
	2) 
	답 : 상속내릴 때 생성자가 있는 경우 기본생성자 하나를 무조건 작성하고 상속을 내려야함
		Child가 상위 클래스를 호출할때 기본 생성자를 먼저 호출하기 때문에 문제가 됨
	
6. A,B,C,D,E,F 클래스가 다음과 같을때 빈칸에 들어올수 없는 코드
	답 : 2
	
7. 인터페이스에 대한 설명으로 틀린것
	답 : 3
//인터페이스는 상수라서 인스턴스 필드를 가질려면 상수
// 멤버변수 => 필드, 속성 (인스턴스 변수) //즉 인스턴스 필드는 변수임
 
8. 인터페이스의 다형성과 거리가 먼것 
  	답 : 4
  
  Class C implements 
  A a = new C();
  C c = (C)a;
  
  그냥 
  A a = C; 라고 해도 됨
 ///////////////////////////////////
  
  1. 참조타입 틀린것
  
  2. 자바에서 메모리 사용에 대한 설명 틀린것
  
  3. String 타입 틀린것
  
  4. 인터페이스 틀린것
  
  5. 인터페이스 다형성 거리 먼것
  
  6. 인터페이스와 클래스가 다른 점
  
  7. 인터페이스와 추상클래스 다른점
  
  8. 인터페이스 장점
  
  9. 다음중 인터페이스의 장점이 아닌것은
  답 : e 
  	  
  10. 다음 중 틀린것
  
  11. 상속 설명중 틀린것
  
  12. 코드에서 틀린 것

  13. OX
  
  14. 부모, 자식 클래스 틀린곳
  
  15. 인터페이스 틀린것
	

 */
// A a = new B() ==> A클래스에 있는 데이터만 사용, **메소드는 변경(재정의)된 것만 사용
// 하위클래스에서 추가된 메소드 , 변수 사용할 수 없다.
// B b = new B()
//class A {
//	int a,b,c;
//	public void disp() {}
//} 
public class 문제1 {
	public static void main(String[] args) {
	A a = new B(); //이렇게 선언하면 A클래스에 있는 것만 사용이 가능
	B b = (B)a;  //그래서 이렇게 묵시적형변환을 사용해야함
	
	Object/*Object에 있는 것만 사용이 가능*/ o = new A(); //재정의 된것만 사용함
	A e = (A)o;   //object는 모든 변수를 다 쓸수 있지만 라이브러리에 있는 것만 사용이 가능하므로 사용자 정의 클래스로 무조건 형변환을 시켜줘야한다.
	//
	
	}
}
