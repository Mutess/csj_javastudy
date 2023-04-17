package com.sist.music;
/*
 *   1. 재사용
 *   	=> 상속 => is - a
 *   	   기존의 클래스를 확장해서 사용
 *   				   ------
 *   				   extends
 *   		=> 자바는 단일 상속만 가능함
 *   				-------
 *   		class A 
 *   		class B extends A (상속을 할때 extends를 쓰고 사용)
 *   		class C extends JFrame ==> 상속은 보통 라이브러리에서 많이 받음
 *   -----------------------------------------------------------------
 *   	class A
 *   	class B
 *   	class C entends A,B ===> 이건 100프로 오류
 *   
 *   	class A
 *   	class B extends A
 *   	class C extends B ==> 다중 상속을 받을때 이렇게 하나하나씩 받아야 가능
 *   
 *   	class A (int a, b, c, d) 16byte
 *   	class B	(int a, b) 8byte
 *   	A > B 오류남
 *   	-----
 *   	클래스는 상속과정이 없으면 크기를 젤수가 없음
 *   	A와 B는 다른 클래스 ==> 크기를 가지지 않는다
 *   
 *   	class A (int a,b)
 *   	class B (int c) extends A
 *   					------- int a, int b, int c
 *   	A > B 상속을 내릴때 가능하고 무조건 상속을 내리는 클래스가 커야됨
 *   
 *   
 *   				동물
 *   				 |
 *   		-------------------
 *   		|		 |		 |
 *   	  포유류	    양서류	조류
 *   		|
 *   	   인간
 *   		|								상속을 내리는 클래스가 더 커야됨 // ~이다 라고 끝나면 됨
 *   	 -------
 *   	 |     |
 *   	남자	  여자
 *   	
 *   	남자 M  = (남자)인간; 
 *   	*** 모든 클래스는 Object상속을 받고 있다.
 *   		Object => 모든 클래스의 최상위 클래스
 *   	*** 상속의 예외 조건
 *   		생성자, static, private, 초기화 블록
 *   
 *   	=> 포함 => has - a (************)
 */
//데이터형 (기본형하고 같음)
public class Music {//클래스의 역할 데이터형이 다른 변수들은 모아줌
	private int rank; //순위
	private String state;  //노래 등수 등감 모양 표시
	private String title;
	private String Singer;
	private String album;
	private int idcrement; //노래 등수 등감 숫자 표시
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return Singer;
	}
	public void setSinger(String singer) {
		Singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	
}
