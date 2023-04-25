package com.sist.lib;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

/*
	Backend => Java, JSP, Oracle, Spring
	Front => JavaScript, TypeScript, Ajax, Vue, React
 */

class A {
	public void aaa() {
		System.out.println("aaa() Call...");
	}
	public void bbb() {
		System.out.println("bbb() Call...");
	}
	public void ccc() {
		System.out.println("ccc() Call...");
	}
	public void ddd() {
		System.out.println("ddd() Call...");
	}
	public void eee() {
		System.out.println("eee() Call...");
	}
	//-----------------------------------------------기능추가
	public void kkk() {
		System.out.println("kkk() Call...");
	}
}

public class 라이브러리_Object_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("메소드명 : ");
		String m = scan.next();
/*		A a = new A();
		if (m.equals("aaa")) {
			a.aaa();
		}
		if (m.equals("bbb")) {
			a.bbb();
		}
		if (m.equals("ccc")) {
			a.ccc();
		}
		if (m.equals("ddd")) {
			a.ddd();
		}
		if (m.equals("eeee")) {
			a.eee(); 
		}*/
		try {
			//리플렉션 => 클래스이름으로 클래스의 정보읽기 => 모든 제어가 가능
			//변수 , 자동 메모리 할당, 메소드 호출, 생성자 변경...
			Class clsName = Class.forName("com.sist.lib.A");
			Object obj = clsName.getDeclaredConstructor().newInstance();
			//메소드 읽기
			Method[] methods = clsName.getDeclaredMethods();
			//System.out.println(Arrays.toString(methods));
			
			for (Method mm:methods) {
				if (m.equals(mm.getName())) {  //getName에 있는 것을 호출해라
					mm.invoke(obj, null);
				}
			}
		}catch (Exception ex){}
	}

}
