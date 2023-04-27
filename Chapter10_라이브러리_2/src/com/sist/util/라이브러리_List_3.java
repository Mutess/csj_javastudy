package com.sist.util;

import java.util.*;
/*
		subList (int start , int end) => index번호가 start부터 end까지 부분적으로 데이터를 복사
															---- end -1까지 복사
															
		==> 페이지 나누기가 훨씬 편해짐
		
		addAll() => ArrayList가 가지고 있는 모든 데이터 복사
		retainAll() => 두개의 ArrayList에서 같은 값을 가지고 있는 데이터 복사
		Collection.sort() => ArrayList 정렬
 */
public class 라이브러리_List_3 {

	public static void main(String[] args) {
		ArrayList names1 = new ArrayList();
		names1.add("홍길동");
		names1.add("심청이");
		names1.add("박문수");
		names1.add("강감찬");
		names1.add("춘향이");
		for (Object name : names1) {
			System.out.println(name);
		}
		System.out.println("======================");
		ArrayList names2 = new ArrayList();
		names2.add("홍길수");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("강감차");
		names2.add("성춘향");
		
		ArrayList temp = new ArrayList();
		temp.addAll(names1);
		temp.retainAll(names2); //여기서 names1과 names2 데이터들중에 같은 데이터를 찾고 찾은 데이터를 names1에 저장함
		//찾은 데이터를 names1에 저장
		for (Object name:names1) {
			System.out.println(name);
		}
		System.out.println("====== 교집합 후 =======");
		for (Object name:temp) {
			System.out.println(name);
		}
		
		//이중에 같은 이름을 추출 retainAll
		
		
	}

}
