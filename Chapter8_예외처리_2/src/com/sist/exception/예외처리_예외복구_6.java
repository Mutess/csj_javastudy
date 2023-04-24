package com.sist.exception;

/*
		예외발생시 메세지 확인 => 자바에서 지원
		
		getMessage() => 에러에 대한 메세지만 전송
			=> 에러에 대한 숙달
		printStackTrace() => 실행하는 과정에서 에러 발생 위치 확인
		----------------- **
		
		=> 오라클 연결
			---- 게시판 (500줄)
			여기서 null이라도 뜨면 500줄 다 확인해야함
			
			그래서 printStackTrace() 이거를 쓰면 에러뜬 줄을 확인 가능
 */
public class 예외처리_예외복구_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr = new int[100];
			arr[100] = 100; //이건 에러 (배열은 항상 index - 1을 해줘야 함)
		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.err.println(e.getMessage()); // 권장사항 err를 사용해 글씨를 붉게 만드는 것
		}
	}

}
