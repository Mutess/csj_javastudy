/*
 * 3. 년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
	년도 입력 메소드
	윤년 처리 
	출력 

 */
import java.util.Scanner;
public class 문제3_윤년 {
	static void year () {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int input = scan.nextInt();
	
	
	if((input % 4 == 0 && input % 100 != 0)|| (input % 400 == 0)) {
		System.out.println(input+"년은 윤년입니다.");
	}
	else {
		System.out.println(input+"년은 윤년이 아닙니다.");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		year();
	}

}
