/*
 * 
 */
public class 삼항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = (int)(Math.random()*2); //랜덤수 2개 발생 0, 1
		char c1 = (char)((Math.random()*26)+65);
		char c2 = (char)((Math.random()*26)+97);
		char res = (no == 0 ? c1 : c2);  // 0이면 대문자를 나오게 하고, 1이면 소문자를 나오게 한다.

		System.out.println(res);
		System.out.println(res >= 'A' && res <='Z' ? res + "는(은) 대문자 입니다." : + res + "소문자입니다.");
	}

}
