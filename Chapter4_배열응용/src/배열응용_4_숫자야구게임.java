/*
 *   숫자 야구게임
 *   1. 컴퓨터 = 임의의 숫자 3개 발생 (1~9까지의 난수 발생(중복X))
 *   	3 6 9
 *   2. 사용자가 숫자를 입력해서 발생된 난생 맞추는 게임
 *   3. 힌트  (입력예시)
 *   	ex)2 6 9 
 *   	   ------> 0S(strike)-2B(Ball)
 *   	3 7 8
 *   	---------> 1S-0B
 *   	3 9 8
 *   	---------> 1S-1B
 *   	3 6 9
 *   	---------> 3S-0B
 *   
 *   	----------
 *   	S : ●
 *   	B : ○
 *   	----------
 *   
 *   여기서 봐야 할것은 조건문이 어디에 들어가고 각 기능이 어느 타이밍에 들어가는 지
 */
import java.util.Arrays;
import java.util.Scanner;
public class 배열응용_4_숫자야구게임 {

	public static void main(String[] args) {
		int[] com = new int[3]; //난수 => 저장
		int[] user = new int[3]; // 입력
		//컴퓨터 저장 및 중복 제거
		for (int i = 0;i<com.length;i++) {
			com[i] = (int)(Math.random()*9) + 1;
			for (int j = 0; j<i;j++) {
				if (com[i] == com[j]) {  //중복 확인
					i--; 
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(com));
		// 사용자 입력
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("3자리 정수를 입력하세요 : ");
			int input = scan.nextInt();
			if (input<100 || input>999) {
				System.out.println("잘못된 입력입니다.");
				continue; //while문 조건식으로 이동 // 즉 처음부터 다시 수행
			}
			//세자리의 정수를 입력했다면
			user[0] = input / 100; //369 / 100 => 3
			user[1] = (input % 100) / 10; //369%100 => 69 == 69/10 ==> 6
			user[2] = input % 10; //369%10 ==> 9
			
			//1. 같은 수를 입력하면 안된다.
			if (user[0] == user[1] || user[1]==user[2] || user[0] == user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다");
				continue; // 다시 조건문으로 이동
			}
			//2. 0을 포함할 수 없다.
			if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0을 포함할 수 없습니다.");
				continue; // 다시 조건문으로 이동
			}
			//힌트 준비
			int s = 0, b = 0;
			for (int i = 0; i<com.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j]) {
						if (i == j) 
							s++;
						else
							b++;
						
					}
				}
			}
			//힌트 제공
			//System.out.printf("Input : %d, Result : %dS-%dB\n", input, s, b);
			System.out.println("===============");
			System.out.print("S : ");
			for (int i = 0; i<s; i++) {
				System.out.print("●");
			}
			System.out.print("\nB : ");
			for (int i = 0; i<b; i++) {
				System.out.print("○");
			}
			System.out.println("\n===============");
			//종료(break) ==> S => 3
			if (s == 3) {
				System.out.println("정답!");
				break;
			}
		}
	}

}
