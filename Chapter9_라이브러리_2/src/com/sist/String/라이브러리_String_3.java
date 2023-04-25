package com.sist.String;
/*
	String은 문자열 배열
	------ 문자마다 인덱스번호를 가지고 있다. (0부터 시작)
	String s = "Hello Java"
				0123456789 <-- 인덱스 번호
	하지만 오라클은 1번부터 시작함
	 			자바 ==     !=	substring (0,3) => 012
	 		   오라클 =      <>	substr(1,5)
 	 	   자바스크립트 ===   !==
 	 	   
 	주요기능 (310page) 
 	1) 문자열에서 문자 한개 추출 => char charAt(int index)
 	 	   
 */
import java.util.*;
public class 라이브러리_String_3 {
	
	public static void main(String[] args) {
/*		String s1 = "Hello";
		System.out.println(s1.hashCode());
		s1 = s1 + "Java";
		System.out.println(s1.hashCode()); //이건 문자열 결합하면서 메모리 주소가 바뀐다는 뜻 */
		
		String msg = "Hello Java";
/*		for (int i = 0; i <msg.length(); i++) {
			 System.out.println((i+1)+ "번째 문자 : "+msg.charAt(i));
		} */
		//코테문제 => msg를 반대로 출력하는 프로그램
/*		for (int i = msg.length()-1; i>=0; i--) {
				System.out.println((i+1)+ "번째 문자 : "+msg.charAt(i));
		} */
		//알파벳 문자열은 입력받아서 대문자 몇개, 소문자 몇개를 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력 : ");
		String data = scan.nextLine(); //nextLine은 뛰어쓰기도 인식해도 가져옴
		int m = 0;
		int s = 0;
		
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i); //문자를 하나하나 잘라내고
			if (c>= 'A' && c <= 'Z') {
				m++;
			}
			else if (c >= 'a' && c <= 'z') {
				s++;
			}
		}
		System.out.println("대문자 갯수 : "+m);
		System.out.println("소문자 갯수 : "+s);
	}
}
