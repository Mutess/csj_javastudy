package com.sist.pratice;

public class 데이터최대길이최소길이 {

	public static void main(String[] args) {
		int max = 0;
		System.out.println("===========length()============");
		String[] data2 = {"apple",
						  "avocado", 
						  "banana",
						  "blackberry",
						  "blueberry",
						  "cherry tomato",
						  "cherry",
						  "coconut",
						  "grape",
						  "kiwi",
						  "lemon",
						  "lime",
						  "mango",
						  "melon",
						  "orange",
						  "papaya",
						  "peach",
						  "pear",
						  "persimmon",
						  "pineapple",
						  "plum",
						  "strawberry",
						  "tangerine",
						  "tomato ",
						  "watermelon" };
		// 1. 각 과일명의 문자길이를 출력
		for (String s:data2) {
			System.out.println(s+":"+s.length());  //문자길이 구할 때
		}
		for (String s:data2) {
			if (max < s.length()) {
				max = s.length();
			}
		}
		for (String s:data2) {
			if (s.length() == max) {
				System.out.println(s);
			}
		}
		int min = max;
		for (String s:data2) {
			if (min > s.length()) {
				min = s.length();
			}
		}
		for (String s:data2) {
			if(s.length() == min) {
				System.out.println(s);
			}
		}
	}

}
