/*
 *  연산자, 제어문 => 형식, 용도 
 *  1) 형식
 *  		  1    2    4
 *  	for(초기값;조건식;증가식) {// 그래서 1-2(true이면)-3-4-2-3-4-2-3-4-2(false이면 종료) 이런식으로 수행
 *  			   | 3					|
 *  			반복수행 문장			(false이면 한번도 수행안함 (종료))
 *  	}
 *  				 true
 *  	초기값 => 조건식 ====> 수행문장 ===> 증가식 
 *  			  | false (종료)
 *  
 *  
 *  While문 == 파일읽기에 사용
 *  초기값 ==========1
 *  while (조건문)===2
 *  {
 *  	수행문장 ====3
 *  	증가식 =====4 -------- 조건식 2번으로 이동
 *  						-----------false이면 종료
 *  }
 *  
 *  필요에 의해 반복문 제어
 *  -----------------
 *  break / continue
 *  
 *  break => 반복 중단 (조건) 게임일땐 => esc
 *  -------- 반복문, switch
 *  
 *  continue => 반복문에서만 사용이 가능  (특정부분을 제외하는 경우에 주로 사용)
 *  			종료하는 것이 아닌 => 그 값으로 이동
 *  			for => 증가식으로 이동
 *  			while => 조건식으로 이동
 *  주의점) break, continue ==> 밑에는 소스 코딩을 할 수 없으며
 *  	   break, continue ==> 자신 소속의 for문블록만 제어가 가능하다.
 *  		for ()
 *  		{
 *  		if() 
 *  		{
 *  			//가능
 *  			continue;
 *  			system.out.println() => 오류
 *  		}
 *  
 *  		}
 *  		if()
 *  		----- 따로
 *  		if()
 *  		------ 따로
 *  		if()
 *  		else
 *  		-------는 else 위에 if문에 소속됨
 *  
 *  배열
 *  heap은 바로 삭제가 안되는 영역
 * 		int[] arr = new int[4] ==> stack에 메모리주소가 heap에 있는 메모리주소의 arr[i]의 값을 읽어옴
 * 
 * 		얕은 복사
 * 		int[] arr1 = arr;
 * 		
 * 		깊은 복사
 * 		int [] arr1 = arr.clone();
 * 
 * 		stack       heap
 * ----------------------------
 * int  arr		|	arr[0] 4byte , arr[1] 4byte, arr[2] 4byte, arr[4] 4byte,      데이터형이 int일때 각각의 인덱스에 4byte씩 저장됨
 *  
 */
public class 제어문정리_3 {

	public static void main(String[] args) {
		
	/*	int  i = 1;
		while (i < 10) {
			if (i % 2 == 0)  { //2일때 무한루프가 걸리는데
				i++;
				continue;
			}
			System.out.println(i);
			i++; // 여기서 증가시키면 무한루프가 안걸림
		} */
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(arr);  //메모리 주소가 나옴
		int[] arr1 = arr;
		System.out.println(arr1);  // 얕은 복사를 하면 같은 주소를 가짐
		arr1[0] = 10;
		System.out.println(arr[0]); // 이렇게 하면 arr[0]과 arr1[0]에 10이 들어감
		
		int [] arr2 = arr.clone();
		System.out.println(arr2);  // 이렇게 .clone을 사용시에 다른 메모리주소에 복사가 됨 ==> 이게 깊은 복사
		//주소의 의한 참조 ==> 메모리 주소를 이용해서 실제 데이터를 관리

	}

}
