package com.sist.movie;
import java.util.*;
import java.io.*;
public class MovieSystem {
	private static ArrayList list = new ArrayList(); //여기서 제네릭<원하는 데이터형>을 쓰면 리턴형이 한번에 다 바뀜 //쓰지 않으면 다 Object임
	static {
		try {
			//파일 읽기
			FileReader fr = new FileReader("C:\\javaDev\\movie.txt");
			int i = 0; //한글자 읽기 => A => 65라고 읽어옴 (즉 , int(정수)로만 읽어옴  // 이유 : 다른 파일들도 같이 읽어올 수 있는데 그림이 byte타입으로 되어있어서)
			StringBuffer sb = new StringBuffer(); //데이터가 많고 한번에 저장해야 할때 Buffer를 사용
			while ((i=fr.read())!= -1) {  // -1(EOF)이 아닐때까지 읽어와야 함
				sb.append((char)i);  //읽어온것을 합치기 
			}
			fr.close();
//			System.out.println(sb.toString());  /데이터를 불렀으면 분리를 해서 각 변수에 저장하기
			String[] movies = sb.toString().split("\n");
			/*
				1 => st.nextToken()
				|쇼생크 탈출
				|드라마
				|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
				|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
				|2016 .02.24 재개봉, 1995 .01.28 개봉
				|15세 관람가
				|프랭크 다라본트
			 */
			for(String m:movies) {  //movie.txt안에 파일중 한줄을 읽어옴
				StringTokenizer st = new StringTokenizer(m, "|");
				MovieVO vo = new MovieVO();
				vo.setNo(Integer.parseInt(st.nextToken()));  //1번이 지금 문자열로 되어있어서 정수형으로 바꿔줘야함 그래서 Integer.parseInt()
				vo.setTitle(st.nextToken());
				vo.setGenre(st.nextToken());
				vo.setPoster(st.nextToken());
				vo.setActor(st.nextToken());
				vo.setRegdate(st.nextToken());
				vo.setGenre(st.nextToken());
				vo.setDirector(st.nextToken());
				list.add(vo);  //이렇게 list에 전체 데이터(vo)를 저장 
				
			}
		}catch (Exception ex){}
	}
	
/*	public static void main(String[] args) {
		MovieSystem ms = new MovieSystem();
	}*/
	/*
		menu
		목록 출력 (페이지)
		상세보기
		영화검색
		
	 */
	//menu
	public int movieMenu() {
		System.out.println("========= 영화 메뉴=======");
		System.out.println("1. 목록 출력");
		System.out.println("2. 상세 보기");
		System.out.println("3. 영화 검색");
		System.out.println("9. 시스템 종료");
		System.out.println("========================");
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴선택 : ");
		return scan.nextInt();
	}
	//목록 출력
	public ArrayList movieListData(int page) {
//		ArrayList movieList = new ArrayList();
		int totalpage = (int)(Math.ceil(list.size() / 10.0)); //ceil이 double이라 10.0을 준거임
		//size() = 1938  인데 1938/10.0 		193.8==> 194page
		int start = (page-1) * 10; //입력한 페이지로 이동하는 
		// 0, 10, 20...
		//범위 0~10, 10~20, 20~30 		subList(s, e-1)를 해주기 때문에 하나가 더 많아야 함
		int end = page * 10;
		if (page == totalpage) {
			//194page ==> 194*10 => 1940 - (10-8) ==> 1938개를 가지고 오게 설계
			end = list.size();
		}
		ArrayList movieList = new ArrayList(list.subList(start, end));
		return movieList;
	}
	//상세보기
	public MovieVO movieDetailData (int no){  //VO가 모든 데이터를 가지고 있어서 VO가 넘어가면 상세보기를 한다는 뜻   //영화는 1번부터고 인덱스는 0번부터 시작이라 -1을 해줘야함
		return (MovieVO)list.get(no-1);  //Object가 넘어가면 오류가 나서 형변환을 (MovieVO로 시킴)
	}
	//영화 검색
	
	//조립
	public void process() {
		while (true) {
			int menu = movieMenu();
			if (menu == 9) {
				System.out.println("프로그램 종료");
				break;
			}
			else if (menu == 1 ) {
				Scanner scan = new Scanner(System.in);
				System.out.print("페이지 입력 : ");
				int page = scan.nextInt();
				ArrayList mList = movieListData(page);
				for (int i = 0; i < mList.size();i++) {
					MovieVO vo = (MovieVO)mList.get(i);
					System.out.println(vo.getNo()+"."+vo.getTitle());
				}
			}
			else if (menu == 2) {
				Scanner scan = new Scanner(System.in);
				System.out.print("상세히 볼 영화번호 입력(1~1938) : ");
				int no = scan.nextInt();
				MovieVO vo = movieDetailData(no);
				System.out.println("순위 : "+vo.getNo());
				System.out.println("영화명 : "+vo.getTitle());
				System.out.println("감독 : "+vo.getDirector());
				System.out.println("출연 : "+vo.getActor());
				System.out.println("장르 : "+vo.getGenre());
				System.out.println("개봉일 : "+vo.getRegdate());
			}
		}
		
	}
}
