/*
 *   3의 배수, 5의 배수, 7의 배수의 합 => 갯수확인
 */
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3 = 0, a5 = 0, a7 = 0; //합  //누적변수
		int c3 = 0, c5 = 0, c7 = 0; //갯수 //증가변수
		int max = 0, min=0;
		
		int i = 1; //초기값
		while (i <= 100) { //조건식 //루프변수
			// 중복적으로 수행 => 단일 조건문, 중복이 없는 경우 => 다중조건
			if( i % 3 == 0) {
				a3 += i;
				c3++;
			}
			if (i % 5 == 0 ) {  //중복이 있는 경우 단일 조건문사용
				a5 += i;
				c5++;
			}
			if (i % 7 == 0) {
				a7 += i;
				c7++;
			}
			i++; //증가식
		}
		//최댓값
		max = c3;
		if (max < c5) {
			max = c5;
		}
		if (max < c7 ) {
			max = c7;
		}
		//최저값
		min = c3;
		if (min > c5) {
			min = c5;
		}
		if (min > c7 ) {
			min = c7;
		}
		
		System.out.println("=================결과값=================");
		System.out.println("1~100사이의 3의 배수합 : "+a3+", 갯수 : "+c3);
		System.out.println("1~100사이의 3의 배수합 : "+a5+", 갯수 : "+c5);
		System.out.println("1~100사이의 3의 배수합 : "+a7+", 갯수 : "+c7);
		System.out.println("최대 갯수 : "+max);
		System.out.println("최저 갯수 : "+min);
		
	}

}
