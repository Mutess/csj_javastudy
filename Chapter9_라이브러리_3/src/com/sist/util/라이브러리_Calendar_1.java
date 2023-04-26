package com.sist.util;
/*
		Calendar : Date클래스를 보완해서 새롭게 만든 클래스
		1) Calendar 생성
		   Calendar cal = Calendar.getInstance();
		   -------- 추상 클래스 (new를 사용하지 않으면 추상클래스, 하지만 인터페이스가 아닌 이유는 메소드()를 가지고 있기 때문!)
		   
		2) 날짜 설정 => set()
		3) 날짜 읽기 => get()
		4) 각달의 마지막달
			getActualMaxium()
		5) 요일 읽기
			get()
 */
import java.util.*;
public class 라이브러리_Calendar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();  //오늘 날짜를 가지고 옴
		// 필요시에는 오버라이딩을 해서 사용한다.
		// new를 사용하지 않는 경우 => 추상클래스 / 인터페이스
		/*
			기능을 가지고 있다 => 추상 클래스 (구현된 메소드, 구현이 안된 메소드)
			가능을 가지고 있지 않다. => 인터페이스 (구현이 안된 메소드만 가지고 있음)
			List list = new ArrayList() => 인터페이스 (new가 기능을 구현해줌)
		 */
		System.out.println("년도 : "+cal.get(Calendar.YEAR));
		System.out.println("년도 : "+cal.get(1)); //동일하지만 Calendar.YEAR을 주는 것이 좋음
		System.out.println("월 : "+(cal.get(Calendar.MONTH)+1)); //MONTH를 0번부터 시작을 해서 항상 +1을 해줘야함
//								    -------------------------
		System.out.println("일 : "+ cal.get(Calendar.DATE));
		System.out.println("시 : "+ cal.get(Calendar.HOUR));
		System.out.println("분 : "+ cal.get(Calendar.MINUTE));
		System.out.println("초 : "+ cal.get(Calendar.SECOND));
		System.out.println("이번달의 마지막날 : "+cal.getActualMaximum(Calendar.DAY_OF_MONTH)); //마지막 날짜 가져옴
		String[] week = {"", "일", "월","화","수","목", "금", "토"};
		//		 week : 1~7까지 되어있음
		System.out.println("요일 : "+week[cal.get(Calendar.DAY_OF_WEEK)]); //요일을 가져옴
		
	}

}
