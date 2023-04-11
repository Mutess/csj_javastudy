/*
 * 정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
	정수 입력 
	이진법 처리
	출력 

 */
import java.util.Scanner;
public class 문제1_이진법 {
	static void input () {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int num = scan.nextInt();
		
		int[] binary = new int[16];
		int index = 15;
		
		while (true) {
			binary[index] = num % 2;
			num = num / 2;
			if (num == 0) {
				break;
			}
			index--;
		}
		for (int i = 0; i< binary.length; i++) {
			if(i % 4 == 0 && i != 0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}

}
