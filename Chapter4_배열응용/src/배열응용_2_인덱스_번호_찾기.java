import java.util.Arrays;

/*
 *   정수 10개 저장공간 => 임의로 초기화 (1~100사의의 난수)
 *   최대값 / 최소값 ==> 배열안에 몇번째 위치에 있는 확인
 *   
 *   1 2 3 4 5 6 7 8 10 9
 *   --------------------
 *   max = 10 ==> arr[8]
 *   min = 1 ==> arr[0]
 *   
 *   => 영화 ==> 같은 인덱스
 *   제목
 *   포스터
 *   장르
 *   감독
 *   출연
 *   순위
 */
public class 배열응용_2_인덱스_번호_찾기 {

	public static void main(String[] args) {
		int [] arr = new int[10];
		
		for (int i = 1; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		//최대값
		//최소값
		int max = arr[0];
		int min = arr[0];
		for (int i:arr) {
			if (max < i) 
				max = i;
			if (min > i)
				min = i;
			}
		System.out.println("max : " +max);
		System.out.println("min : " +min);
		
		//인덱스 번호 추출
		int index1 = 0, index2 = 0;
		for(int i = 0; i<arr.length;i++) {
			if (arr[i] == max) {
				index1 = i; // i가 인덱스 번호
			}
			else if (arr[i] == min) {
				index2 = i; // i가 인덱스 번호
			}
		}
		System.out.println("인덱스 위치 : " + index1 + ", 최대값 위치 : " + (index1+1)+"번째 위치");
		System.out.println("인덱스 위치 : " + index2 + ", 최소값 위치 : " + (index2+1)+"번째 위치");
		}
		

}
