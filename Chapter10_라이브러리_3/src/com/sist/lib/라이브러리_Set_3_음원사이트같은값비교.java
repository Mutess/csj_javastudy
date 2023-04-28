package com.sist.lib;
/*
	멜론 : https://www.melon.com/chart/index.htm
	지니 : 
	
	
	
	<div class="wrap_song_info">
											<div class="ellipsis rank01"><span>
												
												
												
												
												
												
												
												
												<a href="javascript:melon.play.playSong('1000002721',36356993);" title="I AM 재생">I AM</a>
											</span></div><br>
 */
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 라이브러리_Set_3_음원사이트같은값비교 {
	public static Set genieMusic() {
		Set set = new HashSet();
		try {
			for (int i = 1; i<=2;i++) {
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20230428&hh=11&rtm=Y&pg="+1).get(); //지니는 50개씩 나눠져 있어서 2페이지를 for문으로 끌어옴
				Elements title = doc.select("table.list-wrap a.title");
				for (int j = 0; j<title.size(); j++) {
					//System.out.println(title.get(j).text());
					set.add(title.get(j).text());
				}
			}
		}catch(Exception ex) {ex.printStackTrace();}
		return set;
	}
	public static Set melonMusic() {
		Set set = new HashSet();
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title = doc.select("div.wrap_song_info div.rank01 a"); //순서 : 태그.클래스명  태그. 클래스명.끝나는태그
			//System.out.println(title);
			for (int i = 0; i < title.size(); i++) {
				//<a>를 가져와야 함
				//System.out.println(title.get(i).text());
				set.add(title.get(i).text());
			}
		}catch (Exception ex) {ex.printStackTrace();}
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//melonMusic();
		//genieMusic();
		//지니뮤직 읽기
		Set genie = genieMusic(); //Set는 순서가 없이 무작위로 출력함
		System.out.println("지니뮤직음원 : "+ genie);
		//멜론읽기
		Set melon = melonMusic();
		System.out.println("멜론음원 : "+melon+"\n");
		
		//지니뮤직에만 있는 노래 찾기
		genie.removeAll(melon); //removeAll(변수) 변수에서 같은 것만 제거 (즉, 차집합) [1,2,3,4,5] - [1,2,3,6,7] => 4,5
		System.out.println("멜론과 지니뮤직의 동일한 곡 갯수: "+genie.size());
		System.out.println("지니뮤직에만 있는 곡 : "+"\n"+genie);
		for (Object obj:genie) {
			System.out.println(obj.toString());
		} 
		System.out.println();
		//100곡중 같은거만 출력
		
		Set genie2 = genieMusic();
		melon.retainAll(genie2); //같은 것만 가지고 옴 //교집합
		System.out.println("멜론과 지니뮤직의 동일한 곡 갯수: "+melon.size());
		for(Object obj:melon) {
			System.out.println(obj.toString());
		}
	}

}
