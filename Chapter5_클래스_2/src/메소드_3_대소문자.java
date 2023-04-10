/*
 * char를 한개 보내서 => 대문자, 소문자 => boolean (경우의 수가 2개이기 때문)
 */
import java.util.Scanner;
public class 메소드_3_대소문자 {
	static String isAlpha (char c) {
		String result = "";
		if (c>='A' && c <= 'Z') {
			result = "대문자";
		}
		else if (c>= 'a' && c <= 'z') {
			result = "소문자";
		}
		else {
			result = "알파벳X";
		}
		return result;
		
	}
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 입력 : ");
		String s = scan.next();
		char c= s.charAt(0);  //문자한개를 읽어와서 char로 전환 //즉 문자한개를 잘라와서 읽음
		/*
		 * String s= "Hello"
		 * 			  01234
		 * 			  => s.charAt(0) ==> 0이면 H, 1이면 e, 2면 1
		 */
		String result = isAlpha(c);
		System.out.println(c+"는(은) "+result);
		//가급적이면 결과값이 여러개인 경우 => 문자열로 처리
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
