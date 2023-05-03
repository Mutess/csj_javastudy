package com.sist.io;
/*
		한글 깨짐 방지 => UTF-8 => AWS(리눅스)
 */
import java.io.*;
import java.util.*;
/* 	Properties => Spring / Spring-Boot => 파서기
   	MyBatis
   	.properties
   	형식 => Map
   	키=값 ==> 데이터베이스 정보 저장 => 사용자 계정 / 비밀번호
*/ 
public class 입출력_6_Properties {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_IO_1\\src\\com\\sist\\io\\db.properties"));
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		//시스템 정보
		Properties prop1 = System.getProperties();
		System.out.println(prop1.getProperty("java.version"));
		System.out.println(prop1.getProperty("user.language"));
		
		//setProperty(String key, String value);
		Properties prop2 = new Properties();
		prop1.setProperty("name", "홍길동");
		prop1.setProperty("sex", "남자");
		prop1.setProperty("age", "25");
		prop1.store(new FileOutputStream("info.properties"), "회원정보");
//		System.out.println(prop2.getProperty("name"));
//		System.out.println(prop2.getProperty("sex"));
//		System.out.println(prop2.getProperty("age"));
		
		Properties prop3 = new Properties();
		prop3.load(new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_IO_1\\info.properties"));
		String name = prop3.getProperty("name");
		String sex = prop3.getProperty("sex");
		String age = prop3.getProperty("age");
		System.out.println(name);
		System.out.println(sex);
		System.out.println(age);
		/*
				키가 중복되면 안됨 (Map)
				화면 전환 시킬때 사용 Board.list = http://localhost~
				properties => xml => JSON
				------------------ Spring / MyBatis / MAVEN
		 */
		
	}
}
