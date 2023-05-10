package com.sist.client;

import java.util.*;
import com.sist.manager.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* 
	윈도우나 네트워크보단
 	HTML로 똑같이 제작
 	IO처리하는 것을 집중적으로 공부 (데이터 수집...)
 	URL처리
 	화면 UI => 윈도우, HTML/CSS
 	이벤트 처리 => 자바 (인터페이스), 자바스크립트
 	ActionListener = onClick
 	자바스크립트에도 제네릭, 객체지향이 있음 ES6 ==> ES8
 	버튼, 메뉴, 텍스트 필드 => ActionListener
 	JLable, 테이블 => MouseListener
*/
public class DetailPanel extends JPanel implements ActionListener {
	JLabel imgLa;
	JLabel la1, la2, la3;
	JButton b2; //동영상 //우리는 없어도 됨
	JLabel titleLa, posterLa;
	JTextPane contentsTa;
	ControlPanel cp;
	public DetailPanel(ControlPanel cp) {
		this.cp=cp;
		// 초기화, 시작과 동시에 구현
		// 웹 => 데이터베이스 설정, 자동로그인
		imgLa = new JLabel();
		la1 = new JLabel("제목");
		la2 = new JLabel("내용");
//		la3 = new JLabel("");
		b2 = new JButton("목록");
		titleLa = new JLabel("");
		contentsTa=new JTextPane();
		contentsTa.setEnabled(false);
		JScrollPane js=new JScrollPane(contentsTa);
//		posterLa = new JLabel("");
//		albumLa = new JLabel("");
//		stateLa = new JLabel("");
//		crementLa = new JLabel("");
//		keyLa = new JLabel();
		
		
		// 배치
		setLayout(null);
		imgLa.setBounds(100, 15, 530, 350);
		
		la1.setBounds(100, 375, 60, 40);
		titleLa.setBounds(165, 375, 300, 40);
		
		la2.setBounds(100, 425, 60, 40);
		contentsTa.setBounds(165, 425, 500, 100);
		
//		la3.setBounds(100, 475, 60, 40);
//		posterLa.setBounds(165, 475, 300, 40);
		
		JPanel p = new JPanel();
//		p.add(b1);
		p.add(b2);
		p.setBounds(100, 625, 365, 40);
		
		//윈도우에 추가
		add(imgLa);
		add(la1); add(titleLa);
		add(la2); add(contentsTa);
//		add(la3); add(posterLa);
		add(p);
		
//		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	// "C:\Program Files\Google\Chrome\Application\chrome.exe"
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()== b2) {
			cp.card.show(cp, "home");
//			try {
//				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe " 
//											+ "http://youtube.com/embed/"
//											+ keyLa.getText());
//			}catch (Exception ex) {}
		}
//		else if (e.getSource() == b2) {
//			cp.card.show(cp, "home");
//		}
	}
}
