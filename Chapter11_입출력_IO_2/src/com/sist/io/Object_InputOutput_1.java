package com.sist.io;
/*
		메모리 입출력
		파일 입출력 ==> 객체단위 저장 (프로젝트에서 이용)
		-------- ObjectInputStream / ObjectOutputStream
				 ----------------- 	 ------------------
				 => 객체 단위로 읽기	  => 객체 단위로 파일에 저장
		객체 단위로 저장
		------------
		
		
		//직렬화 만드는 방법 Sawon에 있음
 */

import java.io.*;
import java.util.*;
public class Object_InputOutput_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 여기에 데이터를 만들기고 한번에 저장
		List<Sawon> list = new ArrayList<Sawon>();  //제네릭은 Sawon객체만 들어가게 설정
		list.add(new Sawon(1, "홍길동", "개발부", "대리", 4500));
		list.add(new Sawon(2, "박문수", "영업부", "과장", 5500));
		list.add(new Sawon(3, "심청이", "기획부", "사원", 3500));
		list.add(new Sawon(4, "이순신", "자재부", "부장", 6500));
		list.add(new Sawon(5, "강감찬", "총무부", "대리", 4500));
		
		FileOutputStream fos = new FileOutputStream("c:\\java_datas\\sawon.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); // file단위(String)에서 객체단위로 변경 후 저장하겠다라는 뜻
		oos.writeObject(list);
		fos.close();
		oos.close();
		System.out.println("객체 단위로 저장 완료!");
	}

}
