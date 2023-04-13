package com.sist.music;

import java.util.Arrays;
import java.util.Scanner;

public class MusicSystem {
	Music[] music = new Music[50];  //null만 들어가 있음,, 아직 주소가 없음
	// 1. method를 쓰지만 원래는 생성자를 사용하서 만듦
	void init() {
		/*
		 * 	인스턴스 : 객체생성 => 객체명, 변수, 배열..
		 *  static : 클래스명.배열명...
		 *  
		 *  int[] arr = new arr[5];
		 *  for (int i = 0; i < 10; i++) {
		 *  	arr[i] = (int)(math.random()*100) +1
		 *  }
		 */
		for (int i = 0; i<MusicData.title.length; i++) {
			//System.out.println("메모리 할당 전 : music["+i+"]="+ music[i]);
			music[i] = new Music(); //Music크기의 메모리 공간을 50개 생성
			//System.out.println("메모리 할당 후 : music["+i+"]="+ music[i]);
			music[i].title = MusicData.title[i];
			music[i].singer = MusicData.singer[i];
			music[i].album = MusicData.album[i];
			music[i].state = MusicData.state[i];
			music[i].modify = MusicData.modify[i];
		}
	}
	int menu() {
		System.out.println("=============Menu============");
		System.out.println("1. 목록보기");
		System.out.println("2. 검색");
		System.out.println("3. 상세보기");
		System.out.println("9. 프로그램 종료 ");
		System.out.println("=============================");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴선택 : ");
		return scan.nextInt();
	}
	Music[] musicListData() { //int[] musicListData()이거랑 같음 리턴형 //메소드
		return music;
	}
	Music musicDetailData(int no) {
		return music[no - 1];  //music배열이 50까지인데 index가 0부터 시작해서 0~49 
	}
	Music[] musicFindData(String title) {
		
		int count = 0;
		for (Music mm:music) {
			if (mm.title.contains(title)) { // 가변으로 데이터를 출력하기 위한 for문이고 가변형으로 바꿀때 먼저 갯수를 세게 만들고 count를 만들어서 세면됨
				count++;
			}
		}
		Music[] m = new Music[count];  //카운트(숫자가 나온 만큼) m변수가 저장
		int i = 0;
		for (Music mm:music) {  //화면에 출력하기 위한 for - each구문
			if (mm.title.contains(title)) { 
				m[i] = mm;  //count를 해서 센 숫자를 여기서 출력해주는 구문
				i++;
			}
		}
		return m;
	}
/*	public static void main(String[] args) {
		MusicSystem ms = new MusicSystem();
		ms.init();
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String title = scan.next();
		Music[] data = ms.musicFindData(title);
		int i = 1;
		for (Music m:data) {
			System.out.println(i+"."+m.title);
			i++;
		}
		
		System.out.println("==================================");
		System.out.print("상세보기(1 ~ 50) : ");
		int no = scan.nextInt();
		Music mm = ms.musicDetailData(no);
		System.out.println("곡명 : "+mm.title);
		System.out.println("가수명 : "+mm.singer);
		System.out.println("앨범명 : "+mm.album);
		System.out.println("상태 : "+mm.state);
		System.out.println("변등폭 : "+mm.modify);
		
*/
	}


