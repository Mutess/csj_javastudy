/*
 * 
 */
import java.util.Scanner;

class Sawon {
	// 인스턴스 변수 (클래스가 메모리에 저장된 변수)
	int sabun;
	String name;
	String dept; //부서
	String job; //직위
	String loc; //근무지
	long pay; //연봉
	
	//공유변수 (메모리 공간이 1개만 설정 => 컴파일러에 의해 자동으로 생성)	//new없이 사용이 가능
	static String Compony;//		//만약 ABC라는 회사가 망하면 ==> 회사명 => BCD로 변경 // 그럴때 static을 사용
							//그럼 하나하나 다 바꿔야 될

}  // 단순화,,, 추상화 작업
public class 사용자정의_데이터형_5 {

	public static void main(String[] args) {
		Sawon.Compony = "asd";  //new없이 사용이 가능
		//클래스변수명.변수명 ==> hong.compony
		//클래스명.변수명 ==> Sawon.compony
		//공유변수, 클래스변수 (클래스명으로 접근이 가능)
		//인스턴스 변수 ==> 인스턴스명.변수명
		
		Sawon hong = new Sawon();
		/* ==> 5개를 저장하는 공간을 생성
		 * 	int sabun;
			String name;
			String dept; //부서
			String job; //직위
			String loc; //근무지
			
			static은 하나의 공간만 생성
		 */
		hong.sabun = 1;
		hong.name = "홍길동";
		hong.dept = "개발부";
		hong.job = "대리";
		hong.loc = "서울";
		hong.pay = 4500;
		hong.Compony = "ABC";
		Sawon shim = new Sawon();
		//==> 5개를 저장하는 공간을 생성
		shim.sabun = 2;
		shim.name = "심청이";
		shim.dept = "개발부";
		shim.job = "사원";
		shim.loc = "서울";
		shim.pay = 3300;
		shim.Compony = "ABC";
		Sawon park = new Sawon();
		//==> 5개를 저장하는 공간을 생성
		park.sabun = 3;
		park.name = "박문수";
		park.dept = "개발군";
		park.job = "과장";
		park.loc = "서울";
		park.pay = 6300;
		park.Compony = "ABC";
		
		hong.Compony="BCD";  // static을 쓰면 저장 공간이 하나라서 다 바뀐다.
		shim.Compony="CDE";
		park.Compony="DEF";
		System.out.println("회사명 : "+hong.Compony);
		System.out.println("회사명 : "+shim.Compony);
		System.out.println("회사명 : "+park.Compony);
		
		hong.loc = "부산";// shim, park의 근무지를 그대로 서울
		System.out.println("근무지 : " + hong.loc);
		System.out.println("근무지 : " + shim.loc);
		System.out.println("근무지 : " + park.loc);
		


	}

}
