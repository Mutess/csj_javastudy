/*
 * 성적계산
 * 
 * 계절일때 case 3:
 * 		  case 4:
 * 		  case 5:
 * 			sysout("봄")
 * 			break;
 */
import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("3개의 정수를 입력하세요 : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int avg = (kor+eng+math) / 3;
		
		//case가 중복이 되면 안됨, 순서가 존재하지 않음
		//default가 중간이나 처음으로 가도 되지만 그럴경우 break를 걸어줘야함
		
		char score = 'A';
		
		switch (avg/10) {
		case 10 :   // 100 
		case 9 :    // 99~90     => (avg/10) == 10 || (avg/10) == 9
			score = 'A';
			break;
		case 8 : 
			score = 'B';
			break;
		case 7 : 
			score = 'C';
			break;
		case 6 : 
			score = 'D';
			break;
		default :
			score ='F';
		}
		System.out.println("학점은 : "+ score);
	}

}
