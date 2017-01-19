package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.ConnectionUtil;
import vo.UserVO;

public class UserDAO {
	public void addUser(UserVO user)throws SQLException{
		String sql = "insert into tb_user(user_id, user_pwd, user_name, user_phone, user_addr)"
					+ " values(?, ?, ?, ?, ?)";
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getId());
		pstmt.setString(2, user.getPwd());
		pstmt.setString(3, user.getName());
		pstmt.setString(4, user.getPhone());
		pstmt.setString(5, user.getAddr());
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
	}
	public UserVO getUserById(String id)throws SQLException{
		UserVO vo = null;
		String sql = "select user_id, user_pwd, user_name, user_phone, user_addr, user_point, user_regdate"
					+" from tb_user"
					+" where user_id = ?";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			vo = new UserVO();
			vo.setId(rs.getString("user_id"));
			vo.setPwd(rs.getString("user_pwd"));
			vo.setName(rs.getString("user_name"));
			vo.setPhone(rs.getString("user_phone"));
			vo.setAddr(rs.getString("user_addr"));
			vo.setPoint(rs.getInt("user_point"));
			vo.setRegdate(rs.getDate("user_regdate"));
			
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return vo;
	}
}
