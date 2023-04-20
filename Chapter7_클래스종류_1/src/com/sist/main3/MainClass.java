package com.sist.main3;
/*
 		인터페이스 간의 상속
 		interface A
 		interface B extends A
 					-------
 					
 		interface A {
 			void aaa();
 		}
 		interface B extends A
 		{
 			//void aaa()
 			void bbb();
 		}
 		class C implements B
 		{		----------
 			public void aaa(){}
 			public void bbb(){}
 		}
 */
interface A {
	
}
interface B extends A {  //A > B 상속을 내린 애가 더 큼
	
}
class C implements B {// B > C ==> interface도 클래스와 동일 => 구분 (클래스는 단일상속, 인터페이스 다중상속)
	
}
public class MainClass {
	
	public static void main(String[] args) {
		A a = new C();	// 이건 A밖에 못씀
		B b = new C();	// 이건 B밖에 못씀
		C c = new C();  // 지금 상태에서 이걸쓰면 한번에 A,B 사용가능
		
/*		if (c instanceof A) {    // c객체가 A클래스보다 작다 이렇게 물어보는 것 //즉 c객체는 A에 포함 (c < A)
			System.out.println("OK1");
		}
		if (c instanceof B) {  // c < B
			System.out.println("OK2");
		}
		if (b instanceof A) { // b < A
			System.out.println("OK3");
		}
		if (a instanceof C) {  // a < C  ///// 이건 a == C랑 같아서 출력
			System.out.println("OK4");
		}
		if (a instanceof B) {  // a < B
			System.out.println("OK5");  
		} */
		
		String s = "";
		StringBuffer sb = new StringBuffer();
		Object o = new Object();
		if (s instanceof Object) {  // s < Object
			System.out.println("OK1");
		}
		if (sb instanceof Object) {  // sb < Object
			System.out.println("OK2");
		}
		if (o instanceof String) {
			System.out.println("OK3");
		}
		//instanceof 객체크기를 비교
		// 오른쪽 클래스나 오른쪽 인터페이스가 크거나 같으면 => true
		//if  (s instanceof StringBuffer) ==> 오류 (상속, 포함관계가 아닌 경우는 크기를 젤수가 없음)
	}
}
