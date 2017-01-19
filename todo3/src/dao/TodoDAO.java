package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.ConnectionUtil;
import vo.TodoVO;

public class TodoDAO {
	public ArrayList<TodoVO> getTodoListForPaging(int begin,int end,String user_id) throws Exception{
		ArrayList<TodoVO> list = new ArrayList<>();
		String sql = "select no,category,title,description,day,location,completed,user_id"
				+ " from(select row_number() over(order by no desc) rn,"
				+ " no,category,title,description,day,location,completed,user_id"
				+ " from tb_todo"
				+ " where user_id=?)"
				+ " where rn>=? and rn<=?";
		Connection con =ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user_id);
		pstmt.setInt(2, begin);
		pstmt.setInt(3, end);
		ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				TodoVO todo = new TodoVO();
				todo.setNo(rs.getInt("no"));
				todo.setCategory(rs.getString("category"));
				todo.setTitle(rs.getString("title"));
				todo.setDescription(rs.getString("description"));
				todo.setDay(rs.getString("day"));
				todo.setLocation(rs.getString("location"));
				todo.setCompleted(rs.getString("completed"));
				todo.setUserId(rs.getString("user_id"));
				list.add(todo);
			}
			return list;
				
	}
	
	public int getTotalRows(String userId) throws SQLException{
		String sql = "select count(*) cnt from tb_todo where user_id=?";
		
		int totalRows = 0;
		
		Connection con =ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			totalRows = rs.getInt("cnt");
		}
		rs.close();
		pstmt.close();
		con.close();
		return totalRows;
		
	}

	public void InsertDaily(TodoVO todo) throws SQLException{
		
		String sql="insert into tb_todo(no,category,title,description,location,day,user_id,completed)"
				+ " values(comm_seq.nextval,?,?,?,?,?,?,'No')";
		Connection con=ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, todo.getCategory() );
		pstmt.setString(2, todo.getTitle());
		pstmt.setString(3, todo.getDescription());
		pstmt.setString(4, todo.getLocation());
		pstmt.setString(5, todo.getDay());
		pstmt.setString(6, todo.getUserId());
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
	}
	
	public ArrayList<TodoVO> DailyList(String userid) throws SQLException{
		
		ArrayList<TodoVO> todo = new ArrayList<>();
		String sql ="select no,category,title,description,location,day,completed,user_id from tb_todo where user_id=? order by no desc";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, userid);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			TodoVO vo = new TodoVO();
			vo.setNo(rs.getInt("no"));
			vo.setCategory(rs.getString("category"));
			vo.setTitle(rs.getString("title"));
			vo.setDescription(rs.getString("description"));
			vo.setLocation(rs.getString("location"));
			vo.setDay(rs.getString("day"));
			vo.setCompleted(rs.getString("completed"));
			vo.setUserId(rs.getString("user_id"));
			todo.add(vo);
		}
		rs.close();
		pstmt.close();
		con.close();
		return todo;
	}
	public void DelList(int no) throws SQLException{
		String sql = "delete from tb_todo where no=?";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, no);
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();

		
	}
	public TodoVO getListByNo(int no) throws SQLException{
		TodoVO vo =null;
		String sql = "select no,category,title,description,location,day,completed,user_id from tb_todo where no=?";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()){
			vo =new TodoVO();
			vo.setUserId(rs.getString("user_id"));
			vo.setNo(rs.getInt("no"));
			vo.setCategory(rs.getString("category"));
			vo.setTitle(rs.getString("title"));
			vo.setDescription(rs.getString("description"));
			vo.setLocation(rs.getString("location"));
			vo.setDay(rs.getString("day"));
			vo.setCompleted(rs.getString("completed"));
			
		}
		rs.close();
		pstmt.close();
		con.close();
		return vo;
	}
	public void CompleteDailyByNo(int no) throws SQLException{
		String sql = "update  tb_todo set completed='Yes' where no=?";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, no);
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		
		
	}
}
