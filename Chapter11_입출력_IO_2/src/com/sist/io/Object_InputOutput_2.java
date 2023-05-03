package com.sist.io;

import java.util.*;
import java.io.*;
public class Object_InputOutput_2 {

	public static void main(String[] args) throws Exception {
		FileInputStream out = new FileInputStream("C:\\java_datas\\sawon.txt");
		ObjectInputStream ois = new ObjectInputStream(out);
		// 객체단위로 값을 읽어올 때 사용 readObject()
		List<Sawon> list = (List<Sawon>)ois.readObject();
		for (Sawon s:list) {
			System.out.println(s.getSabun()+" "
							  +s.getName()+" "
							  +s.getDept()+" "
							  +s.getJob()+" "
							  +s.getPay());
		}
	}
}
