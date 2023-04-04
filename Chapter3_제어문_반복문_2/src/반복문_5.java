/*
 *  가위바위보 게임 
 *  1. 5번
	com{  사용자 {
	가위(0)	가위 (0) 0 => 비김
			바위 (1) -1 => 사용자 이김
			보	(2) -2 => 컴퓨터 이김

	바위 (1)	가위 (0) 1 => 컴퓨터
			바위 (1) 0 => 비김
			보	(2) -1 => 사용자
	
	보(2)	가위 (0) 2 => 사용자 이김
			바위 (1) 1 => 컴퓨터 이김
			보 	(2) 0 => 비김
			
	비기는 경우 : 0
	사용자가 이기는 경우 : 2 -1
	컴퓨터가 이기는 경우 : -2 1
	}
 */
import java.util.Scanner;
public class 반복문_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int win = 0, lose = 0, same = 0; // 몇전 몇승 몇패
		
		while(true) { //무한루프 for문은 for(;;)
			System.out.print("가위(0)바위(1)보(2) 종료(9) : ");
			//컴퓨터가 난수 발생
			int com = (int)(Math.random()*3);
			int user = scan.nextInt();
			
			if (user == 9) { // 종료 먼저 안그러면 무한루프 걸림 // while, switch등 반복문 끝날때 쓰는게 break;
				System.out.println("게임 종료");
				//System.exit(0);
				break; // while 종료
			}
			//컴퓨터와 사용자의 가위바위보 낸거 확인
			if (com == 0) {
				System.out.println("컴퓨터 : 가위");
			}
			else if (com == 1) {
				System.out.println("컴퓨터 : 바위");
			}
			else if (com == 2) {
				System.out.println("컴퓨터 : 보");
			}
			
			if (user == 0) {
				System.out.println("사용자 : 가위");
			}
			else if (user == 1) {
				System.out.println("사용자 : 바위");
			}
			else if (user == 2) {
				System.out.println("사용자 : 보");
			}
			
			//결과값 출력
			switch (com-user) {
			case -1 : case 2 :
				System.out.println("사용자 Win!");
				win++;
				break;
			case 1 : case -2 :
				System.out.println("컴퓨터 Win!");
				lose++;
				break;
			case 0 : 
				System.out.println("비겼습니다");
				same++;
				break;
			}
		}
		//while 종료
		System.out.println("=======결과값========");
		int total = win+lose+same;
		System.out.printf("%d전 %d승 %d패 %d무\n", total, win, lose, same);
	}
}
