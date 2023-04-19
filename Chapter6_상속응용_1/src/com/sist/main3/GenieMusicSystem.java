package com.sist.main3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusicSystem {
	protected Music[] musics = new Music[50]; //사용자가 여러명이서 하나를 공유해서 보기때문에 static변수 사용 //여기서 private를 쓰면 상속을 해도 musics에 접근을 못함 그래서 상속을 해도 사용할 수 있는 protected를 사용
	protected String title = "지니뮤직 Top 50";
	
	// 1. 초기화할 수 있는 블록
	/*
	 * 방법 1. 인스턴스 블록
	 * 	   2. static 블록*** //자동호출이라서 편함
	 * 	------------------- 자동호출
	 *     생성자***
	 *     
	 *     예외처리
	 *     ------
	 *     	  |
	 *     	 에러 => 소스상에서 처리할 수 없는 심각한 에러
	 *     			메모리 공간 부족
	 *       
	 *       예외 => 수정이 가능한 에러
	 *       	 => 예외복구 / 예외회피
	 *       	 => 비정상 종료를 방지하고 정상수행이 가능하게... 
	 *       	 => io, 				net, 			thread ,		 		web
	 *       		-- 				    ---  			------   		 		---
	 *       	파일경로명, 파일명		  IP / URL			  충돌  		  404(파일없을때 오류), 500(서버오류), 403(소스오류), 412(한글오류), 400(데이터형 오류)...
	 *     	 => 에러
	 *     		사용자 입력
	 *     		프로그래머의 실수
	 */
	/*static*/ { //이제 인스턴스블럭이 됨
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			//Document ==> 문서를 저장하는 공간 => HTML (웹크롤링)
			//System.out.println(doc.toString()); ==> 웹사이트의 HTML문서를 string으로 변환해서 프린트해줌
			/*
			 * HTML => tag <> => Markup Language 
			 * <a>값</a> 
			 * Element(자바) => tag(HTML)
			 * Elements(자바) => 같은 태그 여러개를 모아준 것
			 * 
			 * 가져올것
			 * 
			 * 노래명
			 * 가수명
			 * 앨범명
			 * 상태
			 * 등폭
			 */
			//노래명 <table class="list-wrap"> 시작위치
			//구분자 => 모든 태그 구분자 class (중복이 가능) / id (중복이 없다)
			//					    class => . 		  id => #
			Elements title = doc.select("table.list-wrap td.info a.title");
			//System.out.println(title);
			//가수명
			Elements singer = doc.select("table.list-wrap td.info a.artist");
			//System.out.println(singer);
			//앨범명
			Elements album = doc.select("table.list-wrap td.info a.albumtitle");
			//System.out.println(album);
			//상태
			Elements etc = doc.select("table.list-wrap td.number span");
			//System.out.println(etc);
			
			for (int i = 0; i<title.size();i++) {
/*				System.out.println("순위: "+(i+1));
				System.out.println("노래명 : "+title.get(i).text()); // text는 태그와 태그사이의 텍스트로 인식되는걸 가져옴
				System.out.println("가수명 : "+singer.get(i).text());
				System.out.println("앨범 : "+album.get(i).text()); */
				String s = etc.get(i).text();
				String state = "";
				String value="";
				if (s.equals("유지")) {
					state = "유지";
					value = "0";
				}
				//상승
				else {
					state = s.replaceAll("[0-9]", "");  //숫자를 공백으로 바꿔라 그래서 한글만 나옴
					value = s.replaceAll("[가-힣]", ""); //한글를 공백으로 바꿔라 그래서 숫자만 나옴
					/*
					 		split
					 		replaceAll
					 		------------ 정규식 (한글형태, 숫자형태 => 패턴)
					 		[0-9] => 숫자 전체
					 		[가-힣] => 한글 전체
					 		[A-Za-z] => 알파벳 전체
					 */
				}
/*				System.out.println("상태 : "+state);
				System.out.println("등폭 : "+value+"\n");  */
				
				musics[i] = new Music();
				musics[i].setRank(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
				musics[i].setState(state);
				musics[i].setIdcrememt(value);
				
			}
		}catch (Exception ex) {} //예외처리 
		
	}
//	2. 기능 (어떤 기능을 만들까) ==> 메소드
//  2-1 목록 출력
	/*
	 * 	결과값을 전송 : 리턴형 (대부분 이걸 사용함 왜냐하면 브라우저(웹)으로 보내야 되서)
	 *  자체출력 : void (이건 웹에서 사용을 잘 안함)
	 */
/*	public Music[] musicTitleFind (String fd) {
		
	}
	
	public Music[] musicSingerFind (String fd) {
		
	} */ //이건 오버로딩이 안됨 매개변수가 같아서
	//type1 = title, type2= singer, type3 = album
	public Music[] musicFind (String fd, int type) { //근데 이건 오버로딩임, 매개변수가 달라서
		int i = 0;
		
		/*
		 * A a = new A();
		 * A b = a;
		 */
		for (Music m:musics) {
			boolean bCheck = false;
			if (type == 1) {
				bCheck = m.getTitle().contains(fd);
				if (bCheck == true)
					i++;
				//i++; //찾은 갯수 카운팅해서 mm한테 보내줌
			}
			else {
				bCheck = m.getSinger().contains(fd);
				if (bCheck == true)
					i++;
				//i++;
			}
			
		}
		Music[] mm = new Music[i];
		i = 0;
		for (Music m:musics) {
			boolean bCheck = false;
			if (type == 1) {
				bCheck = m.getTitle().contains(fd);
				//i++; //찾은 갯수 카운팅해서 mm한테 보내줌
			}
			else {
				bCheck = m.getSinger().contains(fd);
				//i++;
			}
			if (bCheck == true) {
				mm[i] = m;
				
				i++;
			}
		}
		return mm;
			
		}
		
		//Music[] mm = new Music[i];  //찾은 갯수를 넘겨줌
	
//	2-2 검색
	public Music[] musicAllData() {
		return musics;
	}
	public static void main(String[] args) {
		GenieMusicSystem g = new GenieMusicSystem();  //이걸 불러야 자동 실행
		//type1 = title, type2= singer, type3 = album
		Music [] aa = g.musicFind("사", 1);
		Music [] a1 = g.musicFind("사", 2);
		Music [] a2 = g.musicFind("사", 3);
		for (Music a:aa) {
			System.out.println(a.getTitle());
		}
		for (Music a:a1) {
			System.out.println(a.getSinger());
		}
		for (Music a:a2) {
			System.out.println(a.getAlbum());
		}
		
	} 
}
