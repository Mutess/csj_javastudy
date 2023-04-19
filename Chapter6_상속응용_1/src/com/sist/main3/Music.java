package com.sist.main3;

public class Music {
	private int rank;
	private String title;
	private String singer;
	private String album;
	private String state;  //현재 상태
	private String idcrememt; //증폭
	private String like;  //멜론
	//읽기 / 쓰기 => 다른 클래스와 연결 (데이터 저장, 데이터 읽기) => 데이터형
	//여기까지 은닉화라고 하고
//  ----------------------------------------------------------
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getIdcrememt() {
		return idcrememt;
	}
	public void setIdcrememt(String idcrememt) {
		this.idcrememt = idcrememt;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	//여기까지를 캡슐화 방식이라고 한다.
//	----------------------------------------------------------------
	
}
