/*
 * 윤년 계산기 (년도를 입력 받아서 윤년여부를 확인)
 * 
 * 조건 
 * 1. 4년 마다 한번씩 
 * 2. 100년 마다는 제외
 * 3. 400년 마다
 * 
 * (year % 4 == 0) && year% 100 != 0 || year % 400 == 0) 윤년조건
 */
import java.util.Scanner;
public class 조건문_ex윤년계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		
		if ((year % 4 == 0 && year% 100 != 0) || (year % 400 == 0))
			System.out.println(year+"년도는 윤년입니다.");
		if(!((year % 4 == 0 && year% 100 != 0) || (year % 400 == 0)))
			System.out.println(year + "년도는 윤년이 아닙니다.");
		
	
	}
}
