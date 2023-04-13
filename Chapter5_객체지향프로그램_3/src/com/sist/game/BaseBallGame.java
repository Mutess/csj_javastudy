package com.sist.game;

import java.util.Arrays;
import java.util.Scanner;
/*
 *   1. 컴퓨터 난수 발생 int[] com 
 *   2. 사용자 입력  int[] user
 *   3. 비교		int[] com , int[] user => s,b
 *   4. 힌트  s, b
 *   5. 종료여부 확인 s 
 */
public class BaseBallGame {
	int[] com = new int[3];
	int[] user = new int[3]; //중복으로 사용되는 변수들은 멤버변수(전역으로 잡는다.) //프로그램 종료전까지 사라지지 않음
	int s,b;
	int count;
	
	//1. 컴퓨터 난수 발생
	void rand() {
		for (int i = 0; i<com.length; i++) {
			com[i] = (int)(Math.random()* 9) +1;
			for (int j = 0; j<i;j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
	}
	//2. 사용자 입력 ==>  void
	void userInput () {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("숫자 3자리를 입력하세요 (중복X) : ");
			int input = scan.nextInt();
			if (input < 100 || input > 999) {
				System.out.println("잘못된 입력입니다.");
				continue; //도스에서만 사용 //웹에서는 break는 쓰지만 continue는 사용X
			}
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			
			if (user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("같은 숫자는 사용할 수 없습니다.");
				continue;
			}
			if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			break; //정상입력시 종료
		}
	}
	//3. 비교	 ==> void
	void compare () {
		s = 0;
		b = 0;
		for (int i = 0; i<com.length; i++) {
			for (int j = 0; j<user.length;j++) {
				if (com[i] == user[j]) {
					if (i == j) {
						s++;
					}
					else {
						b++;	
					}
					}
				}
			}
		}
	//4. 힌트	 ==> void
	void hint () {
		System.out.printf("Player : %d%d%d, Result : %dS-%dB\n", user[0], user[1], user[2], s, b);
	}
	//5. 게임 종료 여부  ==> void
	boolean isEnd (int s) {  //종료 확인을 위해 매개변수가 있음
		boolean bCheck = false;
		if (s == 3) {
			bCheck = true;
			count++;
		}
		return bCheck;
	}
	//6. 다 만들고 조립 => process
	void process() {
		Scanner scan = new Scanner(System.in);
		rand();
		while (true) {
			userInput(); //사용자 입력 후 
			compare(); //비교
			hint(); //힌트 정답유도
			if (isEnd(s)) {
				System.out.println("게임을 다시 하겠습니까? (Y(y)/N(n))");
				char c = scan.next().charAt(0);
				if (c == 'Y' || c == 'y') {
					System.out.println("새게임을 시작합니다");
					System.out.println("누적 정답 : " + count);
					process(); //재귀호출
				}
				else if (c == 'N' || c == 'n'){
					System.out.println("Game Over");
					System.out.println("누적 정답 : " + count);
					System.exit(0);
				}
				else {
					System.out.println("다른 버튼을 입력했습니다.");
					continue;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		BaseBallGame b = new BaseBallGame();
		b.process();
	}
}
