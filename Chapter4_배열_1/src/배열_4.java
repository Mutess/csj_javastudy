import java.util.Arrays;

/*
 * 임의의 정수 10개를 받아서 최대값, 최소값 구하기
 * 최대값, 최소값 (배열.ver)
 */
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[20];
		//초기화
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
		//1. 일반 for문
		for (int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		//for-each => 배열, 컬렉션 => 데이터가 모아서 관리할때 사용
		/*
		 * for (int a(실제 데이터를 가져옴):arr
		 */
		//출력할때만 사용 => 웹(브라우저) //웹에서 자주 사용 //특히 VueJS, ReactJS 자주사용
		for (int a:arr ) {
			System.out.print(a+" ");
		}
		System.out.println();
		//최대값, 최소값
		int max = arr[0];
		int min = arr[0];
		
		for (int a:arr) {
			if (max<a) {
				max = a;
			if (min>a) {
				min = a;
			}
			}
			
		}System.out.println("max : "+max);
			System.out.println("min : "+min);
	}

}
