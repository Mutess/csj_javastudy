package com.sist.dao;

import java.util.*;
import java.sql.*;

public class EmpDAO {
	private Connection conn; //오라클 연결
	// ===============> Socket
	private PreparedStatement ps;
	// ==============> BufferedReader / OutPutStream
	//클라이언트 (Function.LOGIN+"|"+id+"|"...)
	//클라이언트 ===> sql문장을 전송 ===> 오라클부터 결과값을 받는다.
	//	          ----------- 테이블 (컬럼)

	//웹 개발자 => 자바/오라클
	// MyBatis(SQL) / Spring(자바) ===> 라이브러리
	// JDBC => java.sql = 게시판 (500줄)
	
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	// 드라이버 설정 ***
	public EmpDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버
		} catch (Exception ex) {}
	}
	// 연결
	public void getconnection() {
		try {
			conn = DriverManager.getConnection(URL, "hr","happy");
			// conn hr/happy
		} catch (SQLException ex) {}
	}
	// 연결해제
	public void disConnection() {
		try {
			if(ps != null) {
				ps.close(); //in.close(), out,close()
			}
			if(conn != null) {
				conn.close(); // s.close()
			}
			//오라클 ==> 서버
		} catch (Exception e) {}
	}
	// 기능 (SQL) => 송수신 ==> emp (사원 => 14명)
	public List<EmpVO> empListData() {
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			// 연결
			getconnection();
			// sql문장 생성
			String sql = "SELECT empno, ename, job, sal "
						+ "FROM emp "
						+ "WHERE ename LIKE '%A%'"; //contains
			// 전송
			ps = conn.prepareStatement(sql);
			// 결과값 받기
			ResultSet rs = ps.executeQuery(); // 실행된 결과를 메모리에 저장
			// list에 값을 채운다.
			while(rs.next()) { //처음부터 데이터가 없을때까지 읽어온다.
				EmpVO vo= new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setSal(rs.getInt(4));
				// getInt(), getDouble(), getString(), getDate()
				list.add(vo);
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			disConnection();
		}
		return list;
	}
	
}
