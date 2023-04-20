package com.sist.seoul;

import java.util.*;

public class Container {
	private String[] clsArr = {
		"com.sist.seoul.SeoulLocation",
		"com.sist.seoul.SeoulNature",
		"com.sist.seoul.SeoulShopping",
		"com.sist.seoul.SeoulHotel",
		"com.sist.seoul.SeoulGuestHouse"
	};
	private String[] Key = {
			"loc", "nat", "shop", "hotel", "guest"
	};
	private Map clsMap = new HashMap();
	//Map => Key, value ==> interface
	public Container() {
		try {
			for (int i = 0; i<Key.length;i++) {
				Class clsName = Class.forName(clsArr[i]);
				Object obj = clsName.getDeclaredConstructor().newInstance();
				System.out.println(obj);
				clsMap.put(Key[i], obj);
			}
		}catch (Exception ex) {}
	}
	public Object getBean (String Key) {
		return Key;
		
	}
	public static void main(String[] args) {
		Container ct = new Container();
	}
}
