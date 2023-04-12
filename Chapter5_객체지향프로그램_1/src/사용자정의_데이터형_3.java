/*
 *   1. 같은 자바파일에 클래스 여러개 만들 수 있다.
 *   	-----------------
 *   	public는 한개의 class에서만 사용이 가능
 *   2. 권장사항 => 파일을 따로 만든다. 
 *   
 *   	
 *   M      V 	     C
 *  ---	   ---	  	---
 *  java 	DB	  둘이 이어줌
 */
class Category {
	int no;  //구분자
	String poster;
	String title;
	String subject;
}
/*
 * 	멤버변수(인스턴스 변수) (클래스안에서 선언)
 *  -----------------
 *  기본형
 *  배열
 *  클래스 (String[]등과 같은)
 */
class FoodHouse {  //멤버변수 (인스턴즈)
	int no; //항상 구분자는 숫자로 (중복이 되지 않은 숫자) ==> primary key (기본 키) => 상세보기  //구분자는 중요함
	int cno; //카테고리 넘버 (참조키) ==> foreign key(외래키)
	String[] poster = new String[5];
	String name;
	double score;
	String addr1, addr2;
	int tel;
	String type;
	String price;
	String parking;
	String stime, etime;
	String hol;
	String menu;	//갯수가 달라서 배열로 잡을 수가 없음 // 동일하지 않은 메뉴의 갯수를 통째로 저장
}
public class 사용자정의_데이터형_3 {

	public static void main(String[] args) {
		
	}

}
