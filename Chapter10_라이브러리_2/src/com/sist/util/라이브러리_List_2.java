package com.sist.util;
/*
		List의 메소드
		add()
		remove()
		set()
		size()
		clear()
		------------기본 메소드
		
		containsAll() => 두개의 list에서 중복된 데이터를 모아서 관리
			=> JOIN
		retainAll() => 두개의 list에서 중복된 데이터만 남기기
		addAll() => 데이터 전체를 복사할때 사용하는 것
		subAll() => 부분적으로 복사할때 사용
		------------------------------ 장바구니, 예매할때 사용
									   ------ 중복 구매
 */
import java.util.*;
// 오라클 => JOIN
public class 라이브러리_List_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3); //0
		list.add(5); //1
		list.add(7); //2
		list.add(6); //3
		list.add(9); //4
		list.add(2); //5
		list.add(1); //6
		list.add(4); //7
		
		for (Object i:list) {
			System.out.println(i); //i.toString도 가능
		}
		//일부만 추가 subList(start, end)
		ArrayList list2 = new ArrayList(list.subList(1, 4));  //subList 리스트 일부분을 잘라 복사?
		//end-1 //마지막 값은 항상 -1을 해줘야함 ==> list.subList(1, 4) 일때 (index)1,2,3
		list2.add(10);
		list2.add(11);
		list2.add(12);
		System.out.println("============");
		for (Object i:list2) {
			System.out.println(i);
		}
		// sort() 정렬
		System.out.println("==========sort===========");
		Collections.sort(list);
		for (Object i:list) {
			System.out.println(i);
		}
		
		//합집합 //containsAll()
		list.containsAll(list2);
		System.out.println(list.containsAll(list2)); //데이터가 같은 데이터가 있는지 확인하는 메소드 containdsAll() //원형은 Boolean //list2안에 있는 데이터가 list에 포함되어 있냐라고 물어봄
		for (Object i:list) {
			System.out.println(i);
		}
		// 같은 데이터 추출
		// retainsAll() //교집합
		System.out.println("===============");
		// 중복된 데이터만 추출 = INTERSECT => 교집합
		System.out.println(list.retainAll(list2)); //중복된 데이터만 추출하는 메소드 retainAll()
		for (Object i:list) {
			System.out.println(i);
		}
		
		// addAll //카피떠올때 사용
		ArrayList list3 = new ArrayList(); 
		list3.addAll(list);
		for (Object i : list3) {
			System.out.println(i);
		}
		
		
	}
}
