/*
 * 1~100까지의 합
 */
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;   // 곱하기 할땐 1로 시작
		for (int i = 1; i <= 100; i++ ) {
			sum = sum + i; //sum += i;
			System.out.println("sum = "+sum+" i = "+i);
		}
		System.out.println("==========최종 결과값===========");
		System.out.println("1~100까지의 합은 : " + sum); 
		System.out.println(" ");
		
		//짝수
		sum = 0;     
		for (int j = 0; j <= 100; j+=2 ) {  // 곱하기 할땐 1로 시작
			sum = sum + j; //sum += i;
			System.out.println("sum = "+sum+" i = "+j);
		}
		System.out.println("==========최종 결과값===========");
		System.out.println("1~100까지의 짝수의 합은 : " + sum);
		System.out.println(" ");
		
		//홀수
		sum = 0;   
		for (int z = 1; z <= 100; z+=2 ) {  // 곱하기 할땐 1로 시작
			sum = sum + z; //sum += i;
			System.out.println("sum = "+sum+" i = " + z);
		}
		System.out.println("==========최종 결과값===========");
		System.out.println("1~100까지의 홀수의 합은 : " + sum);
		
		//3의 배수
		sum = 0;   
		for (int z = 1; z <= 100; z+=3 ) {		// 곱하기 할땐 1로 시작
			sum = sum + z; //sum += i;
			System.out.println("sum = "+sum+" i = " + z);
		}
		System.out.println("==========최종 결과값===========");
		System.out.println("1~100까지의 3의 배수의 합은 : " + sum);
		
		//4의 배수
		sum = 0;   
		for (int z = 0; z <= 100; z+=4 ) {    // 곱하기 할땐 1로 시작
			sum = sum + z; //sum += i;
			System.out.println("sum = "+sum+" i = " + z);
		}
		System.out.println("==========최종 결과값===========");
		System.out.println("1~100까지의 4의 배수의 합은 : " + sum);
	}
	

}
