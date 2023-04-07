/*
 *   length() => 문자갯수 => 
 *   trim() ==> 좌우의 공백을 제거할 때 사용
 *   javaScript => java 메소드 동일 => jquery / vueJS / reactJS
 */
import java.util.Scanner;
public class 문자열_4 {
	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입려 : ");
		String s = scan.next();
		System.out.println("입력된 값 : "+s);
		System.out.println("문자 갯수 : "+s.length()+"자리"); */
		
		String s = " Hello Java!! ";
		System.out.println("S : "+s.length());
		System.out.println("좌우 공백 제거 : "+s.trim().length()); //좌우의 공백만 제거가능
	}

}
