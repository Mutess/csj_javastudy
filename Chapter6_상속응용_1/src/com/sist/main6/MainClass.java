package com.sist.main6;
//super는 여기 있는걸 가져옴
class Super {
	int a = 10;
	int b = 20;
}
class Sub extends Super {
	//int a = 10, b = 20, 여기가 this
	int a = 100;
	int b = 200; //여기에 값을 주면 super의 값이 안바뀜
	public Sub() {
		System.out.println("a="+a+", b="+b);
		this.a = 1100;
		this.b = 2200;
		System.out.println("a="+a+", b="+b);
		System.out.println("a="+super.a+", b="+super.b);
	}
} // 
public class MainClass {
	public static void main(String[] args) {
		Sub sub = new Sub();
	}
}
