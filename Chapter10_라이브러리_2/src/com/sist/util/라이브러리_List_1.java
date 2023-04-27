package com.sist.util;

import java.util.ArrayList;

/*
		컬렉션 335page => Collection => 데이터를 묶어서 관리를 할 수 있게 만든 클래스
					 	=> 배열의 단점 보완
		컬렉션 프레임워크 (프레임워크 => 표준화)
			 --------> 모든 개발자가 동일한 형태로 소스코딩
			 		   소스의 통일화 목적  : Spring , MyBatis, Jquery
			 		   					 VueJS, ReactJS
			 		   일정의 틀을 맞춰서 통일 => 쉽게 다른 개발자의 코딩을 분석
			 		   
			= 완전 통일화 : 라이브러리 
		Collection : 데이터 그룹, 다수의 데이터 => 모아서 관리
					 --------------------------------
					 			|
					 		배열, 클래스
		배열 : 단점 => 고정적 (배열 크기를 정해놓고 작업)
					 증가 / 감소 => 새로운 배열을 만들어서 처리
					 ---------------------------------
					 배열을 크게 만들면 => 메모리 누수현상
				|
			   보완 : 데이터 크기에 맞게 클래스를 제작 (가변형) => 최적화
		=> (보완을 하는 게) 컬렉션 : 가변형
								=> 디폴트 (10개) => 추가 (자동으로 10개...)
								=> 저장 메모리를 결정하지 않는다.
		=> 종류
									Collection
										|
				-----------------------------------------------------
				|													|
			   List				   								   Set									Map ==> 인터페이스 (구현이 안된 클래스)
			    |구현된 클래스											|									 |
		---------------------------------					-------------------						--------------
		|				|				|					|				  | 구현클래스				|			 |
	***ArrayList	  Vector		LinkedList			***HashSet		    TreeSet				***HashMap	  HashTable
	(가장 많이 사용)
	
	
	List => ArrayList (비동기) ==> Vector를 보완
			Vector(동기화) ==> 네트워크에서 주로 사용
			LinkedList => C언어 호환
			
	List list = new ArrayList()
	list = new Vector()
	list = new LinkedList()
	
	Set => HashSet => 중복없이 데이터를 저장
		  TreeSet => 검색
		  
	Map => HashMap
		   HashTable => 이걸 보완한게 HashMap
		   
	==> List
		1) 순서를 가지고 있다 (인덱스) ==> 0부터 시작
		2) 저장된 데이터의 중복을 허용
		3) CRUD 프로그램에 주로 사용
		   ----- Create(저장) Read(읽기) Update(추가) Delete(삭제)
		   --------------------------------------------------
		   		 Insert		 Select	   Update	   Delete
		4) 비동기화(섞여서 들어옴) => 데이터베이스 프로그램 연동시 사용
		5) 주요메소드
			= 데이터 추가 : add(Object)
			= 데이터 삭제 : remove()
			= 데이터 수정 : set()
			= 데이터 읽기 : get()
			= 저장된 데이터 갯수 : size()
			= 전체를 삭제 : Clear()
			= 데이터 존재여부확인 : isEmpty()
			= 용도 : 오라클에서 데이터를 읽어서 저장 (List) ==> 브라우저 전송
		6) 구현하고 있는 클래스
		   ArrayList / Vector / LinkedList
		------------------------------------------------------------
	==> Set
		1) 순서가 없다. (인덱스번호가 없다) => for-each로 돌림
		2) 데이터 중복을 허용하지 않음
		3) 주로 사용처 => List에 중복된 데이터를 제거
		   --------------------------------- 코테에 나오는데 set()을 이용해 제거가 가능
		4) 구현 클래스 : HashSet, TreeSet
		5) 주요메소드
			= 데이터 추가 : add(Object)
			= 데이터 삭제 : remove()
			= 데이터 수정 : set()
			= 데이터 읽기 : get()
			= 저장된 데이터 갯수 : size()
			= 전체를 삭제 : Clear()
			= 데이터 존재여부확인 : isEmpty()
		------------------------------------------------------------
	==> Map(웹에서 지원하는 모든 클래스는 Map형식을 가지고 있다)
			request, response, session, cookie
			new Cookie(key, 값)
					   ---
			=> 사용자가 값 3개
			request.setAttribute("id", "hong") //앞에 값이 키값 ==> 그 키값으로 구분함
			request.setAttribute("pwd", "hong")
			request.setAttribute("sex", "man")
		=> 키와 값을 쌍으로 저장
		=> 키는 중복을 허용하지 않는다 , 값은 중복을 허용
			=> 키가 동일할 때는 덮어쓴다 (즉, 전에 있던 값을 사라짐)
		=> 사용처 : 웹에서 주로 사용 (클래스 관리, SQL관리시 많이 사용)
								--------  ----------------
								 Spring		  MyBatis
		=> 구현된 클래스 : HashMap
		=> 주요 메소드
			=> 저장 : Put()
			=> 읽기 : get(key)
		------------------------------------
		프로젝트 
		1차 : 데이터베이스 사용법(SQL(Backend)) / JQuery(Ajax (Frontend)) 
		2차 : Spring / String 라이브러리 / VueJS(Vuex)
											 -----
											  MVC
		3차 : 최신 기술(우대) : Spring-Boot / ReactJS(Redux)
										  		 -------
										   		   MVC
		웹 프로그램
		--------
		Model 1 
			=> 간단한 사이트 : JSP
		Model 2(*****)
			=> 큰 사이트 : MVC
			=> 데이터관리(Back) / 화면출력(front) 을 2개로 나눠서 개발
 */
public class 라이브러리_List_1 {
/* 	ArrayList => 사용빈도가 가장 많다.
	=> 배열과 유사 => 인덱스번호를 사용한다. => 자동으로 지정
	=> 순차적이다 (인덱스가 항상 0~~)
	=> 크기를 지정하지 않는다 (가변형)
	=> 데이터베이스 연동
	
	생성
	---
	List list = new ArrayList();
	ArrayList list = new ArrayList();
	==> 10개를 넘으면 자동으로 10개를 추가... 
	
	ArrayList list = new ArrayList(10)
*/ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성
		ArrayList list = new ArrayList(); //저장이 될때 => 기본 default Object
		// list에는 모든 데이터형을 첨부할 수 있다. (클래스 , 기본형...)
		// 가급적이면 같은 데이터형을 첨부하는 것이 관리하기 편리하다.
		// list라는 공간 데이터 추가
		// 순서가 존재 ==> for문을 사용하기 위함
//		list.add("홍길동");
//		list.add(1);
//		list.add(10.5);
//		list.add('A');
//		list.add(10.5F);
//		list.add(100L); // 이건 for문을 못돌림
		
		list.add("홍길동"); //index = 0
		list.add("박문수"); //index = 1
		list.add("심청이"); //index = 4
		list.add("춘향이"); //index = 5
		list.add("이순신"); //index = 6
		list.add(2, "강감찬"); // index = 2;  //이렇게 index 2번에 값을 넣어주면 원래 2번에 있던 데이터가 사라지는게 아닌 뒤로 한칸씩 밀리면서 index 값이 하나씩 늘어남
		list.add(3, "을지문덕");
		list.add("박문수"); // index = 7;
		// 자동으로 인덱스번호가 변경이 됨
		// 번호는 사라지지 않음 // list가 인덱스번호를 관리함
		// 출력
		// 데이터 추가시 => add()를 이용한다.
		// add => 오버로딩 (매개변수를 다르게 가져감)
		// add(Object o) , add(int index, Object o)
		// 맨마지막에 추가    => 속도가 늦다.
		// 저장된 갯수를 가져옴 => size() ==> 배열의 length
		for (int i = 0; i<list.size();i++) {
			System.out.println(i+"."+list.get(i));
		}
		//
		System.out.println("==========삭제============");
		/*	삭제 (중간에 삭제가 되는 번호없이 순차적으로 자동 설정이 됨)
			0.홍길동
			1.박문수
			2.강감찬
			3.을지문덕* --> 삭제를 원함
			4.심청이
			5.춘향이
			6.이순신
			7.박문수
			//3번이 삭제가 되면 자동으로 밑에 값이 하나씩 올라옴
			  
			 ==> 삭제시 이름으로 삭제를 요청하게 되면 => 가장 처음에 있는 이름만 삭제

		 */
		// list.remove(index); list.remove("홍길동")
		// 실제값을 삭제 => 중복이 있는 경우 전부 삭제
		list.remove("박문수");  // 중복이 있는 데이터면 가장 먼저 만나는 데이터 한개만 삭제함 //즉 원하는 데이터를 못지울수도 있음
		//그래서 remove사용시 index번호로 입력해야 함(권장)
		//출력
		for (int i = 0; i<list.size();i++) {
			System.out.println(i+"."+list.get(i));
		}
		System.out.println("==============수정=============");
		//수정 => set => set(index번호, 변경할 데이터)
		list.set(0, "홍길수");
		for (int i = 0; i < list.size();i++) {
			System.out.println(i+"."+list.get(i));
		}
		/*
				0.홍길수
				1.강감찬
				2.을지문덕
				3.심청이
				4.춘향이
				5.이순신
				6.박문수
		 */
		System.out.println("============저장된 갯수 확인=========");
		System.out.println("인원수 : "+list.size());
		//삭제
		System.out.println("==============전체 삭제=============");
		list.clear(); //메모리 공간 삭제
		System.out.println("인원수 : "+list.size());
		/*
				***add(Object o)
				set (int index, Object o)
				remove(int index)
				***Object get(int index)
				***int size()
				***clear()
		 */
	}

}
