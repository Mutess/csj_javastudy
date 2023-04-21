package com.sist.exception;

/*
 	  에러 => 컴파일시(javac) / 실행시 (java)	
 	  		 ------------   -----------
 	  		 Check			UnCheck
 	  		 -----			-------
 	  	자바문법(반드시 예외처리)	   생략
 	  	
 	  	
 	  에러
 	  ---
 	  	= 수정이 불가능한 에러(심각한 오류) : 메모리 부족, 윈도우 덤프(블루스크린)이 생긴 경우
 	  	  ==> Error
 	  	= 수정이 가능한 에러(가벼운 오류) : 소스안에서 수정이 가능한 에러
 	  	  ==> 파일읽기 (파일명이 틀림), 배열의 인덱스를 벗어난 경우
 	  	  ==> 웹 연결 (URL주소가 틀림)
 	  	  ===========================> 이런 것들을 Exception (예외처리)
 	  	  
 	에러가 발생
 	--------
 		1. 프로그래머의 실수
 			=> 초기화값이 없는 상태에서 비교
 			=> 배열 인덱스 오류
 			=> 무한 루프
 			=> 파일명 오류...
 			
 		2. 사용자 입력 오류
 			=> 계산기 나누기 => 0
 			=> 정수 => 문자열...
 			----------------------웹에서 유효성 검사
 	예외처리 : 견고한 프로그램을 만들기 위해 사용
 			 ------------ 비정상을 방지하고 정상상태 유지
 			 ------------ 사전에 에러를 방지하는 프로그램
 			 
    1. 예외처리 방식
    	= 고려사항 : if(예외처리 잡을때 사용) 여기서 않되면 ==> 예외처리문 사용
    	= 예외처리 : 복잡한 에러, if문으로 해결할 수 없을때 사용
    		  웹 : 404(파일명이 없는 경우), 500(소스(변역)오류), 415(한글변환(UTF-8)), 400(값을 잘못받는 경우), 403(접속거부)... 
    		  
    2. 예외처리 종류
       = 예외 발생시 => 복구시 사용
         try ~ catch
         형식) 
         	try 
         	{
         		정상수행 문장
         		int a = 10;
         		int b = 0;
         		double d = a / (double b);
         						--------- 0으로 나눠서 오류 발생 ==> 그래서 catch로 이동
         		system.out.println(d) (에러발생시 이 문장은 실행 불가가 됨 그래서 실행X)
         	}catch (Exception e) {
         		예외발생시 처리하는 문장 영역
         	}
         	-----
         	-----
         	----- 여기는 실행이 가능 (여기까지 수행이 되면 정상수행)
         	}catch (NumberFormatException e) { //catch절은 얼마나 들어가던지 상관없음
         		예외발생시 처리하는 문장 영역
         	}catch(arrayindexoutofboundsexception) {
         	
         	}
         	
         	사용자로부터 문자열을 받아서 정수 변경후에 
         			  -------------------	
         	배열에 저장
         	--------
         	나누기를 한 후에 출력  =======> 예상 에러가 3개
         	---------------
       = 예외 발생시 => 회피시 사용 =>throws
       	 
       = 그냥 예외 발생시킴 ==> 테스트시 사용 => throw
       	 
       = 사용자 정의 예외
       	 => 지원하지 않는 예외가 존재
       	 
       	 예외처리의 계층구조 : 상위클래스에 있는 클래스들이 에러를 잡는 범위가 넓어짐
       	 
       	 		Object
       	 	      |
       	 	  Throwable
       	 	  	  |
      ----------------------------
      |							|
    Error					Exception //아래에 있는 에러를 안뜨게 하려면 상위 클래스를 호출하면 됨
    							|
    				------------------------------
    				|							|
    			CheckException(실존X)		UnCheckException(실존X)
    				| 반드시 예외처리				| 필요시에만 사용
    				|					RuntimeException(예외처리 생략) //아래에 있는 에러를 안뜨게 하려면 상위 클래스를 호출하면 됨
    				|							|
    				|					NumberFormatException
    				|						문자열 => 정수형으로 변경시
    				|						윈도우 / 웹 => 무조건 String
    				|						=> 주소창에 
    				|						main.jsp?page = 1 ====> 오류 " 1"===> 에러발생코드
    				|						==> main.jsp?page=1 정상수행 
    				|						--------------------------
    				|						NullPointException
    				|						 => 객체초기화가 안된 상태
    				|						 => 참조할 주소가 없는 상태 (선언)
    				|						ArrayIndexOfOutBoundsException
    				|						 => 배열범위 초과시 발생
    				|						ArithmeticException
    				|						 => 0으로 나눌 경우
    				|						ClassCastException
    				|						 => class형변환이 틀린 경우
    				|						IllegalArgumentException
    				|						 => 부적절한 인자 전달
    				|						IndexOutOfBoundsException
    				|						 => 문자열 관련
    				|					
    			IOException	(입출력) => 메모리 입출력 , 파일 입출력, 네트워크 입출력
    				java.io => 클래스가 동일
    				
    			SQLException (오라클 연동)
    				java.sql => 네트워크 통신
    				자바응용프로그램 <==========> 오라클
    				  (C)					  (S)
    				 Client 				 Server
    				=> 웹에 출력하는 모든 데이터 => 오라클
    				=> 자바 ================== 오라클 (연동)
    							자바연동 (X)
    							오라클이 인식하는 언어전송 (SQL)
    							SELECT * FROM 테이블명
    			브라우저 ======== 자바 ======== 오라클				
    			HTML			java		 SQL    => JSP
    			 
    			ClassNotFoundException (리플렉션)
    				=> 클래스명이 틀린 경우
    				Class.forname("패키지.클래스명")
    			ex)	Class.forname("com.sist.exception.예외처리_1")
    			...
    			
    			MalformedURLException
    			=> URL주소가 틀린경우
    			=> Jsoup
    			InterruptedException
    			=> 쓰레드 충돌
   		263page
   		-------
   		예외의미 => 프로그램에서 돌발적으로 (의도하지 않은 상황)에서 문제가 발생시 처리를 어떻게 할지
   									--------------				 -------------- 
   																 프로그램은 에러발생시에 비정상으로 종료 => 이걸 방지하고 정상적으로 종료가 가능하게 만드는 과정 (예외처리)
   		
   		
 */
class A {
	public void display() {
		System.out.println("A:displayCall...");
	}
}
class B {
	
}
class CCC extends B{  
	//ccc.disp('A', 10, 'B');
	public void disp(int a, int b, int c) {
		System.out.println("1");
	}
	public void disp(int a, char b, byte c) {
		System.out.println("2");
	}
	public void disp(char a, char b, int c) {
		System.out.println("3");
	}
}
public class 예외처리_1 {
	static String s; //="Hello";
	static A a;
	public static void main(String[] args) throws InterruptedException {  //Thread.sleep(1000);의 예외처리법 중 하나
		// TODO Auto-generated method stub
//		a.display();
		String ss= "Hello Java!!";
		System.out.println(ss.substring(ss.indexOf("K"), ss.lastIndexOf("J")));
		CCC ccc = new CCC();
		ccc.disp('A', 10, 'B');
		System.out.printf("%d %c %s\n", 10, 65, "10");
		CCC cc= (CCC)new B();
		
		System.out.println(10/0);
		System.out.println("1");
		
		int[] arr = new int[2];
		arr[2] = 10; // 0,1밖에 못들어가는데 다음 번지를 요청해서 에러남
		System.out.println("2");
		if (s.equals("Hello")) {
			System.out.println("OK"); //에러나는 코드 ==> s값이 Null(주소가 없는 상태)값인데 비교해달라고 해서 오류남
		}
		System.out.println("3");
		
		int a = 10;
		int b = 0; //만약 이 값이 사용자로부터 받았을때 
		//처리
		if (b != 0) { // 정상수행 ==> try - catch문으로 따지면 여기가 try
			int c = a/b;
		}
		else { //==> 여기가 catch
			System.out.println("0으로 나눌수 없습니다");
		}
		/*
		 	1. 정상적으로 종료가 되게 만든다.
		 	2. 우선적 => if문으로 처리가 가능한지 여부 => 자바에서 제공하는 예외처리를 이용한다.
		 	3. if은 주로 사용하는 것이 ==> 검색용도, 사용자 입력 제한...
		 */
		String page1 = "1"; //뛰어쓰기 하나가 들어가면 에러남
		System.out.println(Integer.parseInt(page1));
		String page = " 1"; //뛰어쓰기 하나가 들어가면 에러남
		System.out.println(Integer.parseInt(page));
		
//		int c = a/b;
//		System.out.println("c="+c);
		
		Thread.sleep(1000);
		
		try {
			//forName(Strings) forName("aaa")
			Class.forName("com.sist.exception예외처리_1"); //지금은 에러가 없는데 실행시 . 하나 때문에 에러가 발생 //"com.sist.exception.예외처리_1"
		}catch (Exception ex) {}

	}

}
