package Major;

public class Professor {
	private int no;
	private String name;
	private String depart;
	private String position;
	private String id;
	public Professor(int no, String name, String depart, String position, String id, String pwd) {
		super();
		this.no = no;
		this.name = name;
		this.depart = depart;
		this.position = position;
		this.id = id;
		this.pwd = pwd;
	}

	private String pwd;
	
	public Professor(){}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
