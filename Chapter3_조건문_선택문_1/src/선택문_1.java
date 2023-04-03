/*
 * switch ~ case문은 특정값 하나의 값을 선택해야 할때 사용
 * 
 * switch(여기 안에 char(문자), int(정수), String(문자열) 중 하나를 넣으면 됨)
 * 
 * => 많이 사용되는 위치 : 게임(키보드별 처리, 메뉴), 네트워크(기능별 처리)
 * 		웹 ==> 화면 전환
 * => 형식)
 * 	  switch (문자, 정수, 문자열) {
 * 	  		case 'A':  => (문자열일때) case "login" : case "logout": (정수일때) case 1: case 2:
 * 				문장 1	
 * 			case 'B':
 * 				문장 2
 * 			case 'C':
 * 				문장 3
 * 			default :
 * 				문장 4 ==> A,B,C가 아닌 경우에 처리 => 생략가능
 *				====> 이 상태에서 B를 넣었을때 문장2, 3, 4를 다 수행함 
 *				====> 그래서 각 case문에 break를 넣어줘야함(default는 안줘도 됨)  
 *    }
 * 
 * ex) 
 * switch (char , int , String) {
 * 		게임이나 메뉴
 */
import java.util.Scanner;
public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========메뉴=======");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 로그아웃");
		System.out.println("4. 맛집추천");
		System.out.println("5. 레시피만들기");
		System.out.println("6. 프로그램 종료");
		System.out.println("==================");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 버튼을 눌러주세요 : ");
		int menu = scan.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("로그인을 요청하셨습니다.");
			break;
		case 2:
			System.out.println("회원가입을 요청하셨습니다.");
			break;
		case 3:
			System.out.println("로그아웃을 요청하셨습니다.");
			break;
		case 4:
			System.out.println("맛집추천을 요청하셨습니다.");
			break;
		case 5:
			System.out.println("레시피만들기를 요청하셨습니다.");
			break;
		case 6:
			System.exit(0); //(0)정상종료, (다른 번호)비정상종료
			break;
		default :System.out.println("메뉴에 없는 번호입니다.");
		}
	}

}
