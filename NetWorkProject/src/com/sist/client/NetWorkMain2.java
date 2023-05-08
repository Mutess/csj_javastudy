package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.TravelVO;
import com.sist.manager.TravelSystem;
import java.util.StringTokenizer;
import java.io.*;
import java.net.*;
public class NetWorkMain2 extends JFrame implements ActionListener, Runnable {
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JLabel logo;
	JButton b1, b2,b3, b4, b5, b6 , b7;
	Login login = new Login();
	//페이지 지정
	int curpage = 1;
	int totalpage = 0;
	TravelSystem ts = new TravelSystem();
	Socket s; //서버의 메모리 연결
	//서버에서 보내준 값을 받는다.
	BufferedReader in;
	//서버로 갓을 전송
	OutputStream out;
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
		cp.setBounds(10, 150, 900, 800);
		tp.setBounds(1000, 75, 200, 800);
		
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
		
		setSize(1400, 1050);
//		setVisible(true);
		
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
		login.b1.addActionListener(this);  //처리 메소드는 Main이라서 this
		login.b2.addActionListener(this);
		
		//채팅
		cp.cp.tf.addActionListener(this);
		
		//homepage
		List<TravelVO> list = ts.travelListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.CardPrint(list);
		totalpage=ts.travelTotalPage();
		cp.hp.b1.addActionListener(this); //이전
		cp.hp.b2.addActionListener(this); //다음
		cp.hp.pageLa.setText(curpage+"page /" + totalpage +"pages");
		//화면
		//travelDisplay();
		
		
	}

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		} catch (Exception ex) {}
		new NetWorkMain2();
	}
	public void travelDisplay() {
		List<TravelVO> list = ts.travelListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.CardPrint(list);
		totalpage=ts.travelTotalPage();
		cp.hp.pageLa.setText(curpage+"page /" + totalpage +"pages");
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
			curpage =1;
			travelDisplay();
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
		else if (e.getSource() == login.b1) {
//			login.setVisible(false); //로그인이 되면 
//			this.setVisible(true);   // NetWorkMain2();를 띄워라
			String id = login.tf1.getText(); //입력한 id가져옴
			if (id.length()<1) {
				JOptionPane.showMessageDialog(this, "ID를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String name = login.tf2.getText(); //입력한 id가져옴
			if (name.length()<1) {
				JOptionPane.showMessageDialog(this, "이름를 입력하세요");
				login.tf2.requestFocus();
				return;
		}
			String sex = "남자";
			if (login.rb1.isSelected()) {
				sex = "남자";
			}
			else {
				sex = "여자";
			}
			
			try {
				//서버연결
				s = new Socket("211.238.142.118", 3456);
				//서버 컴퓨터
				// 211.238.142.()
				//읽는 위치 / 쓰는 위치
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				// s는 서버 메모리 => 서버메모리부터 값을 읽어온다.
				out = s.getOutputStream();
				//서버에 로그인을 요청 
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex) {}
			//서버로 부터 전송된 값을 받아 온다.
			new Thread(this).start(); //run호출
		}
		else if (e.getSource() == login.b2) {
			System.exit(0);
		}
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
		else if(e.getSource() == cp.hp.b1) {
			if (curpage > 1) {
				curpage--;
				travelDisplay();
			}
		}
		else if (e.getSource() == cp.hp.b2) {
			if (curpage < totalpage) {
				curpage++;
				travelDisplay();
			}
		}
	}

	@Override
	public void run() {
		try {
		while (true) {
			String msg = in.readLine(); //서버에서 보낸 값
			StringTokenizer st = new StringTokenizer(msg, "|");
			int protocol = Integer.parseInt(st.nextToken());
			//100|id|name|sex
			switch(protocol) {
			//서버에서 로그인이 온 경우
			//login 정보를 출력
			case Function.LOGIN:{
				String[] data = {st.nextToken(), //ID
								 st.nextToken(), //name
								 st.nextToken()
								 }; //sex
				cp.cp.model.addRow(data);
			}
			// C/S => 모든 명령이 서버로부터 받아서 처리
			// MYLOG => 로그인 종료하고 메인창을 보여준다
			break;
			case Function.MYLOG:{
				setTitle(st.nextToken());
				login.setVisible(false);
				setVisible(true);
			}
			break;
			case Function.CHAT : {
				cp.cp.initStyle();
				cp.cp.append(st.nextToken(), st.nextToken());
							// 채팅 문자열		 색상
			}
			break;
			}		
		}
	} catch (Exception ex) {}
	}
}
