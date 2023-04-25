package com.sist.lib;

class Sawon2 {
	private int sabun;
	private String name;
	//초기화
	public Sawon2 (int sabun, String name) {  //여기에 있는 값을 변경하기 위해 Getter/Setter를 이용해서 바뀔수 있음
		this.sabun = sabun;
		this.name = name;
	}
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//오버라이딩
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Sawon2 s = (Sawon2)obj; 
		return name.equals(s.name) && sabun == s.sabun;  //이거랑 라이브러리_Object_4여기에 나오는 return name == ((Student2)obj).name;이거랑 같음
	}
}

public class 라이브러리_Object_4_1_객체비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon2 s1 = new Sawon2(1, "홍길동");
		Sawon2 s2 = new Sawon2(2, "홍길동");
		//오버라이딩을 하지 않은 경우 => 주소 (==) 이거랑 같은 효과
		if (s1.equals(s2)) {
			System.out.println("같은 사원이다.");
		}
		else {
			System.out.println("다른 사원이다");
		}
	}

}
