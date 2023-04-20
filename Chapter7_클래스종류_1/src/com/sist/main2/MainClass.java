package com.sist.main2;

import java.util.*;
//인터페이스는 => 여러개를 묶어서 쉽게 관리할 목적
//Spring (클래스 관리자) => 인터페이스 (관련있는 클래스들을 묶어서 관리)

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("해당 클래스 번호 : ");
		int no = scan.nextInt();
		Container cc = new Container();
		Exec1 a = (Exec1)cc.getBean(no);
		a.execute();
		
		
/*		if (no == 1) {
			A a = (A)cc.getBean(1);          //오류가 난 이유는 넘겨주는 값이 Object라서 A보다 커서 오류가 뜸
			a.execute();
		}
		if (no == 2) {
			B b = (B)cc.getBean(1);          //오류가 난 이유는 넘겨주는 값이 Object라서 A보다 커서 오류가 뜸
			b.execute();
		}
		if (no == 3) {
			C c = (C)cc.getBean(1);          //오류가 난 이유는 넘겨주는 값이 Object라서 A보다 커서 오류가 뜸
			c.execute();
		}
		if (no == 4) {
			D d = (D)cc.getBean(1);          //오류가 난 이유는 넘겨주는 값이 Object라서 A보다 커서 오류가 뜸
			d.execute();
		}
		if (no == 5) {
			E e = (E)cc.getBean(1);          //오류가 난 이유는 넘겨주는 값이 Object라서 A보다 커서 오류가 뜸
			e.execute();
		}*/
		
		
	}
}
