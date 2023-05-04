package com.sist.manager;

import java.io.*;
import java.util.*;

public class MusicSystem {
	//데이터읽기
	private static List<GenieMusicVO> list = new ArrayList<GenieMusicVO>();
	static {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_datas\\genie_music.txt");
			ois = new ObjectInputStream(fis);
			list = (List<GenieMusicVO>)ois.readObject();
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception ex) {}
		}
	}
	
	public List<GenieMusicVO> musicCategoryData(int cno) {
		List<GenieMusicVO> mlist = new ArrayList<GenieMusicVO>();
		for (GenieMusicVO vo : list) {
			if (vo.getCno() == cno) {
				mlist.add(vo);
				//System.out.println(vo.getNo()+"."+vo.getTitle());
			}
		}
		return mlist;
	}
	public List<GenieMusicVO> musicFindData(String title) {
		List<GenieMusicVO> mlist = new ArrayList<GenieMusicVO>();
		for (GenieMusicVO vo : list) {
			if (vo.getTitle().contains(title)) {
				mlist.add(vo);
			}
		}
		return mlist;
	}
	public static void main(String[] args) {
		MusicSystem ms = new MusicSystem();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("가요(1), POP(2), OST(3), 트롯(4), JAZZ(5), CLASSIC(6) : ");
			String cno = in.readLine();
			ms.musicCategoryData(Integer.parseInt(cno));
		} catch (Exception e) {}
	}
}
