package com.sist.io;
/*		365page FilterStream
		= 변수, 연산자, 제어문
		= 객체지향 프로그램
		= 예외처리
		-----------------------문법 사항
		= 라이브러리 
			=> 자바 라이브러리
			=> 오라클 관련 (라이브러리)
			=> Web관련 라이브러리
			=> 스프링 관련 라이브러리
			=> 외부업체 라이브러리 (Jsoup, JSON, MyBatis, JPA)
		------------------------------Back-End
		Front-End
		--------- HTML/CSS/JavaScript(ES6)
								|
							 JQuery (AJAX)
							 ** VueJS -------------> Vue3, VueX
							 ** ReactJS -----------> Redux, Mobx
							 NodeJS
							 TypeScript
							 ----------
		------------------------ Web
		IO => InputStream / OutputStream
			  --------------------------
			  		|			  |
			  	   입력			 출력
			  	   => 입출력시 사용하는 라이브러리
			  	      =====
			  	      1) 메모리 입출력 => 표준 입출력
			  	      				   System.in , System.out
			  	      2) 파일 입출력 => 웹) 업로드 / 다운로드
			  	      	=> XML(SpringFramework, MyBatis), JSON(JavaScript연동), Properties(Spring-Boot)
			  	      	=> 외부에서 데이터 읽기 임시 저장용(txt)
			  	      	=> CSV => 오라클 데이터 백업
			  	      	   --- MySQL, MSSQL, MariaDB
			  	      	=> MySQL => 오라클 => CSV
			  	      	   --------------------- seoul.go.kr , data.go.kr (CSV파일)
			  	      3) 네트워크 입출력 : 웹서버 이미 구현 (TomCat)
			  	      ------> 저장 / 읽기 / 수정 / 삭제 ==> CRUD
			  	      
			  	      자바 => 입출력을 하기 위한 장치
			  	      		 ------------------- 스트림 (데이터가 이동하는 통로)
			  	      데이터 이동
			  	      ---------
			  	      	1byte 이동 , 				2byte 이동
			  	      	--------				---------
			  	      	~InputStream			 ~Reader
			  	      	~OutputStream			 ~Writer
			  	      	--------------			---------
			  	      	바이트 스트림				 문자 스트림
			  	      	=> Byte					=> char => 메소드 (read(), writer())
			  	      	=> read(), write()
			  	      	=> IO => CheckedException => 예외처리가 기본
			  	      		  => IO라이브러리 사용시 => 반드시 닫기 => close()
			  	      		  
			  	  => 지원하는 라이브러리
			  	  FileInputStream	FileOutputStream
			  	  FileReader		FileWriter
			  	  ----------------------------------
			  	  ObjectInputStream ObjectOutputStream => 객체 단위 저장
			  	  => 속도가 느리다 => 속도를 빠르게 => Buffer
			  	= Buffer => 한번에 데이터를 모아서 한번에 전송
			  				=> 속도가 빠르다.
			  				입출력 : BufferedReader, BufferedWriter
			  					   --------------  ---------------
			  					   String			String
			  				=> 이사 => 관련된 짐들을 묶어서 한번에 출발
			  
		
 */
import java.util.*;
import java.io.*;
public class 입출력_1_파일복사 {

	public static void main(String[] args) {
		FileInputStream fis =null;
		FileOutputStream fos = null;
		
		try {
			long start = System.currentTimeMillis();
			//파일복사 ===> 이걸 업로드라고 부름
			fis = new FileInputStream("C:\\유틸\\eclipse-jee-2023-03-R-win32-x86_64.zip");
			//BufferedInputStream
			BufferedInputStream bis = new BufferedInputStream(fis);
			fos  = new FileOutputStream("c:\\java_datas\\eclipse_1.zip");
			//BufferedOutputStream
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int i = 0;  //읽은 byte수
			byte[] buffer = new byte[1024]; //파일 복사
			while ((i=bis.read(buffer, 0 , 1024)) != -1) {
				bos.write(buffer, 0, i); //읽은 바이트만큼 전송
			}
			long end = System.currentTimeMillis();
			System.out.println("걸린 시간 : "+(end-start));
		} catch (Exception ex) {
			//오류확인
			ex.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			}catch (Exception ex) {}
		}
	}
}
