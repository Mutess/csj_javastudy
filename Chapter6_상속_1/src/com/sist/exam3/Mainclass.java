package com.sist.exam3;
/*
 * 		A ==> a,b,name,A(), print()
 * 		공유 ==> addr(), display()
 */

class A {
	int a;
	int b;
	String name;
	static String addr;
	public A () {
		/*
		 * A ==> a,b,name,addr, print(), display() 사용가능
		 */
		display();
		a = 10;
		b = 20;
		name = "hong";
		addr = "seuol";
		print();
	}
	public void print() {
		display();
		a = 10;
		b = 20;
		name = "hong";
		addr = "seuol";
	}
	
	public static void display () {
		//addr => static은 static만 사용이 가능
		A aa = new A(); // 그래서 new를 사용해서 메모리를 만들고 사용 //인스턴스는 객체 생성후에 사용이 가능
		display();
		aa.a = 10;
		aa.b = 20;
		aa.name = "hong";
		addr = "seuol";
		aa.print();
	}
}
public class Mainclass {
	public static void main(String[] args) {
		
	}

}
