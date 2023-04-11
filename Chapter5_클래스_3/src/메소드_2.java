import java.util.Arrays;

/*
 *   매개변수 전송법 2가지
 *   Call by Value : 일반 기본형 데이터 전송 (String) 
 *   Call by Reference : (주소값을 넘겨주는 방식 (배열, 클래스))
 */
public class 메소드_2 {
	//call by value
	static void swap (int x, int y) {
		System.out.println("교환 전 : "+"x="+x+", y"+y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("교환 후 : "+"x="+x+", y"+y);
	}
	
	//call by reference
	static void swap2 (int[] arr2) {
		System.out.println("arr2 : "+ Arrays.toString(arr2));
		System.out.println("교환전 : arr2[0] : "+arr2[0]+", arr2[1] : "+arr2[1]);
		int temp = arr2[0];
		arr2[0]=arr2[1];
		arr2[1]=temp;
	}
	
	//String
	static void swap3 (String id, String pwd) {
		System.out.println("교환전 id: "+id+", pwd"+pwd);
		String temp = id;
		id = pwd;
		pwd = temp; 
		
		System.out.println("교환후 id: "+id+", pwd"+pwd);
	}
	public static void main(String[] args) {
		
		//값만 전송 => Call by Value => 기본형 값만 바뀜
		int x = 10;
		int y = 20;
		swap(x, y);
		System.out.println("종료 : "+"x="+x+", y"+y); //안바뀜
		
		// Call By Reference
		int[] arr = {10, 20};
		System.out.println("arr : "+ Arrays.toString(arr));
		swap2(arr);
		System.out.println("교환후 : arr2[0] : "+arr[0]+", arr2[1] : "+arr[1]); //바뀜***
		//배열, 클래스 => 메소드 자체에서 변경이 가능
		
		//String
		String id = "admin";
		String pwd = "1234";
		swap3(id,pwd);
		System.out.println("종료 후 id: "+id+", pwd"+pwd); //안바뀜
		

	}

}
