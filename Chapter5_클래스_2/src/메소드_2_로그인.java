/*
 *   ID, PWD를 받아서 로그인 처리
 *   
 */
import java.util.Scanner;
/*
 *   리턴형은 경우의 수
 *   2개 => boolean
 *   3개 => int, String
 *   	   ID가 없는 경우 (int는 1) (String은 설명하면 됨(아이디가 없다(NOID)))
 *   	   ID는 존재 Password가 틀리는 경우 (int는 2) (String은 설명하면 됨(비밀번호가 다르다(NOPWD)))
 *   	   ID,PWD가 맞을 경우 (int는 3) (String은 설명하면 됨(로그인(LOGIN)))
 *   	   --------------------------------------------------------
 *   	   1. 재사용
 *   	   2. 견고
 *         3. 가독성
 *         
 */
public class 메소드_2_로그인 {
	static String isLogin(String id, String pwd) {
		String[] ids = {"hong", "park", "shim", "lee", "kang"};
		String[] pwds = {"1234", "2345", "3456", "4567", "6789"};
		String[] names = {"홍길동", "박문수", "심청이", "이순신", "강감찬"};
		// 이 데이터들은 파일이나 오라클에 존재할 것임
		// but 메모리는 안됨 (휘발성이라서)
		
		int index = 0;
		boolean bCheck = false;
		for (int i = 0; i<ids.length; i++) {
			if (id.equals(ids[i])) {
				bCheck = true;
				index = i; // 인덱스 번호를 맞추기위해 index번호 저장을 위해 index에 i를 넣어줌
				break;
			}
		}
		String result = "";
		
		if (bCheck == true) {
			if (pwd.equals(pwds[index])) {
				result = names[index];
			}
			else {
				result = "NOTPWD";
			}
		}
		else {
			result = "NOID";
		}
		
		return result;
	}
	
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID 입력 : ");
		String id = scan.next();
		
		System.out.print("Password 입력 : ");
		String pwd = scan.next();
		
		//검증 (로그인 처리)
		String result = isLogin(id,pwd);
		
		if (result.equals("NOID") ) { //아이디가 없는 상태
			System.out.println("아이디가 존재하지 않습니다!");
		}
		else if (result.equals("NOTPWD")) { //비밀번호를 틀린 상태
			System.out.println("비밀번호가 틀립니다");
		}
		else { //로그인된 상태
			System.out.println(result+"님이 로그인 되었습니다.");
		}
//		메소드_3_대소문자.process();// 재사용 기법
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
