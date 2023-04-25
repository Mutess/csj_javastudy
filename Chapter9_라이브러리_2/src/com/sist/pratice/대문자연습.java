package com.sist.pratice;
/*
		//알파벳 문자열은 입력받아서 대문자 몇개, 소문자 몇개를 출력하는 프로그램
 */
import java.util.*;
public class 대문자연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 입력 : ");
		String data = scan.nextLine();
		int m = 0;
		int s = 0;
		
		for (int i = 0; i<data.length();i++) {
			char c = data.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				m++;
			}
			else if (c >= 'a' && c <= 'z'){
				s++;
			}
		}
		System.out.println("입력된 문자는 : "+data);
		System.out.println("대문자의 갯수는 : "+m);
		System.out.println("소문자의 갯수는 : "+s);
	}	
}
