package com.sist.manager;

import java.io.*;
import java.util.*;
public class _BoardIOMain {
	
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:\\java_datas\\board.txt");
			ObjectOutput oos = new ObjectOutputStream(fos);
			List<BoardVO> list = new ArrayList<BoardVO>();
			BoardVO vo = new BoardVO();
			vo.setNo(1);
			vo.setSubject("파일 입출력을 이용한 게시판 만들기");
			vo.setContent("파일 입출력을 이용한 게시판 만들기");
			vo.setName("홍길동");
			vo.setRegDate(new Date());
			vo.setPwd("1234");
			vo.setHit(0);
			list.add(vo);
			oos.writeObject(list);
			System.out.println("저장완료");
		} catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (Exception e) {}
		}
	}
}
