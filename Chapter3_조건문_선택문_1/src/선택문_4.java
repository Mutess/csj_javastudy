/*
 * 중첩 switch문 // 특별한 경우가 아니면 거의 사용빈도가 없음.
 * 		switch () {
 * 			case 값: 
 * 			  switch () {
 * 			  
 *            }
 * 
 * 		}
 * 
 */
// 가위바위보
/*
 * 	가위
 * 	  가위
 * 	  바위
 *    보
 *  바위
 *    가위
 *    바위
 *    보
 *  보
 *    가위
 *    바위
 *    보
 */
import java.util.Scanner;
public class 선택문_4 {

	public static void main(String[] args) {
		// 컴퓨터가 먼저 가위바위보를 내게 설정
		// 사용자 입력
		// 비교(처리) ==> 결과값 출력
		// 변수 설정 => 변수에 대한 처리(연산자, 제어문) => 결과값을 출력
		int com = (int)(Math.random()*3); // 0가위 1바위 2보
		Scanner scan = new Scanner(System.in);
		System.out.print("(0)가위 (1)바위 (2)보 입력 : ");
		int user = scan.nextInt();
//		String [] result = {"가위", "바위", "보"};
//		System.out.println("컴퓨터 : " + result[com]);
//		System.out.println("플레이어 : " + result[user]);
		
		switch (com) {
		case 0:
			System.out.println("컴퓨터 : 가위");
			break;
			//break 밑에다가 코딩하는 경우 오류 발생
		case 1 :
			System.out.println("컴퓨터 : 바위");
			break;
		case 2:
			System.out.println("컴퓨터 : 보");
			break;
		}
		switch (user) {
		case 0:
			System.out.println("플레이오 : 가위");
			break;
			//break 밑에다가 코딩하는 경우 오류 발생
		case 1 :
			System.out.println("플레이어 : 바위");
			break;
		case 2:
			System.out.println("플레이어 : 보");
			break;
		} 
		//결과값
		switch (com) {
		case 0: //가위
			switch (user) {
			case 0 :
				System.out.println("비겼다.");
				break;
			case 1 :
				System.out.println("사용자 Win");
				break;
			case 2 : 
				System.out.println("컴퓨터 Win");
				break;
			}
			break;
		case 1: //바위
			switch (user) {
			case 0 :
				System.out.println("컴퓨터 Win");
				break;
			case 1 :
				System.out.println("비겼다.");
				break;
			case 2 : 
				System.out.println("사용자 Win");
				break;
			}
			break;
		case 2 : //보
			switch (user) {
			case 0 :
				System.out.println("사용자 Win");
				break;
			case 1 :
				System.out.println("컴퓨터 Win");
				break;
			case 2 : 
				System.out.println("비겼다.");
				break;
			}
			break;
		
	}
	
	}

}
