package com.sist.test;

class A {
	public A() {
		System.out.println("A() Call..");
	}  // B가 기본 생성자를 호출하기 떄문에 이걸 지우면 오류남
	public A(int a) {
		System.out.println("A(int a) Call");
	}
}
class B extends A {
	public B() {
		System.out.println("B() Call...");
	}
}
public class MainClass {
	public static void main(String[] args) {
		A a = new A();
		
		B b = new B();
		A aa = new B();// 이 두개가 중요함
	}
}
