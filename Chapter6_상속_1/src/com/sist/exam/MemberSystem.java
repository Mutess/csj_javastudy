package com.sist.exam;

import java.util.Scanner;
/*
 * 		네트워크 => 접속 (사용자 정보) => ip
 */
//회원과 관련된 정보
public class MemberSystem {
	static Member[] members = new Member[10]; //배열 공간만 잡아줘서 아직 null값만 들어가있음  //
	static int index = 0; //인덱스 번호가 0번부터 가입할때 마다 증가가 되게  //그래야 index 0번이 홍길동과 심청이가 둘다 들어가서 정보가 덮어쓰기 되지 않음
	//오라클 => 모든 데이터가 공유됨 (static)
	//가입
	public void join() {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 이름 성별 입력(hong 홍길동 남자) : ");
		members[index] = new Member(); //이렇게 변수명[배열번호]해주고 new를 해줘야 메모리 주소가 할당됨
		members[index].setId(scan.next());
		members[index].setName(scan.next());
		members[index].setSex(scan.next());
		index++;
	}
	public void print() {
		for (Member m:members) {
			if (m != null) { //배열은 항상 null이 아닐때 까지 출력해야 함
				System.out.println(m.getId()+" "+m.getName()+" "+m.getSex());
			}
		}
	}
}
