package com.sist.main;
/*
 * 		상속이 있는 경우 ==> 객체 생성 방법 page221
 * 		double  = 10; => d = 10.0
 * 
 * 			class A
 * 			class B extends A
 * 		
 * 				A (상위 클래스)  //클래스가 더 큼
 * 				↑
 * 				B (하위 클래스)  //대신 데이터량이 많음
 * 
 * 				==> 크기 (범위) 	상위 > 하위
 * 					--------- 상속 , 포함
 * 					  A > B
 * 					 ------- float > long  
 * 
 * 				A a = new A();
 * 				A b = new B();
 * 				B c = new B();
 * ----------------------------------
 * 				B d = new A(); => 안됨
 * 				B e = new A(); => 안됨
 * 				*** 형변환
 * 				(int)10.5
 * 
 * 				상속 
 * 				1. 형식
 * 				   class A extends => 단일 상속
 * 				2. 클래스 크기
 * 				   상속을 내리는 클래스 > 상속을 받는 클래스
 *              3. 형변환
 *                 작은 클래스 = 큰 클래스
 *              4. 자바의 최상위 클래스 => Object
 *             
 *              5. 상속의 예외 : static => 공유, 초기화 블록, 생성자, private 접근이 안됨
 *              ------------
 * 		
 */
class Human {
	int a = 10;
	int b = 20;
	static int c = 30;
	public void display() {//생성자
		System.out.println("Human : display() call...");
	}
}
class Student extends Human {
	int d = 40;
	int e = 50;
	//이렇게 하는게 오버라이딩 //단. 모든 형태가 동일해야함 , 내용은 상관없음
	/*
	 * 오버라이딩은 
	 * 	1. 상속 => 재정으
	 *  2. 메소드명 동일
	 *  3. 매개변수 동일
	 *  4. 리턴형 동일
	 *  5. 접근지정어(public, default, protected, private)는 확장은 가능하지만 / 축소시 오류발생
	 */
	public void display() {//생성자
		System.out.println("Student : display() call..."); 
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		//클래스명과 생성자가 다른경우
		/*
		 *   클래스명 변수명 = new 생성자()
		 *   -----			   ------
		 *   Human h2 = new Student();
		 *   
		 *   1) 변수 제어 ==> 클래스타입을 따라감    == Human
		 *   2) 메소드 제어 ==> 생성자 타입을 따라감  == Student 
		 */
		Human h = new Human();
		h.display();
		//a,b,c까지만 접근 가능
		Student s = new Student();
		s.display();
		//a, b, c, d, e 전부 접근 가능
		Human h2 = new Student(); //Human이 더 커서 Student대입은 가능
		h2.display();
		
//		-----	   --- ---------
//		  상위	메모리 할당  하위
		//Student s2 = new Human(); (X)
		//Student s2 = (Student)new Human();(X) // 
		Student s2 = (Student)h2; // 정상수행 //생성자가 같아야함 //a,b,c,d,e 클래스명을 보면 됨
		s2.display();
//		Student s3 = (Student)h; //ClassCastException => 형변환 오류
		
		
//		사용 범위 : 상위 클래스는 하위 클래스의 추가된 내용에 접근이 불가능하다.
//		변수 접근 : 선언된 클래스에 등록 변수까지만 접근이 가능
//		실제 상속 : 라이브러리를 상속 받음(윈도우, 데이터베이스)
/*
 		A a = new A() // A클래스에 있는 것만 사용가능
 		B b = new B() // A와 B클래스 전부 사용 가능
 		A c = new B() //이거는 A클래스에 있는 것만 사용이 가능 // 즉 젤 앞에 클래스까지만 접근이 가능
 */
	}
}
