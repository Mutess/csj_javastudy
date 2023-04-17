package com.sist.main;
/*
 * 	 Math클래스는 지원하는 모든 메소드가 static
 * 
 * 	 import 패키지명.클래스명
 *   import 패키지명.*;
 *   import static java.lang.Math.random
 *   java.lang.* ==> 자동 로딩이 된다, import를 사용하지 않는다.
 *   --------------- String, Math
 *   
 *   void method() {
 *   	return; //컴파일러가 자동으로 설정(생략이 가능) => void에서만 가능
 *   	==> 리턴은 중간에 있을 때도 있다.
 *   }
 *   class A {
 *   	A(){}
 *   }
 */
import static java.lang.Math.random;
public class 클래스_메소드 {

	public static void main(String[] args) {
		int a = (int)(random()*100) + 1;
		System.out.println(a);
		
		int b = 10;
		if (b % 2 == 0) {
			System.out.println("b="+b);
			return;
		}
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		return;
	}

}
