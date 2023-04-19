package com.sist.main3;
import java.util.*;

public class MusicMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("선택(Genie(1)), Melon(2) : ");
		int select = scan.nextInt();
		// 상속의 기본 => class를 통합할 수 있는 장점
		/*
		 	상속
		 	=> 객체 생성
		 	=> 상위클래스 = 하위클래스
		 */
		GenieMusicSystem ms = null;  //null값을 주고 1번이면 ms에 지니를 메모리주소를 할당 2번이면 멜론을 메모리 할당 // 즉 ms객체는 한개지만 데이터만 달라짐
		if (select == 1) {
			ms = new GenieMusicSystem(); //musicAllData()     // 상위와 하위를 같은 메소드로 통합    //상위 클래스 
		}
		else {
			ms = new MelonMusicSystem(); // musicAllData() new해서 불러오면 각각 다른 메소드를 불러옴   // 하위 클래스
		}
		// 1. 목록 출력
		Music[] music = ms.musicAllData();
		for (Music m:music) {
			System.out.println(m.getRank()+"."+m.getTitle());
		}
	}
}
