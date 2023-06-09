package com.sist.server;
/*
	1. 전화 / 우편 --- 분실 가능성이 있음 (속도가 빠름) => UDP
	   --- 신뢰성이 우수함 (속도가 느림) => TCP
	   
	   TCP + UDP의 장점
	   	신뢰성이 + 속도 => RTCP (화상) => ZOOM/웨일온...
	   	
	2. TCP를 제작 
	   1) PORT (전화선) => 연결선
	      0~65535까지 사용이 가능
	      --> 알려진 포트 (이미 사용중) 0~1023 사용중
	       	  80 : HTTP(웹)
	       	  23 : telnet
	       	  25 : SMTP
	       	  21 : FTP
	       	  8080 : Proxy
	       	  4000 : 머드서버
	       	  1521 : 오라클 서버
	       	  1433 : MS-SQL
	       	  3306 : MySQL
	       	  3000 : ReactJS
	       	  => 화상 => 30000번대
	       	  => 음성 => 20000번대 포트 사용
	  -------------------------------
	   2) IP (전화번호)  => 컴퓨터 구분
	  -------------------------------개통
	   	서버는 1대 / 클라이언트는 여러대
	  ------------------------------
	  IP : 
	  
	  3. 프로그램 작동
	  1) 서버 동작
	  	ServerSocket ss = new ServerSocket(port번호)
	  	=> bind() : 개통 (ip, port) => 유심 (개통)
	  	=> listen() : 클라이언트 연결시까지 대기
	  2) 클라이언트가 접속시 처리
	  	 => ss.accept()
	  	 	--------- 클라이언트가 서버 연결 호출 (연결시마다 호출)
	  	 	--------- 진동 / 음악...
	  	 	=> 클라이언트 정보 (ip, port)
	  	 					-------- Socket
	  3) 클라이언트마다 따로 통신이 가능하게 넘겨준다.
	  	 --------------------------------- Thread
	  	 Thread는 한개의 프로그램안에서 여러개의 프로그램이 동시에 작동하게 만든다.
	  	 		  ----------- 프로세스
	  	 Thread는 시분할 => CPU를 나눠서 작업을 하기 때문에 속도가 향상된다.\
	  	 실시간, 동시에 수행시에 사용되는 기술
	  	 ----------------------------
	  	 	=> 이걸 웹에서는 (Ajax , VueJS, ReactJS)
	  	 	=> Thread : 게임에서 많이 사용
	  	 쓰레드 작동하는 과정
	  	 --------------
	  	 생성				 start()			run()			 sleep()
	  	  new Thread() ==========> 대기상태 ========> Running ==========> 대기상태
	  	  											   |
	  	  									  		  Dead => interrupt()
	  	  => 서버는 1개 작동 => 통신하는 프로그램을 여러개 실행
	  	  	 				 ----------------------
	  	  	 				  	Thread
 */
import java.util.*;

import com.sist.common.Function;
import com.sist.server.Server.Client;

import java.net.*;
import java.io.*;

public class Server implements Runnable{
	//클라이언트 접속시에 정보(IP)
	private Vector<Client> waitVc = new Vector<Client>();
	/*
		Vector => ArrayList (데이터베이스 읽기)
		-----	  ---------
		동기화	  	비동기화
		  |			  
		네트워크
		
		add, get, size, 
	 */
	private ServerSocket ss;
	private final int PORT = 3456;
	//서버가동 ==> 한 컴퓨터엔에서 서버를 두새개 실행 x
	public Server() {
		try {
			ss = new ServerSocket(PORT); //ServerSocket(PORT, 인원수)
			//bind() => listen()
			// PORT => 50명 한정
			System.out.println("Server Start");
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	//접속시마다 처리
	public void run() {
		try {
			while(true) {
				Socket s = ss.accept();
				// 접속시마다 발신자 정보를 확인
				// => 전화번호 => Socket(ip)
				Client client = new Client(s);
				//waitVc.add(client);
				client.start();
				//클라이언트마다 따로 생성 => 각자 통신이 가능하게 만든다.
			}
		} catch (Exception ex) {}
	}
	public static void main(String[] args) {
		Server server = new Server();
		new Thread(server).start();
		//Server안에 있는 run을 호출한다.

	}
	//통신서버 ==> 저장된 클라이언트 정보 사용
	/*
		내부클래스 : 클래스끼리 공유하는 변수 / 메소드가 있는 경우
				  서버 프로그램 / 빅데이터 프로그램
		class Server
		{
			class Client
		}
	 */
	class Client extends Thread {
		String id,name,sex;
		// 클라이언트에서 보낸값 읽기
		BufferedReader in; //값을 읽어옴
		// 클라이언트로 결과값을 전송
		OutputStream out; //값을 보냄
		//클라이언트 연결 ==> 연결 기기(전화기)
		Socket s;
		
		//연결시도
		public Client(Socket s) {
			try {
				this.s = s;
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				// socket => 클라이언트의 메모리
				out = s.getOutputStream();
			} catch (Exception ex) {}
		}
		// 개인적으로 전송 (쪽지)
		public synchronized void messageTo(String msg) {
			// synchronized : 동기화
			// 디폴트는 비동기화
			// VueJS => async 메소드, sync 메소드명 ()
			try {
				out.write((msg+"\n").getBytes());
				//Byte단위 ==> Char단위로 변경
				// InputStreamReader()
			} catch (Exception e) {}
		}
		// 접속자 전체 전송 (단체방)
		public synchronized void messageAll(String msg) {
			try {
				for (Client c:waitVc) {
					c.messageTo(msg);
				}
			} catch (Exception e) {}
		}
		//요청에 대한 처리
		public void run() {
			while(true) {
			try {
				//요청값을 받는다.
				String msg = in.readLine();
				// 100|id|name|sex //젤 앞에 기능 번호
//				System.out.println("Client"+msg);
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());
				switch (protocol) {
				case Function.LOGIN : {
					id = st.nextToken();
					name = st.nextToken();
					sex = st.nextToken();
					//이미 접속중인사람에게 정보 전송
					messageAll (Function.LOGIN + "|" + id +"|"+name+"|"+sex);
					//waitVc에 첨부
					waitVc.add(this);
					//로그인으 종료//main을 보여줌
					messageTo(Function.MYLOG+"|"+name+"|"+id);
					//로그인하는 모든 사람들에게 전송
					for (Client user : waitVc) {
						messageTo(Function.LOGIN+"|"
											+user.id+"|"
											+user.name+"|"
											+user.sex);
					}
					
				}
				break;
				case Function.CHAT:{
					String strMsg = st.nextToken();
					String color = st.nextToken();
					messageAll(Function.CHAT+"|["+name+"]"+strMsg+"|"+color);
					}
				break;
				case Function.INFO:{
					String youId = st.nextToken();
					for (Client user:waitVc) {
						// 정보를 볼 대상을 찾는다.
						/*
							서버의 역할
							1) 저장 (클라이언트 정보)
								=> waitVc(Vector)
							2) 검색 : ID, Name
							3) 수정 : ID, PWD
							4) 클라이언트러 전송기능
							5) 요청에 처리 기능
						 */
						if (youId.equals(user.id)) {
							messageTo(Function.INFO+"|"
									+user.id+"|"
									+user.name+"|"
									+user.sex);
							break;
						}
					}
				}
				break;
				case Function.MSGSEND: {
					String youId = st.nextToken();
					String strMsg = st.nextToken();
					for (Client user : waitVc) {
						if (youId.equals(user.id)) {
							user.messageTo(Function.MSGSEND + "|" +id+"|"+strMsg);
							break;
							}
						}
					}
				break;
				case Function.EXIT: {
					String mid = st.nextToken();
					int i = 0;
					for(Client user:waitVc) {
						if (user.id.equals(mid)) {
							user.messageTo((Function.MYEXIT+"|"+id));
							waitVc.remove(i);
							in.close();
							out.close();
							//서버종료
							break;
							}
						i++;
						}
					//전체 메세지
					messageAll(Function.EXIT+"|"+mid);
					}
				break;
				}
			} catch (Exception e) {}
			}
		
		}
	}
}
