package com.sist.util;

import java.util.*;
public class 라이브러리_Random_2 {

	public static void main(String[] args) {
		char[] alpha = new char[10];
		Random r = new Random();
		for (int i = 0; i<alpha.length;i++) {
			alpha[i] = (char)(r.nextInt(5) + 65);
			if (alpha[i] == 'E') {
				alpha[i] = 'F';
			}
			System.out.println((i+1)+"q번 학생 성적 : "+alpha[i]);
		}
		System.out.println(Arrays.toString(alpha));
		Arrays.sort(alpha);
		System.out.println(Arrays.toString(alpha));
	}
}
