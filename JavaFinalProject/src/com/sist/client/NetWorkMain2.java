package com.sist.client;
import java.awt.GridLayout;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;
import com.sist.server.ClientMain;

// 네트워크 관련 import
import java.util.List;
import java.util.StringTokenizer;
import java.io.*;
import java.net.*;

/* 
		프로그램 => 2개
		1 로그인, 채팅문자여 입력 ... 일반 사용자
		2 서버에서 전송되는 데이터 출력
		
		웹에서 필요한 기술
		=> 데이터베이스 (오라클 => MySQL)
		   ------------------------- MyBatis / JPA
		=> 데이터베이스 제어 => 자바
		   자바
		   	클래스 개념 			/ 인터페이스 / 예외처리 / 라이브러리
		   	-------- 			  -------
		변수 / 메소드 / 생성자		요구사항 분석 (기능)
		
		   	java.lang
		   		Object / String / StringBuffer / Math / Wrapper
		   		
		   	java.util
		   		StringTokenizer / Date, Calendar
		   		Collection => ArrayList , HashMap , HashSet
		   		
		   	java.net
		   		URL, URLEnceder
		   		
		   	java.io
		   		웹 => 업로드 , 다운로드 (File)
		   		=> Buffered~
		   		FileInputStream / FileOutputStream
		   		FileReader / FileWriter	
		   		BufferedReader / File
		   		
		   	java.text
		   	 	SimpleDateFormat
		-------------------------------------------------------
		   2차 자바
		   	java.sql , javax.sql , javax.naming
		   	javax.servlet.*
		   	
		   	브라우저 ============== 자바 ============== 오라클
		   											----- 데이터를 저장
		   	윈도우  ============== 자바 ============== 파일
		   						 --- 데이터읽기 / 데이터전송
		   						 
		   	=> 1) 오라클 제어 
		   		CREATE / ALTER / DROP / TRUNCATE / RENAME = DDL
		   		---------------------------------  데이터 정의어
		   		SELECT / UPDATE / DELETE / INSERT => DML
		   		--------------------------------- 데이터 조작어
		   		GRANT / REVOKE
		   		--------------- DCL (admin)
		   		COMMIT / ROLLBACK 
		   		----------------- TCL (일괄처리)
		   		
		   		2) 기타 : VIEW / SEQUEUE / PS-SQL(FUNTCION, PROCEDUR, TRIGGER)
		   		3) 데이터베이스 모델링 (정규화, 제약조건)
		   	=> 브라우저에 데이터 출력 : HTML / CSS / JavaScript
		   	=> 자바스크립트 라이브러리 : JQuery / Ajax
		   						  -------------- 교재 (동영상)
		  ---------------------------------------------- 1차 프로젝트
		  Spring (Back-End) / VueJS (Front-End)
		  -------------------------------------- 2차 프로젝트 (조별)
		  Spring-Boot / My-SQL / ReactJS / JPA
		  -------------------------------------- 3차 프로젝트
		  AWS => 호스팅
		  -------------------------------------- 이력서 첨부 (입사)
 */
public class NetWorkMain2 extends JFrame implements ActionListener, Runnable, MouseListener {
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1, b2,b3, b4, b5, b6;
	JLabel logo;
	Login login = new Login();
	//페이지 지정
	int curpage = 1;
	int totalpage = 0;
	MusicSystem ms = new MusicSystem();
	//네트워크 관련 클래스
	// 서버연결 => 연결기기
	Socket s; //서버의 메모리 연결
	//서버에서 보내준 값을 받는다.
	BufferedReader in;
	//서버로 갓을 전송
	OutputStream out;
	//ID저장
	String MyId;
	//테이블 선택 인덱스 번호
	int selectRow = -1; //선택이 안됐을때
	//쪽지보내기
	SendMessage sm = new SendMessage();
	RecvMessage rm = new RecvMessage();
	public NetWorkMain2() { //메모리 할당
		logo = new JLabel();
		Image img = ImageChange.getImage(new ImageIcon("C:\\java_datas\\logo.png"), 200, 130);
		logo.setIcon(new ImageIcon(img));
		mp = new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		
		setLayout(null); //Layout을 직접 배치한다는 뜻
		logo.setBounds(10, 15, 200, 130);
		mp.setBounds(10, 150, 200, 300); // mp 여기다가 추가
		cp.setBounds(220, 15, 750, 780);
		tp.setBounds(980, 15, 250, 730);
	
		
		b1 = new JButton("홈");
		b2 = new JButton("음악검색");
		b3 = new JButton("채팅");
		b4 = new JButton("뉴스검색");
		b5 = new JButton("커뮤니티"); //CRUD
		b6 = new JButton("나가기");
		mp.setLayout(new GridLayout(6,1,10,10));
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		mp.add(b6);
		
		//추가
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		setSize(1200, 800);
//		setVisible(true);
		
		//종료
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		//타이틀
		setTitle("네트워크 뮤직 프로그램");
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		//로그인
		login.b1.addActionListener(this);  //처리 메소드는 Main이라서 this
		login.b2.addActionListener(this);
		//채팅
		cp.cp.tf.addActionListener(this);
		//homepage
		List<GenieMusicVO> list = ms.musicListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.CardPrint(list);
		totalpage=ms.musicTotalPage();
		//ActionListener는 여러번 입력시 ==> 동작을 여러번 함
		cp.hp.b1.addActionListener(this); //이전
		cp.hp.b2.addActionListener(this); //다음
		cp.hp.pageLa.setText(curpage+"page /" + totalpage +"pages");
		
		cp.cp.b1.addActionListener(this);
		cp.cp.b2.addActionListener(this);
		cp.cp.table.addMouseListener(this);
		
		//쪽지보내기
		sm.b1.addActionListener(this);
		sm.b2.addActionListener(this);
		rm.b1.addActionListener(this);
		rm.b2.addActionListener(this);
		
		//화면
		//musicDisplay();
	}

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		} catch (Exception ex) {}
		new NetWorkMain2();
	}
	
	public void musicDisplay() {
		List<GenieMusicVO> list = ms.musicListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.CardPrint(list);
		totalpage=ms.musicTotalPage();
		cp.hp.pageLa.setText(curpage+"page /" + totalpage +"pages");
		
	}
	
	//버튼 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			curpage =1;
			musicDisplay();
			cp.card.show(cp, "home");
		}
		else if(e.getSource() == b2) {
			cp.card.show(cp, "find");		
		}
		else if(e.getSource() == b3) {
			cp.card.show(cp, "chat");
		}
		else if(e.getSource() == b4) {
			cp.card.show(cp, "news");
		}
		else if(e.getSource() == b5) {
			cp.card.show(cp, "board");
		}
		else if (e.getSource() == login.b1) {
//			login.setVisible(false); //로그인이 되면 
//			this.setVisible(true);   // NetWorkMain2();를 띄워라
			//로그인 데이터 읽기
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
				s = new Socket("localhost", 3456);
//				s = new Socket("211.238.142.118", 3456);
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
//			cp.cp.initStyle();
			String msg = cp.cp.tf.getText();
			String color = cp.cp.box.getSelectedItem().toString();
			if (msg.length()<1)	return;
//			cp.cp.append(msg, color);
			//서버로 전송
			try {
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			} catch (Exception e2) {}
			cp.cp.tf.setText("");
		}
		else if(e.getSource() == cp.hp.b1) {
			if (curpage > 1) {
				curpage--;
				musicDisplay();
			}
		}
		else if (e.getSource() == cp.hp.b2) {
			if (curpage < totalpage) {
				curpage++;
				musicDisplay();
			}
		}
		else if (e.getSource()==cp.cp.b2) {
			//정보보기
			if (selectRow == -1) {
				JOptionPane.showMessageDialog(this, "정보을 볼 대상을 선택하세요");
				return;
			}
			//선택이 된 경우
			String youId = cp.cp.table.getValueAt(selectRow, 0).toString();
			try {
				//선택된 아이디의 정보를 보여달라 (서버의 요청)
				out.write((Function.INFO + "|" + youId+"\n").getBytes());
				// out.write => 서버에 요청 ==> ** 마지막에 \n을 반드시 포함
				// 처리 => 서버 => 결과값을 받아서 클라이언트에서 출력
			} catch (Exception ex) {}
		}
		else if (e.getSource()==cp.cp.b1) {
			//쪽지보내기
			sm.ta.setText("");
			String youId = cp.cp.table.getValueAt(selectRow, 0).toString();
			sm.tf.setText(youId);
			sm.setVisible(true);
		}
		//쪽지보내기 관련
		else if (e.getSource()==sm.b2) {
			sm.setVisible(false);
		}
		else if (e.getSource()== rm.b2) {
			rm.setVisible(false);
		}
		else if (e.getSource() == sm.b1) {
			String youId = sm.tf.getText();
			String msg = sm.ta.getText();
			if (msg.length()<1) {
				sm.ta.requestFocus();
				return;
			}
			try {
				out.write((Function.MSGSEND+"|"
						 + youId + "|"+msg + "\n").getBytes());
			} catch (Exception e2) {}
			//창을 감춤
			sm.setVisible(false);
		}
		else if (e.getSource() == rm.b1) {
			sm.tf.setText(rm.tf.getText());
			sm.ta.setText("");
			sm.setVisible(true);
			rm.setVisible(false);
		}
		else if(e.getSource()==b6) {
			try {
				out.write((Function.EXIT+"|"+MyId+"\n").getBytes());
			} catch (Exception e2) {}
		}
	}
	// 서버에서 결과값을 받아서 출력하는 위치 => 스레드 (자동화)
	// member.jsp?id=sss&pwd=134&name=dadsa
	// 100
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
					MyId = st.nextToken();
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
				case Function.INFO:{
					String data = "아이디 : "+st.nextToken()
								+ "이름 : "+st.nextToken()
								+ "성별 : "+st.nextToken();
					JOptionPane.showMessageDialog(this, data);
				}
				break;
				case Function.MSGSEND:{
					String id = st.nextToken();
					String strMsg = st.nextToken();
					rm.tf.setText(id);
					rm.ta.setText(strMsg);
					rm.setVisible(true);
				}
				break;
				case Function.MYEXIT:{
					dispose(); //윈도우 메모리 해제
					System.exit(0); //프로그램 종료
				}
				break;
				case Function.EXIT: {
					String mid = st.nextToken();
					for (int i = 0; i<cp.cp.model.getRowCount();i++) {
						String uid = cp.cp.table.getValueAt(i, 0).toString();
						if (mid.equals(uid)) {
							cp.cp.model.removeRow(i);
							break;
						}
					}
				}
				break;
			}		
		}
	} catch (Exception ex) {}
}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == cp.cp.table) {
//			if(e.getClickCount() == 2) { //더블클릭
			
				selectRow = cp.cp.table.getSelectedRow();
				String id = cp.cp.table.getValueAt(selectRow, 0).toString();
//				JOptionPane.showMessageDialog(this, "선택된 ID : "+id);
				if (id.equals(MyId)) {
					cp.cp.b1.setEnabled(false);
					cp.cp.b2.setEnabled(false);
				}
				else {
					cp.cp.b1.setEnabled(true);
					cp.cp.b2.setEnabled(true);
				}
			}
		}
//	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
