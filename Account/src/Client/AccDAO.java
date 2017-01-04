package Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.ConnectionUtil;

public class AccDAO {
	public void insertReg(Acc vo) throws SQLException{
		String sql = "insert into TB_ATM(acc, id, pwd, name, email, phone, balance, date)"
				+ " values(ATM_SEQ.nextval, ?, ?, ?, ?, ?, 0, sysdate)";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPwd());
		pstmt.setString(3, vo.getName());
		pstmt.setString(4, vo.getEmail());
		pstmt.setString(5, vo.getPhone());
		pstmt.executeUpdate();
		pstmt.close();
		con.close();

	}
}
