import java.util.Arrays;

/*
 * 빈도수 구하기
 */
public class 배열응용_5_빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[100];
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10); //0~9까지의 숫자 
		}
		System.out.println(Arrays.toString(arr));
		
		//빈도수 확인
		int[] result = new int[10]; //빈도수 변수 저장공간 생성
		for (int i = 0;i<arr.length;i++) {
			result[arr[i]]++;  //arr[i] 0~9 숫자 나온 횟수를 result에 누적 //메모리를 하나 더 생성해서 같은 숫자가 나오면++; 누적시킴
		}
		for (int i = 0; i<result.length; i++) {
			System.out.println(i+" : "+result[i]);
		}
		
		//빈도수가 가장 많은 값, 빈도수가 가장 적은 값
		int max = result[0];
		int min = result[0];
		int index1 = 0, index2 = 0;
		for(int i = 0; i<result.length;i++) {
			if (max < result[i]) {
				max = result[i];
				index1 = i;
			}
			if (min > result[i]) {
				min = result[i];
				index2 = i;
			}
		}
		System.out.println("가장 많이 나온 수는 : "+index1+", 횟수는 : "+max);
		System.out.println("가장 적게 나온 수는 : "+index2+", 횟수는 : "+min);
//		System.out.println("빈도수가 가장 많은 수는 : "+index1);
//		System.out.println("빈도수가 가장 작은 수는: "+index2);
	}

}
