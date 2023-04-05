import java.util.Arrays;

/*
 * 위험
 * 
 * 주소참조를 하면 arr1과 arr2값을 둘중하나라도 바꾸면 주소안의 값이 바뀜
 * => arr1과 arr2이 같이 메모리 주소를 제어하고 있음
 */
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = arr1.clone(); //별칭 (참조데이터) //.clone()(복사)을 사용하면 다른 메모리를 생성해서 관리(제어)하는 메모리가 달라짐 // .clone()시 가져올 메모리의 값도 같이 복사해서 가져옴
		System.out.println("arr1"+Arrays.toString(arr1));
		System.out.println("arr2"+Arrays.toString(arr2));
		System.out.println(arr1);
		System.out.println(arr2);
		
		System.out.println("============배열값 변경============");
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		arr2[3] = 400;
		arr2[4] = 500; 
		System.out.println("arr2"+Arrays.toString(arr2));
		System.out.println("arr1"+Arrays.toString(arr1)); 
		
		
		int[] arr3 = new int[10];
		for (int i = 0; i < arr1.length; i++) { //복사할 때 배열의 정수가 증가할 시에 사용하는 배열
			arr3[i] = arr1[i];
		}
		System.out.println("새로운 배열 : "+Arrays.toString(arr3));
	}

}
