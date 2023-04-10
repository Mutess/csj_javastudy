import java.util.Arrays;

/*
	  	 리턴형		매개변수
	  1	   O		  O
	  2    O		  X
	  3    X		  O
	  4    X		  X
	  -------------------
	  1) 2단에서 9단까지 구구단 출력 (4번)
	  	 static void gugudan() {
	  	 
	  	 }
	  2) id, pwd를 받아서 로그인이면 true, 로그인이 아니면 false (1번)
	  	 static boolean isLogin(String id, String pwd)
	  	 
	  3) 검색어를 입력받아서 검색된 노래명들을 출력 (3)
	  	 static void find (String fd)
	  	 => 검색어를 입력받아서 검색된 노래명들을 받아서 출력
	  	 						-------
	  	 static String[] find (String fd)
	  	 		------- 노래명들이니 여러개가 넘어와서 String[]을 사용
	  
	  4) 5개의 정수를 넘겨주고 정렬된 정수를 받는다.
	  	 static(int[] (return형은 무조건 한개의 값만 받을 수 있어서 5개의 정수를 받게 하고 싶으면 배열을 사용 )) sort (int a, int b, int c, int d, int e)
	  	 static (int[] sort (int[] arr)
	  	 결과값이 여러개인 경우에는 배열을 이용한다.
	  
 */
//6개의 난수를 발생시켜서 => 전송을 받은 다음 => 총합과, 평균
public class 메소드_3 {
	//6개의 난수 발생
	static int[] rand() {
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
		return arr;
	}
	static int max(int[] arr/*((매개변수))*/) {
		int m = arr[0];
		for (int a:arr) {
			if (m < a) {
				m = a;
			}
		}
		return m;
	}
	static int min(int[] arr) {
		int m = arr[0];
		for (int a:arr) {
			if (m > a) {
				m = a;
			}
		}
		return m;
	}
	static void process() {
		int[] arr = rand(); //얕은 복사
		int total = 0;
		for (int a:arr) {
			total += a;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합 : "+total);
		System.out.printf("평균 : %.2f\n", total/(double)arr.length);
		System.out.println("최댓값 : "+max(arr));
		System.out.println("최소값 : "+min(arr));   //지금은 단지 출력할려고 min(arr)라고 썻지만 아래에 더 사용할려면 변수를 새로 잡아야 아래에서 더 사용할 수 있음
		int max = max(arr);
		System.out.println("최댓값 : "+max);
		int min = min(arr);
		System.out.println("최소값 : "+min);  
		System.out.println("최대값과 최소값의 차는 : "+(max-min));  //지금처럼 다시 사용할꺼면 변수를 다시 잡아야함
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
