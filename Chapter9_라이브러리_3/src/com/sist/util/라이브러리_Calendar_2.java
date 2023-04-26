package com.sist.util;
/*
		Date = Calendar 로 변경처리도 가능
 */
import java.util.*;
public class 라이브러리_Calendar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
		System.out.print("일 입력 : ");
		int day = scan.nextInt();
		
		Calendar cal = Calendar.getInstance(); //추상메소드 호출법
		cal.set(Calendar.YEAR, year); //set이라는 메소드를 통해서 날짜를 지정할 수 있도록 날짜를 바꿈
		cal.set(Calendar.MONTH, month-1); //month-1을 등록하고 
		cal.set(Calendar.DATE, day);
		
		System.out.println("==========설정된 날짜==========");
		System.out.println("년도 : "+ cal.get(Calendar.YEAR));
		System.out.println("월 : "+ (cal.get(Calendar.MONTH)+1)); //값을 출력할때는 +1을 해줘야 정상적인 값이 나옴
		System.out.println("일 :  "+ cal.get(Calendar.DATE));
		//읽기시 Month+1
		String[] week = {"일", "월","화","수","목", "금", "토"};
		System.out.println("요일 : "+week[cal.get(Calendar.DAY_OF_WEEK)-1]);
		//읽기시 Week -1을 해줘야 정상적으로 값을 출력
	}

}
