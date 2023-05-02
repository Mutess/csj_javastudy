package com.sist.lib;
/*
		제네릭 (JDK 1.5에 도입)
		=> JDK1.8 (호환성) ==> 17버전, SpringFrame(14버전)
							 ----- Spring-Boot
							 
		1. 제네릭이 도입된 이유
		   => 컬렉션(ArrayList, Set, Map) => 데이터형(매개변수, 리턴형) => Object
		   		반드시 형변환후에 사용 = 
		   		오류 발생이 많다. => 모든 데이터형을 사용할 수 있다 => 방지
		   => 데이터형을 통일화, 데이터형의 안정성 => 데이터 고정
		   => 데이터형을 명시화 => 가독성이 좋다
		   	  List<Object> list = new ArrayList<Object>(); => 가독성이 낮다
		   	  	  -------- 생략이 가능
		   	  List<String> list = new ArrayList<String>();
		   	  	  -------					   --------
		   	  	  	--------------일치--------------
		   	  *** 기본형은 사용할 수 없다 ==> Wrapper
		   => 데이터형을 모르는 경우 (와이드 카드)
		   List<?> list = new ArrayList<String>();
		   		-- 와이드카드    	       ------- (중요)
		   		---------- 지금은 ?(와이드카드가)(String)
		   		
		   예) 
		   		class Box<T> // T는 임시클래스 => default (T-Object)
		   		{
		   		}
		   		Box<String> => Object -> String : 매개변수, 리터형읇 변경
		   		<>안에 라이브러리만 첨부하는 것이 아니고 사용자정의 클래스도 첨부가 가능
		   		Box<MovieVO>... 가능
		   		
		   		임시제네릭
		   		-------
		   		T => 임시데이터형 (클래스형 => type) => 사용자 정의 제네릭
		   		E => 임시테이터형 (클래스형 => element) 요소
		   		  	 ArrayList<E>, Vector<E>, LinkedList<E>
		   		K => Key (클래스형)
		   		V => value (클래스형)
		   		Map<K,V>
		   ------------------------------------------------------------
		   Iterator / ListIterator => 데이터를 모아서 관리
		   			  ------------- HasNext() , next(), remove(), hasPrevious()
		   -------- HasNext() , next(), remove()
		   
		   -------- 순서가 없는 경우 주로 사용 Set, Map
		   ArrayList => for (index를 가지고 있다)
		  		
 */
import java.util.*;
public class 정리_2 {
	
	public static void main(String[] args) {
		//List<E>
		//Set<E>
		//Map<K(String), V(Object)>
		List<String> list = new ArrayList<String>();
		//값을 첨부
		list.add("사과");
		list.add("배");
		list.add("수박");
		list.add("딸기");
		list.add("바나나");
		// 일반 출력 => for-each
		for (String f:list) {
			System.out.print(f+" ");
		}
		System.out.println();
		System.out.println("=============Iterator=============");
		//출력이 어려운 경우 사용 (즉, 데이터가 섞여있을때)  ==> 단방향
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" "); //값을 가져옴
		}
		System.out.println("\n재출력");
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
//		ListIterator<E> => List에서만 사용이 가능
//		List<?> list = new ArrayList<Integer>();
//		List<String> list = new ArrayList<String>();
//		list = new ArrayList<Integer>();
//		List<?> list1 = new ArrayList<String>();
//		list1.clear();
//		list1 = new ArrayList<Integer>();
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
/*		for (int i = 1; i<list.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
		System.out.println("\n============================");
		for (int i = list1.size()-1; i >= 0;i++) {
			System.out.println(list1.get(i)+" ");
		}*/
		ListIterator<Integer> it1 = list1.listIterator();
		while (it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println("\n====================");
		while (it1.hasPrevious()) {
			System.out.print(it1.previous()+" ");
		}
	}
}
