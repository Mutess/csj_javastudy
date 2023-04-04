/*
 * ********** (5행10열)            **********            **********            **********            **********

 */
public class 반복문_문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=========문제 14=======");
		//문제14
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j<=5; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("=========문제 15=======");
		//문제 15
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j<=5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("========문제 16========");
		//문제 16
		
		for (int i = 1; i <= 5; i++) {
			char c = 'A';
			for (int j = 1; j<=5; j++) {
				System.out.print(c++ +" ");
			}
			System.out.println();
			//c++;
		}
		System.out.println("========문제17========");
		//문제17
		char c = 'A'; 
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j<=5; j++) {
				System.out.print(c+" ");
			}
			System.out.println();
			c++;
		}
	}

}
