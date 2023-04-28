package com.sist.gn;
/*
		제네릭
		=> 데이터형을 통일화
		=> 라이브러리의 데이터형을 변경할 경우에 사용
		   -------- 매개변수 / 리턴형 (Object)
		   			=> 프로그램 개발시마다 형변환을 해야함
		   			=> 프로그램에 필요한 데이터형으로 변경
		   ** 데이터를 저장할때는 한가지의 데이터형만 저장해서 사용
		      프로그램 => 데이터를 통일한다.
		=> 사용방법 => <변경할 클래스명>
		List<클래스명> => Object => 클래스명으로 변경
		List<String>
		List<MovieVO>
		
		=> T, E, K, V
		  -----------
		  T => Type (클래스형)
		  E => Element
		  K => Key
		  V => Value
		  Map<K,V>
		  Map<String, String>
		  List<E>
		  List<Integer>
		  	  --------- 기본형은 사용이 불가능 , 클래스형만 사용
		  	  			----- 클래스형으로 제작 => Wrapper
 */
import java.util.*;
//Generic는 모든 데이터형을 통일화함
class Box<T> {  
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
class A{
	
}
public class 라이브러리_Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box<String> box = new Box<String>();  //Box<여기>안에 데이터형을 주지 않으면 알아서 Object형으로 바뀜//Object형
		
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("딸기");
		for (Object obj:list) {
			String f = (String)obj;
			System.out.println(obj);
		} //다른 데이터형을 못쓰게 만들어주는 것
//		list.add(1);
//		for (Object obj:list) {
//			String f = (String)obj;
//			System.out.println(obj);
//		}
		for (String f:list) {
			System.out.println(f);
		} //가능함
		
		List<A> list2 = new ArrayList<A>();
		list2.add(null); //class A타입으로 변경
		
	}

}
