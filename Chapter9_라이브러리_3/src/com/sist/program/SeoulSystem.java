package com.sist.program;
import java.io.FileReader;
/*
		제일 먼저 할것은 변수잡기
		
		VO(데이터모으기) => DAO(기능 모으기) => 전송 => 관련된 데이터는 무조건 묶어서 보낸다(VO)***
 */
import java.util.Scanner;
import java.util.StringTokenizer;
public class SeoulSystem {
	private static SeoulLocationVO[] datas = new SeoulLocationVO[273];
	//모든 사용자가 데이터를 공통으로 사용 static를 사용
	private int curpage; //내가 보고 있던 페이지로 가야되는데 지역변수면 페이지를 저장하는 변수가 다음 페이지로 넘길때 사라지고 1페이지에 머물기에 사라지면 안되는 변수로 전역변수로 선언해서 사라지는 걸 방지
	private int totalpage;
		//즉 프로그램 종료시까지 유지
	static { //static 블록
		//데이터를 읽어서 데이터를 메모리에 저장 => 초기화
		try {
			StringBuffer sb = new StringBuffer();
			int i = 0;
			FileReader fr = new FileReader("C:\\javaDev\\seoul_location.txt");
			while ((i=fr.read())!= -1) {
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			//System.out.println(sb.toString());
			String[] locations = sb.toString().split("\n");
			//s = "1|양화진외국인선교사묘원|양화진외국인선교사묘원은 서울 마포구 합정동에 위치한 외국인 선교사들의 공동묘지이다.|04084 서울 마포구 양화진길 46 (합정동, 양화진홍보관)";
			int k = 0;
			for (String s:locations) {
				//System.out.println(s);
				StringTokenizer st = new StringTokenizer(s,"|"); //  | 별로 자름
				datas[k] = new SeoulLocationVO();
				datas[k].setNo(Integer.parseInt(st.nextToken()));  //정수형으로 되어 있는 것을 문자열로 변경
				datas[k].setName(st.nextToken());
				datas[k].setContent(st.nextToken());
				datas[k].setAddress(st.nextToken());
				k++;
			}
 		}catch (Exception ex) {}
	}
	// 페이지별로 데이터 출력
	public SeoulLocationVO[] seoulList (int page) {
		SeoulLocationVO[] data = new SeoulLocationVO[10];
		int j = 0; //10개씩 나눠주는 변수
		int start = (page*10) - 10;  //시작점 (for)
		/*
			1page => 0~9
			2page => 10 ~ 19
			3page => 20 ~ 29
		 */
		int k = 0;
		for (int i = 0; i< datas.length;i++) {
			if (j < 10 && i >= start) { // i가 3이면 앞에 페이지를 버리고 20~29를 담기 시작함
				data[k]=datas[i];
				k++;
				j++;
			}
		}
		return data;
	}
	public int seoulTotalPage() {
		return (int)(Math.ceil(datas.length/10.0));
		//					   ---------------- 27.3 => 28페이지가 나올것임
	}
	// 메뉴
	public int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("============메뉴============");
		System.out.println("1. 목록 출력(페이지별)");
		System.out.println("2. 상세보기");
		System.out.println("3. 명소검색");
		System.out.println("4. 주소검색");
		System.out.println("9. 종료");
		System.out.println("===========================");
		
		System.out.print("메뉴 선택 : ");
		return scan.nextInt();
	}
	// 검색 => 이름별 검색
	public SeoulLocationVO[] nameFind(String fd) {
		int count = 0;
		for (SeoulLocationVO vo:datas) {
			if (vo.getName().contains(fd)) { //배열갯수를 잡는건데 fd에 포함되는게 이름에 있나물어보고 있으면 갯수만큼 count++;
				count++;
			}
		}
		//고정에서 가변형으로 바꾸는 것 (Collection)
		SeoulLocationVO[] seoul = new SeoulLocationVO[count];
		int i = 0;
		for (SeoulLocationVO vo:datas) {
			if (vo.getName().contains(fd)) {
				seoul[i] = vo;
				i++;
			}
		}
		return seoul;
	}
	
	// 주소 검색
	public SeoulLocationVO[] addressFind(String addr) {
		int count = 0;
		for (SeoulLocationVO vo:datas) {
			if (vo.getAddress().contains(addr)) { //배열갯수를 잡는건데 fd에 포함되는게 이름에 있나물어보고 있으면 갯수만큼 count++;
				count++;
			}
		}
		//고정에서 가변형으로 바꾸는 것 (Collection)
		SeoulLocationVO[] seoul = new SeoulLocationVO[count];
		int i = 0;
		for (SeoulLocationVO vo:datas) {
			if (vo.getAddress().contains(addr)) {
				seoul[i] = vo;
				i++;
			}
		}
		return seoul;
	}
	// 상세보기
	public void process() {
		System.out.println("★★★★★★★★★★★ SIST영화 ★★★★★★★★★★★★★");
		while(true) {
			int menu = menu(); //메소드명은 변수명으로 사용가능
			if (menu == 9) {
				System.out.println("프로그램 종료");
				break;
			}
			else if (menu == 3) {
				Scanner scan = new Scanner(System.in);
				System.out.print("검색어 입력 : ");
				String name = scan.next();
				SeoulLocationVO[] data =  nameFind(name);
				System.out.println(name+"검색은 총 "+data.length+"건입니다.");
				for (SeoulLocationVO vo : data) {
					System.out.println(vo.getNo()+ "."+vo.getName());
				}
			}
			else if (menu == 4) {
				Scanner scan = new Scanner(System.in);
				System.out.print("주소 입력 : ");
				String addr = scan.next();
				SeoulLocationVO[] data = addressFind(addr);
				System.out.println(addr+"검색은 총 "+data.length+"건입니다.");
				for (SeoulLocationVO vo : data) {
					System.out.println(vo.getNo()+ "."+vo.getAddress());
			}
		}
			else if (menu == 1) {
				Scanner scan = new Scanner(System.in);
				while (true) {
					System.out.print("페이지 입력 요청 (1~28) : ");
					curpage = scan.nextInt();
					if (curpage < 1 || curpage > 28) {
						System.out.println("없는 페이지입니다.");
						continue;
					}
					break;
				}
				
				totalpage = seoulTotalPage();
				System.out.println(curpage+"page / "+totalpage + "page");
				SeoulLocationVO[] data = seoulList(curpage);
				for (SeoulLocationVO vo : data) {
					if (vo != null) {
						System.out.println(vo.getNo()+"."+vo.getName());
					}
				}
			}
			else if (menu == 2) {
				Scanner scan = new Scanner(System.in);
				System.out.println("상세 볼 명소번호 입력(1~273) : ");
				int no = scan.nextInt();
				System.out.println("번호 : "+datas[no-1].getNo());
				System.out.println("명소 : "+datas[no-1].getName());
				System.out.println("주소 : "+datas[no-1].getAddress());
				System.out.println("소개 : "+datas[no-1].getContent());
			}
		
	}
/*	public static void main(String[] args) {
		SeoulSystem ss = new SeoulSystem();
		for (SeoulLocationVO vo : datas) {
			System.out.println(vo.getNo());
			System.out.println(vo.getName());
			System.out.println(vo.getContent());
			System.out.println(vo.getAddress());
		}
	}*/
	}
}
