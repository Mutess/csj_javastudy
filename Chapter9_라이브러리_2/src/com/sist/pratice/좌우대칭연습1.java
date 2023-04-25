package com.sist.pratice;

/*
	오류처리
	문자열 반띵
	뒤에서 읽어 오기
*/
import java.util.*;
public class 좌우대칭연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String data = ""; //예외처리 해야되서 미리 선언
		while (true) {
			System.out.print("대칭을 확인 할 문장을 입력해주세요 : ");
			data = scan.next();
			if (data.length()%2 != 0) {
				System.out.println("문장은 짝수여야 합니다.");
				continue;
			}
			break;
		}
		System.out.println("입력한 문자열은 : "+data);
		boolean bCheck = false; //대칭이다 아니다를 판별하기 위해 사용
		
		int j = data.length()-1; //뒤에서 부터 읽어옴
		for (int i = 0; i < data.length()/2;i++) {
			if (data.charAt(i)==data.charAt(j)) {
				bCheck = true;
			}
			j--;
			
			
		}
			if (bCheck = true) {
				System.out.println("대칭입니다.");
			}
			else{
				System.out.println("대칭이 아닙니다.");
			}
	}

}
