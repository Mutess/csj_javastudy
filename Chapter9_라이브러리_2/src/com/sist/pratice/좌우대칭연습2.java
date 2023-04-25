package com.sist.pratice;

import java.util.*;
public class 좌우대칭연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String data = "";
		while (true) {
			System.out.print("대칭을 비교할 문자열(알파벳): ");
			data = scan.next();
			if (data.length()%2!=0) {
				System.out.println("문자열은 짝수여야합니다");
				continue;
			}
			break;
		}
		boolean bCheck = false;
		int j = data.length()-1;
		
		for (int i = 0; i <data.length()/2;i++) {
			if (data.charAt(i) == data.charAt(j)) {
				bCheck = true;
			}
			j--;
		}
		if (bCheck == true) {
			System.out.println("대칭입니다.");
		}
		else {
			System.out.println("대칭이 아닙니다.");
		}
	}

}
