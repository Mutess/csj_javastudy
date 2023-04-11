/*
 *    method => 140page
 *    1) 메소드 형식 => 기능처리
 *    	 --------
 *    		웹 => 화면변경 
 *    		----------- 메뉴 클릭, 버튼 클릭, 이미지 클릭 ...
 *    		검색, 글쓰기, 수정, 회원가입, 회원탈퇴...
 *    		사용자의 동작과 관련
 *    		리턴형 메소드명 (매개변수...) => 선언부
 *    		{
 *    			구현부
 *    		}
 *    	 = 리턴타입 (리턴형)
 *   		처리후 결과값 한개만 전송가능
 *   		*** 여러개인 경우 : 배열, 클래스
 *   		*** 한개인 경우 : 일반 기본형, String
 *   		사용법
 *   		1) 결과값이 있는 경우
 *   		   리턴형 메소드명 (매개변수...) { 하지만 리턴형이 데이터형이 더 클수는 있음
 *   		   --------------------------
 *   				return 데이터형 (값)이 일치 해야함 => return의 데이터형은 되도록 같은 데이터형을 사용
 *   			}
 *   
 *              static int method() {
 *              	return (int)10.5;
 *              }
 *              나중에 출력시 ==> int a = method();  ==> a==5
 *              		==> method()
 *              
 *              ==> int a = method()
 *              ==> 결과값만 받아서 처리
 *              예) 오라클에서 데이터를 읽기
 *              	-----------------
 *              		=> 브라우저로 보냄
 *              		MVC (Model, View, Controller)
 *              	=> 자바 : 데이터관리 (오라클 , 스프링)
 *              	=> 자바스크립트 : 이벤트 처리 (브라우저)
 *              	NodeJS / ReactJS / VueJS/ Redux / VueX / TypeScript / Ajax/ Jquery
 *              
 *              
 *              
 *              static int[] method() {
 *              	int[] arr = {1,2,3,4,5};
 *              	배열 주소만 넘겨줌
 *              	return arr;
 *              }
 *              ==> int[] arr = method(); //결과값이 있는 경우//다른 변수를 선언해서 값을 받아야함
 *              
            2) 결과값이 없는 경우 
               void method {
               ----
               		return; //메소드 종료
            	
               }
               ==> method()
               
               void method1() {
               		생략 => 컴파일러가 눈에는 안보이지만 자동으로 추가해줌
               }
               => 자동으로 추가되는 import 
               import java.lang.*; ==> 자동으로 추가
               		system / String / math
               		---------------------- 이들은 java.lang에 들어가 있어서 import를 안해도 사용 가능
               		
               => 자동으로 추가되는 extends 
               		Object
               		
 *       = 메소드명
 *       	=> 식별자와 동일함
 *       	=> 길이에 제한이 없음 => 의미를 부여
 *       	=> aaa(), bbb(), ccc()
 *       	=> getName(), getTitle()
 *       	=> setName()...
 *       
 *       = 매개변수
 *       	=> 사용자 요청값
 */
public class 정리 {
	public static void main(String[] args) {
		
	}
}
