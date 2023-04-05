/*
 * 배열의 필요성
 * 배열선언
 * ==> 85page => int a1~a1000
 * int[] student = new int [1000]
 * => 동일 데이터를 연속적으로 모아서 처리할 목적 => 배열
 * double[] = d={10,20,30}
 * int[] arr = {'A', 'B', 10.5};
 * 
 * => 메모리 주소를 이용한다. : 참조변수
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100) +1;
			System.out.printf("arr[%d]=%d\n", i ,arr[i]);
		}
		
		int max = 0;
		for (int i = 0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max : "+max);

	}

}
