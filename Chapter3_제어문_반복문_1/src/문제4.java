/*
 * 윤년계산기
 * 
 * 4년 100년 400년은 미포함
 *  
 */
import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("윤년을 입력하세요 : ");
		int i = scan.nextInt();
		
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {  //꼭 외워야 함 // 달력만들때 필요
			System.out.println(i+"년도는 윤년입니다.");
		}
		else {
			System.out.println(i+"년도는 윤년이 아닙니다.");
		}

	}

}
