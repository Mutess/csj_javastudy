package com.sist.lib;
/*
		equals => Object에서는 객체비교
				  String에서는 문자열비교
 */
class Student2 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student2(String name) {
		this.name = name;
	}
	// if (s1.equals(s2))
	//((Student2)obj).name; 상당히 중요
	// Object => String name
	// .이 형변환보다 우선순위임
	// ex) (10+2)*5 = 60이거랑 같음
	// 재정의 하지 않는 경우 ==과 동일한 효과를 가짐
	// Object => equals는 사용빈도가 많지 않다. => 무조건 오버라이딩을 사용해야하기 때문에
	// => String... equals가 재정의 되어 있다. (String)
	@Override //재정의
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student2)
			return name == ((Student2)obj).name; //문자열 변환할때 사용 //형변환 //.주소접근자가 우선순위인데 Object안에 name이라는 변수가 없기때문에 괄호로 obj를 감싸서 obj를 Student2로 먼저 바꿔주는 과정 //그래서 형변환후 .(주소접근)을 작성
		// 					(Student2).obj
		//					name.equals(s.name)
		else
			return false;
	}
	public void print() {
		System.out.println("이름 : " + name);
	}
	/*
		String s = "Hello";
		s.length();
		
		"Hello".length();
	 */
	
}
public class 라이브러리_Object_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2("홍길동");
		Student2 s2 = new Student2("홍길동");
		/*
			s1 = com.sist.lib.Student2@5e91993f	
			s2 = com.sist.lib.Student2@1c4af82c
			
			객체에서 ==은 주소값을 비교함
		 */
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		if (s1 == s2) { //==을 주면 주소값을 비교하기 때문에 같지 않다고 나옴
			System.out.println("s1과 s2는 같다");
		}
		else {
			System.out.println("s1과 s2는 같지 않다");
		}
		//default는 주소값를 비교
		if (s1.equals(s2)) {
			System.out.println("s1과 s2는 같다");
		}
		else {
			System.out.println("s1과 s2는 같지 않다");
		}
		
		s1.print();
		//다른 방법
		new Student2("박문수").print(); //객체생성은 해도 되고 안해도 되는데 이건 안해도 될때 사용하는 방법임
		"Hello".length();
	}

}
