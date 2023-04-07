import java.util.Scanner;
/*
 *   같은 문자열인지 확인
 *   => 기본형 (==, !=)
 *   => 문자열 비교 (equals(), !equals())
 *   => Login => id, password
 */
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ID = "hong";  //ID 패스워드
		final String PWD = "H1234";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String id = scan.next();
		
		System.out.print("PW : ");
		String pwd = scan.next();
		
		//String => 문자열 저장이 아니고 메모리 주소를 기억하기에 다르게 나옴
		//equals()=> 메모리에 실제 저장된 문자열를 가져와서 비교, 그리고 대소문자를 구분비교
		//equals()=> 로그인, 아이디 찾기, 아이디 중복체크, 비밀번호 찾기 
		//equalsIgnoreCase() => 대소문자를 구분하지 않는 기능 ==> 검색할때 사용 fd.equalsIgnoreCase()
		
		//로그인
		if (id.equals(ID) && pwd.equals(PWD)) {   //문자열은 ==으로 구분이 안됨 //그래서 equals()사용
			System.out.println(id+"님 로그인 되었습니다.");
		}
		else {
			System.out.println("아이디나 비밀번호가 틀립니다.");
		}

	}

}
