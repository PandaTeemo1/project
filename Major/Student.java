package Major;

import java.util.ArrayList;

public class Student {
	private int no;
	private String name;
	private String depart;
	private String gread;
	private String id;
	private String pwd;
	private ArrayList<Course> course;
	
	public Student() {}

	public Student(int no, String name, String depart, String gread, String id, String pwd) {
		super();
		this.no = no;
		this.name = name;
		this.depart = depart;
		this.gread = gread;
		this.id = id;
		this.pwd = pwd;
	}

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

	public String getGread() {
		return gread;
	}

	public void setGread(String gread) {
		this.gread = gread;
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

	public ArrayList<Course> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}
	
	
}
