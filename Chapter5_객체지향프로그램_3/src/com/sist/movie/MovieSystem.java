package com.sist.movie;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
	  	 일별 박스오피스 : searchMainDailyBoxOffice.do
		 실시간 예매율 : searchMainRealTicket.do
		 좌석 점유율 : searchMainDailySeatTicket.do
		 
		 https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do
		 
		 [{"startDate":"2023년 04월 12일(수)", // 멤버변수 : 값
		 "endDate":"2023년 04월 12일(수)",
		 "totcnt":109,
		 "watchGradeNm":"청소년관람불가",
		 "movieCd":"20231089",
		 "showDt":"20230412",
		 "fileSaveLoct":"/common/mast/movie/2023/04/",
		 "orgnFileNm":"m_poster.jpg",
		 "sysFileNm":"30be7bc08e504eaab8cd9545aa64749d.jpg",
		 "movieNm":"존 윅 4",
		 "movieNmEn":"John Wick: Chapter 4",
		 "openDt":"20230412",
		 "totSeatCntRatio":" 38.7",
		 "totSeatCnt":747409,
		 "rank":1,
		 "repNationCd":"미국",
		 "movieType":"장편",
		 "moviePrdtStat":"개봉",
		 "genre":"액션",
		 "thumbUrl":"/common/mast/movie/2023/04/thumb/thn_30be7bc08e504eaab8cd9545aa64749d.jpg",
		 "showTm":"169",
		 "showTs":"5",
		 "prdtYear":"2023",
		 "indieYn":null,
		 "artmovieYn":null,
		 "multmovieYn":null,
		 "director":"채드 스타헬스키",
		 "prNm":null,
		 "dtNm":"(주)레드아이스 엔터테인먼트",
		 "rankInten":-1,
		 "rankOldAndNew":"NEW",
		 "rownum":1},
		 
 */
public class MovieSystem {
	Movie[] movie = new Movie[10]; //클래스 배열
	int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("==============메뉴=============");
		System.out.println("1. 일별 박스오피스");
		System.out.println("2. 실시간 예매율");
		System.out.println("3. 좌석 점유율");
		System.out.println("4. 상세보기");
		System.out.println("9. 종료하기");
		System.out.println("==============================");
		System.out.print("메뉴선택 : ");
		return scan.nextInt();
	}
	//목록 출력
	Movie[] movieListData(int no) {
		String[] strUrl = {
				"",
				"searchMainDailyBoxOffice.do",
				"searchMainRealTicket.do",
				"searchMainDailySeatTicket.do"
		};
		String url = "https://www.kobis.or.kr/kobis/business/main/"+strUrl[no];
		try {
			/*
			 * [{}, {}, {}, {} .....] JSON = 객체표현법
			 * [] => JSONArray\
			 * {} => JSONObject
			 */
			Document doc =Jsoup.connect(url).get();
			//System.out.println(doc.toString());
			String msg = doc.toString();
			msg = msg.substring(msg.indexOf("["), msg.lastIndexOf("]")+1);  //[ 여기서부터 ]까지 가져와라 근데 lastindexof는 마지막 ]는 제외가 되서 + 1를 해줘야 똑바로 나옴
			//System.out.println(msg);
			JSONParser jp = new JSONParser();
			JSONArray arr = (JSONArray)jp.parse(msg);
			for (int i = 0; i < arr.size(); i++) {
				JSONObject obj = (JSONObject)arr.get(i);
				movie[i] = new Movie();
				movie[i].title = (String)obj.get("movieNm");
				movie[i].time = (String)obj.get("showTm");
				movie[i].genre = (String)obj.get("genre");
				movie[i].director = (String)obj.get("director");
				movie[i].story = (String)obj.get("synop");
				
			}
			
		}catch (Exception ex) {}
		return movie;
	}
	Movie movieDetilData(int no) {
		return movie[no-1];
	}
/*	public static void main(String[] args) {
		MovieSystem ms = new MovieSystem();
		Movie[] mm = ms.movieListData(1);
		for (int i = 0; i < mm.length; i++) {
			System.out.println((i+1) + "."+mm[i].title);
		}
	}*/
}
