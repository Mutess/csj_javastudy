package com.sist.pratice;

import java.util.*;
/*
		오류처리
		문자열 반띵
		뒤에서 읽어 오기
		
 */

public class 좌우대칭연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = "";
		while (true) {
			System.out.print("대칭을 확인할 알파벳문장을 입력하세요 : ");
			data = scan.next();
			if (data.length() % 2 != 0) {
				System.out.println("문자열을 짝수로 입력하세요!");
				continue;
			}
			break;
		}
		System.out.println("입력한 문자열="+data);
		
		boolean bCheck = false; // 대칭이다 아니다를 따져야하기 때문에 boolean으로 값을 결정
		int j = data.length()-1;
		for (int i = 0; i<data.length()/2;i++) {
			if (data.charAt(i) == data.charAt(j)) {
				bCheck = true;
			}
			j--;
		}
		if (bCheck == true) {
			System.out.println("대칭입니다.");
		}
		else {
			System.out.println("대칭이 아닙니다");
		}
	}

}
