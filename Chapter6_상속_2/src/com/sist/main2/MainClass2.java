package com.sist.main2;

class common {
	int a = 10;
	int b = 20;
	public void display() {
		System.out.println("Common : display call...");
	}
}
class Child extends common { //is - a
	//a,b
	public void display() {
		System.out.println("Child : display call..."); //이게 오버라이딩기법 // 부모클래스에서 가져온걸 내용만 변경한 것
	}
}
class Child2 {
	//상속없이 오버라이딩 ==> 익명의 클래스
	common c = new common(); //a.b //이렇게 사용해도 할당이 됨// 이것을 포함이라고 함(has-a)
	public void display() {
		System.out.println("Child2 : display call..."); //이게 오버라이딩기법 // 부모클래스에서 가져온걸 내용만 변경한 것
	}
}

public class MainClass2 {

	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.display();

		Child2 c2 = new Child2();
		System.out.println(c2.c.a);
		System.out.println(c2.c.b);
		c2.display();
	}

}
