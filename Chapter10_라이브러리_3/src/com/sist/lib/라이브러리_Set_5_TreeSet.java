package com.sist.lib;

import java.util.*;
public class 라이브러리_Set_5_TreeSet {

	public static void main(String[] args) {
		Set set = new HashSet(); //중복되면 중복된 숫자는 사라짐
		for (int i = 0; i<10; i++) {
			int r = (int)(Math.random()*100) + 1;
			set.add(r);
		}
		//출력
		System.out.println(set);
		// 50보다 작은 수
		for (Object i:set) {
			int a = (int)i;
			if ( a > 50) {
				System.out.println(a +" ");
			}
			else if (a < 50) {
				System.out.println(a + " ");
			}
			
			
		}
		System.out.println("===========================");
		// TreeSet
		// 1. 정렬
		// 2. 검색이 빠름
		TreeSet tset = new TreeSet();
		for (int i = 0; i< 10; i++) {
			int r = (int)(Math.random()*100) +1;
			tset.add(r);
		}
		System.out.println(tset);
		System.out.println("50보다 작은 수 : "+tset.headSet(50)); // 처음부터 50까지 (즉, 1부터 50) 
		System.out.println("50보다 큰 수 : "+tset.tailSet(50)); // 끝부터 50까지 (즉, 50부터 100)
	}

}
