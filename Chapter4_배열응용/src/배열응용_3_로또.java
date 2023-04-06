import java.util.Arrays;

/*
 * 6개의 난수 발생 => 1~45 
 * => 조건 숫자의 중복X
 */
public class 배열응용_3_로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		/*for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			for (int j = 0; j<i; j++) { //i번째 하나는 넘어가고 저장 후 다음 수부터 중복 제거
				if (lotto[i] == lotto[j]) {
					i--;	//중복이 되면 그 자리의 숫자 랜덤발생시키는 반복문 다시 실행
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));*/
		
		int su = 0; // 난수를 저장
		boolean bCheck = false; // 중복여부 확인
		for (int i = 0; i<lotto.length;i++) {
			bCheck = true;
			while (bCheck) {
				su = (int)(Math.random()*45) + 1;
				bCheck = false;
				for (int j = 0; j<i; j++) { 
					if (lotto[j]==su) {
						bCheck = true;
						break;
					}
				}
			}
			lotto[i] = su;
		}
		System.out.println(Arrays.toString(lotto));
	}

}
