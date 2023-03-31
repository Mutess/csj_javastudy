/*
 * 정수를 입력을 받아서 3의 배수, 5의 배수, 7의 배수인지 확인하는 프로그램 , 아닌 경우 배수가 아니다라고 출력
 * 
 * 여러 문장을 출력해야 하면 단일 조건문으로 작성해야함 
 */
public class 단일조건문 {

	public static void main(String[] args) {
		// else 미사용
		int num = 35; //(int)(Math.random()*100) + 1; //ramdom은 0.0~0.99까지
		if (num % 3 == 0) 
			System.out.println(num+"는(은) 3의 배수입니다.");
		if(num % 5 == 0) 
			System.out.println(num+"는(은) 5의 배수입니다");
		if (num % 7 == 0) 
			System.out.println(num+"는(은) 7의 배수입니다");
		if (!(num % 3 == 0 || num % 5 == 0 || num % 7 == 0)) //위에 조건이 아닌때 괄호치고 앞에 !을 붙히면 됨
			System.out.println("해당 배수가 아닌 수 입니다.");
	
	
		
		
		// else 사용
		int num1 = 35; //(int)(Math.random()*100) + 1; //ramdom은 0.0~0.99까지
		if (num % 3 == 0) 
			System.out.println(num+"는(은) 3의 배수입니다.");
		else if(num % 5 == 0) 
			System.out.println(num+"는(은) 5의 배수입니다");
		else if (num % 7 == 0) 
			System.out.println(num+"는(은) 7의 배수입니다");
		else // (!(num % 3 == 0 || num % 5 == 0 || num % 7 == 0)) //위에 조건이 아닌때 괄호치고 앞에 !을 붙히면 됨
			System.out.println("해당 배수가 아닌 수 입니다.");

	}

}
