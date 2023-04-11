import java.util.Arrays;

/*
 *  1. 달력 만들기
 *    기능
 *    1. 년도 / 월 입력
 *    2. 1일자의 요일 ==> 세분화 (전년도 하, 월을 끝일, )
 *    3. 달력을 출력
 *    -----------------
 *    ==> 재사용할수 있는 메소드 (윤년체크)
 *    
 *    
 *  2. 숫자야구게임
 *    1. 난수 발생
 *    2. 사용자 입력
 *    3. 비교
 *    4. 힌트
 *    5. 종료 여부 확인
 *    
 *    
 *    40  30  10  50  20
 *    --  --
 *    30  40
 *    --      --
 *    10	  30
 *    --	  --
 *    10		  50
 *    --		  --
 *    10			  20
 *    --------------------------for 1회차
 *    10  40  30  50  20
 *    	  --  -- 
 *    	  30  40
 *    	  --  --
 *    	  30	  50
 *    	  -- 	  --
 *    	  20		  30
 *    -------------------------- for 2회차
 *    10  20  40  50  30
 */
public class 메소드조립법_1_선택정렬 {
	static void sort (int[] arr, int n) { //n==1 ASC, n==2 DESC
		for (int i = 0;i<arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (n == 1) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];  //arr[i] = 50 , temp = 50
						arr[i] = arr[j]; //arr[j] = 40, arr[i] = 40
						arr[j] = temp; //arr[j] = 50
					}
				}
				else {
					if (arr[i] < arr[j]) {
					int temp = arr[i];  //arr[i] = 50 , temp = 50
					arr[i] = arr[j]; //arr[j] = 40, arr[i] = 40
					arr[j] = temp; //arr[j] = 50
					}
				}
			}
		}
	}
	static void sort1 (int[] arr, int n) {
		for (int i = 0;i<arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				boolean bCheck = false;
				if (n == 1) {
					bCheck = arr[i] > arr[j];
				}
				else {
					bCheck = arr[i] < arr[j];
				}
				
				
				if (bCheck) {
						int temp = arr[i];  //arr[i] = 50 , temp = 50
						arr[i] = arr[j]; //arr[j] = 40, arr[i] = 40
						arr[j] = temp; //arr[j] = 50
				} 
			}
		}
	}
	static void rand (int[] arr) {
		for (int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100) +1;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		rand(arr);
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		sort(arr,1); //arr하고 n == 1이면 오름
		System.out.println("정렬 후(오름차순) : " + Arrays.toString(arr));
		
		sort(arr,2); //arr하고 n == 2이면 내림
		System.out.println("정렬 후(내림차순) : " + Arrays.toString(arr));
		
		sort1(arr,1);
		System.out.println("정렬 후(오름차순) : " + Arrays.toString(arr));
		
		sort1(arr,2);
		System.out.println("정렬 후(내림차순) : " + Arrays.toString(arr));

	}

}
