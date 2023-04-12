
class Movie {
	int no;
	String image;
	String title;
	String subtitle;
	String regDate;
	String genre;
	String contry;
	String vLevel;
	String running;
	double rating;
	int box;  //수시로 변경되는 데이터는 int로만 가능
	String intro;
}
class News {
	int no;
	String image;
	String title;
	String content;
	String date;
	String compony;
}
class Restaurant {
	int no;
	String image;
	String title;
	String subtitle;
}
class room {
	int no;
	String title;
	double rating;
	String addr1, addr2;
	int tel;
	String kind;
	String price;
	String parking;
	String stime, etime;
	String menu;
}
class cook {
	int no;
	String image;
	String title;
	String profile;
	String profileName;
	int rating;
	int viewCnt;
}
class 노래 {
	int no;
	int rank;
	int state;
	String image;
	String title;
	String singer;
	String album;
	int like;
}
class eat {
	int no; 
	int sale; //25	"↓" + sale+"%"
	String image;
	String title;
	int price; //장바구니안에 넣으면 총합금액이 안나오기에 String를 넣으면 안되고, int가 들어가야됨
}
class Musical {
	int no;
	String image;
	String title;
	boolean state; //상영중이냐 아니냐는 boolean사용
	String genre;
	String date;
	String loc;
	String actor;
	String age;
	String running;
	
}
public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
