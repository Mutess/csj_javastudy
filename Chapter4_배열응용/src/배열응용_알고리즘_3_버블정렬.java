import java.util.Arrays;

/*
 *  버블 정렬 : 뒤에서부터 인접한 2개의 수끼리 데이터 비교
 *  => 선택정렬 : 앞에서부터 정렬
 *  => 버블정렬 : 뒤에서부터 정렬
 *   
 *  40  30  10  50  20  ==> ASC
 *  --  --
 *  30  40
 *  	--  --
 *      10  40
 *          --  --
 *          40  50
 *              --  --
 *              20  50(고정)   -- 1round    0  -  4
 *  -------------------
 *  30  10  40  20  (50)
 *  --  --
 *  10  30
 *      --  --
 *      30  40
 *          --  --
 *          20  40(고정)  --- 2round   1  -  3
 *  --------------------
 *  10  30  20  (40) (50)
 *  --  --  -- 
 *  10  30
 *      -- 
 *      20  30(고정)     ------3round 2  -  2
 *  --------------------
 *  10  20  (30)  (40)  (50)
 *  --  --
 *  10  20(고정)			--------4round  3  -  1
 *  
 *    i     j 
 *  ------------
 *    0		4
 *    1		3
 *    2 	2
 *    3		1
 *  --------------------  i + j ==> j = 4(length-1)-i
 *  
 */ 
public class 배열응용_알고리즘_3_버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
		System.out.println("=======정렬 전========");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\n=======정렬 후========");
		for (int i = 0;i<arr.length-1;i++) {  //버블은 뒤에 숫자가 앞의 숫자를 비교하여 정렬하기 때문에 i는 첫번째 숫자만 잡아주면 됌 나머지 4개는 j로 돌려야함
			for (int j = 0; j<arr.length-1-i;j++) {   //4바퀴부터 시작을 해야 하기 때믄에 length-1을 해주고 바퀴수가 줄어들기 때문에 i값으로 유동적으로 값을 빼줌
				//ex) length = 5 - 1 = 4인데 i값이 0이기때문에 4바퀴를 도는거임 //여기서 계속 돌아주면 4 - 1, 4 - 2, 4 - 3... 이런식으로 바퀴수가 줄어듬
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
