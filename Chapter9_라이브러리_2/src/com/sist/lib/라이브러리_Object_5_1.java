package com.sist.lib;

class Card {
	private int number;
	private String type;
	public Card() {
		number = 7;
		type = "♥";
	}
	public void print() {
		System.out.println("번호 : "+number+", Type = "+type);
	}
}

public class 라이브러리_Object_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		c1.print();
		
		System.out.println("==============================");
		
		try {
			Class clsName = Class.forName("com.sist.lib.Card");  //스프링에선 무조건 이걸 사용
			Object obj = clsName.getDeclaredConstructor().newInstance();
			//객체생성
			((Card)obj).print(); //이렇게 Card로 형변환을 해야지 .print()를 불어올수 있음
		}catch (Exception ex) {}
	}

}
