/*
 * 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램
 */
//import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int)(Math.random()*2); //0,1
		char  ab;
		
		if (i == 0) {
			ab = (char)((Math.random()*26)+65);
			//System.out.println(ab + "는 대문자입니다.");
		
		else if (i == 1) {
			ab = (char)((Math.random()*26)+97);
			//System.out.println(ab + "는 소문자입니다.");
			
		if (ab>='A' && ab <= 'Z') {
			System.out.println(ab + "대문자입니다");
			
		
		}else {
			System.out.println(ab+ "소문자입니다.");
		}
		}
		
		}
		

	}

}
