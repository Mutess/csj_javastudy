/*
 * 1~100 사이의 반복 수행
 * 11, 22, 33, 44, 55...
 * true 두개는 같은 정수입니다.    // false 두개는 다른 정수입니다
 */
public class 반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i <= 100; i++) {
			if (i % 11 == 0 ) {
				System.out.println(i+ "는(은) 앞뒤가 같은 정수입니다.");
			}
			else {
				System.out.println(i+"는(은) 다른 정수입니다.");
			}
		}

	}

}
