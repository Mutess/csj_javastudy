package com.sist.main2;
//Object는 모든 클래스의 상위 클래스 (모든 클래스는 Object상속을 받는다 = 최상위 클래스)
/*  //모든 클래스를 Object로 모을수가 있음
 		class A
 		class B extends A
 			
 			Object
 			  |
 			  A
 			  |
 			  B
 		Object o = new A()
 		Object o = new B()
 		
 		Object[] a = {10, a, "", 10.6....} //Object는 모든 데이터형을 값을 받고 사용할 수가 있음
 */
public class Container {  //container : class를 관리하는 class (Spring)
	public Object getBean (int no) {  //데이터를 혼합할때 사용
//		Object o = new A();
		Object o = null;
		if (no == 1) {
			o = new A();
		}
		else if (no == 2) {
			o = new B();
		}
		else if (no == 3) {
			o = new C();
		}
		else if (no == 4) {
			o = new D();
		}
		else if (no == 5) {
			o = new E();
		}
		
//		o = new B();
//		o = new C();
//		o = new D();
//		o = new E();
//		o = "";
//		o = 10;
//		o = 'A';
//		o = true;
//		o = 10.5;
		return o; 
		
	}
}
