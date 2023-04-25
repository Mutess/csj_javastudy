package com.sist.String;
/*
		charAt(0);
		코테
		문자열을 입력해서 좌우대칭여부 확인
		ABBA (배열)
 */
import java.util.*;
public class 라이브러리_String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String data = "";
		//오류처리
		while (true) {
			System.out.println("알파벳 입력 : ");
			data = scan.next();
			if (data.length() % 2 != 0) {
				System.out.println("문자 갯수가 짝수여야 합니다.");
				continue;
			}
			break;
		}
		System.out.println("data : "+ data);
		
		boolean bCheck = false;
		int j = data.length()-1;  // data의 갯수 하나를 뺀 숫자부터 하나씩 앞으로 숫자를 세는 거임 //뒤에서 부터 갯수를 샘
		for (int i = 0; i < data.length()/2; i++) {
			if (data.charAt(i) == data.charAt(j)) {
				bCheck = true;
			}
			j--;
		}
		if (bCheck == true) {
			System.out.println(data+"는 죄우대칭입니다 ");
		}
		else {
			System.out.println(data+"는 죄우대칭이 아닙니다.");
		}
	}

}
