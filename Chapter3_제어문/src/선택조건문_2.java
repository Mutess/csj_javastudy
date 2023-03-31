/*
 *   한개의 정수를 받아서 60이상이면 합격 아니면 불합격
 */
import java.util.Scanner;
public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력 : ");
		//입력 받고 저장
		int num = scan.nextInt();
		//요청처리 합/불합
		
		if(num >= 60) {
			System.out.println(num+"점 합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}

	}

}
