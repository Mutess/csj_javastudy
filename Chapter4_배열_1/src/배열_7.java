import java.util.Arrays;

/*
 * 
 */
public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,'A', 'B', 100, 15}; //int보다 더 큰 데이터형은 못들어감
		System.out.println(arr1); //이렇게 출력하면 실제 메모리 주소값이 나옴
		System.out.println(Arrays.toString(arr1));
		
		double[] arr2 = {10,'A', 'B', 100, 15.7};
		System.out.println(Arrays.toString(arr2)); //double이라 소숫점이하가 붙음
		
		char[] arr3 = {'A',66, 'C', 78, 97}; // char형은 int를 포함하여 작성은 가능하되 출력시 알파벳으로 출력함
		System.out.println(Arrays.toString(arr3));
		
		boolean[] arr4 = new boolean[5];
		System.out.println(Arrays.toString(arr4)); //boolean는 초기값이 false로 이루어짐
		
		byte[] arr5 = new byte[5];
		System.out.println(Arrays.toString(arr5)); //byte는 0값으로 초기값이 이루어짐
		
		//int[] arr; ==> 이건 null값임 // 주소가 없는 경우

	}

}
