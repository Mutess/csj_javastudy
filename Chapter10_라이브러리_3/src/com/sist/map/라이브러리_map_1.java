package com.sist.map;
/*
		Map = 인터페이스
		 |
	-----------------
	|				|
  HashTable		 HasgMap(*****)
  특징)
  	두개를 동시에 저장(key,value)
  	(단 key는 중복할 수 없다)
  	("id", "hong")
  	("id", "shim") ==> 이건 아이디값이 같기 떄문에 덮어써짐
  	--------------------
  	("id1", "hong")
  	("id2", "hong") ==> 키만 다르면 가능'
  	
  => 사용처 : 웹에서 제공하는 모든 클래스 (Map형식)
  	HttpServletRequest
  		request.setAttribute ("key", "value")
  	HttpServletResponse 얘도 같음
  	HttpSession
  	cookie
  	
  => Spring , MyBatis => Map형식
  	 ----	-------- SQL ("all", "SELECT * FROM emp")
  	 클래스 등록
  	 ("a", new A())
  => 저장 / 읽기
  	 ---------
  	 저장 : put("key", "값")
  	 읽기 : get(key)
  	 --------------------------JSON, Properties
  	 => 데이터는 구분자를 필요로 한다.
  	 		   -----
  	 		   ArrayList => 인덱스
  	 		   Set 		 => 중복없이
  	 		   Map		 => key
  	 		   오라클 	 => primary key
  	 		   -------------------------
  	 		   	영화	: 영화고유번호
  	 		   	뮤직 : 노래고유번호
  	 		   	맛집 : 맛집번호
  	 		   	게시판 : 게시판번호
  	 		   	회원관리 : ID
  	 		  -----------------------정형화된 데이터
  	 		  비정형화 => 빅데이터 => 정형화된 데이터
  	 		  					 ============
  	 		  					 	통계/확률
 */
import java.util.*;
public class 라이브러리_map_1 {

	public static void main(String[] args) {
		Map map = new HashMap<>();
		//데이터 저장
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", "25");
		map.put("password", "4567"); //키가 중복이 되면 마지막에 쓰면 key값으로 덮어써짐
		//데이터 출력
//		System.out.println("ID"+map.get("id"));
//		System.out.println("PWD"+map.get("password"));
//		System.out.println("NAME"+map.get("name"));
//		System.out.println("SEX"+map.get("sex"));
//		System.out.println("AGE"+map.get("age"));
		Set set = map.keySet(); //키의 전체값을 모아서 관리 (.keySet())
		System.out.println(set);
		for (Object o:set) {
			String key = (String)o;
			System.out.println(key+" : "+map.get(key));
		}
		/*
				clear() : 전체 삭제
				get() : 실제 데이터값을 읽을때
				put() : 데이터 추가
				isEmpty() : 데이터가 있는지 여부 (true/false)
				size() : 저장된 갯수
				values() : 실제 저장된 값 전체
		 */
		for (Object o : map.values()) { // 키없이 값만 모아서 가져올때 map.values()를 사용
			System.out.println(o);
		}
	}
}
