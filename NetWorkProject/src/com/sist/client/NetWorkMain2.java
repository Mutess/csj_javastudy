package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.sist.common.ImageChange;
public class NetWorkMain2 extends JFrame implements ActionListener {
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JLabel logo;
	JButton b1, b2,b3, b4, b5, b6 , b7;
//	Login login = new Login();
	public NetWorkMain2() { //메모리 할당
		logo = new JLabel();
		Image img = ImageChange.getImage(new ImageIcon("C:\\java_datas\\lg1.png"), 200, 130);
		logo.setIcon(new ImageIcon(img));
		mp = new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		setLayout(null); //Layout을 직접 배치한다는 뜻
		logo.setBounds(10, 15, 200, 130);
		mp.setBounds(220, 50, 600, 50); // mp 여기다가 추가
		cp.setBounds(10, 150, 900, 730);
		tp.setBounds(980, 75, 200, 730);
		
		b1 = new JButton("홈");
		b2 = new JButton("장소");
		b3 = new JButton("엔터");
		b4 = new JButton("숙박");
		b5 = new JButton("검색");
		b6 = new JButton("뉴스");
		b7 = new JButton("채팅");
		mp.setLayout(new GridLayout(1,5,10,10));
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		mp.add(b6);
		mp.add(b7);
		
		//추가
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		setSize(1200, 800);
		setVisible(true);
		
		//종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//타이틀
		setTitle("서울을 여행하다.");
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		//로그인		
//		login.b1.addActionListener(this);  //처리 메소드는 Main이라서 this
//		login.b2.addActionListener(this);
		
		//채팅
		cp.cp.tf.addActionListener(this);
	}

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		} catch (Exception ex) {}
		new NetWorkMain2();
	}
	//버튼 처리
	/*
	    b1 = new JButton("홈");
		b2 = new JButton("장소");
		b3 = new JButton("엔터");
		b4 = new JButton("숙작");
		b5 = new JButton("검색");
		b6 = new JButton("뉴스");
		b7 = new JButton("채팅");
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			cp.card.show(cp, "home");
		}
		else if(e.getSource() == b2) {
			cp.card.show(cp, "location");		
		}
		else if(e.getSource() == b3) {
			cp.card.show(cp, "enter");
		}
		else if(e.getSource() == b4) {
			cp.card.show(cp, "acomm");
		}
		else if(e.getSource() == b5) {
			cp.card.show(cp, "find");
		}
		else if(e.getSource() == b6) {
			cp.card.show(cp, "news");
		}
		else if(e.getSource() == b7) {
			cp.card.show(cp, "chat");
		}
//		else if (e.getSource() == login.b1) {
//			login.setVisible(false); //로그인이 되면 
//			this.setVisible(true);   // NetWorkMain2();를 띄워라
//		}
//		else if (e.getSource() == login.b2) {
//			System.exit(0);
//		}
		else if (e.getSource() == cp.cp.tf) {
			cp.cp.initStyle();
			String msg = cp.cp.tf.getText();
			String color = cp.cp.box.getSelectedItem().toString();
			if (msg.length()<1) {
				return;
			}
			cp.cp.append(msg, color);
			
			cp.cp.tf.setText("");
		}


	}
}
