package vo;

import java.sql.Date;

public class CartVO {
	private int no;
	private ItemVO item;
	private Date regdate;
	private UserVO user;
	
	public CartVO() {}

	public CartVO(int no, ItemVO item, Date regdate, UserVO user) {
		super();
		this.no = no;
		this.item = item;
		this.regdate = regdate;
		this.user = user;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public ItemVO getItem() {
		return item;
	}

	public void setItem(ItemVO item) {
		this.item = item;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CartVO [no=" + no + ", item=" + item + ", regdate=" + regdate + ", user=" + user + "]";
	}
	
	

	
}
