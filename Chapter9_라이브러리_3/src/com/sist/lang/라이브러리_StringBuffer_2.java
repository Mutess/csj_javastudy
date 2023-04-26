package com.sist.lang;
/*
	append() => 데이터 수집, delete(), insert()
	delete, insert => 원본이 변경됨
	substring => 원본 변경이 없다.
 */
public class 라이브러리_StringBuffer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("홍길동입니다");
		sb.delete(3, 6); //end인덱스값을 -1번지까지 자르기 때문에 + 1 해서 잘라줘야함
		System.out.println(sb.toString());
		sb.insert(3, "입니다."); //start인덱스값부터 ""값을 삽입해라
		System.out.println(sb.toString());
		String s = sb.substring(3); //자체변경이 되지 않는다.(새로운 메모리에 저장을 해야 사용이 가능(즉 원본이 바뀌지 않는다))
		System.out.println(s);
		System.out.println(sb.toString());
	}

}
