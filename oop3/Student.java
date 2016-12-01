import java.text.DecimalFormat;

public class Student{
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//Ŭ���� �����
	//Student
		//��ȣ, �̸�, ����, ����, ����
		//getter/setter �޼ҵ� ����
		//����, ����� ��ȯ�ϴ� getter �޼ҵ� ����
	//StudentApp
		//Student ��ä 3���� ���� �� �ִ� �迭 �����ϱ�
		//
	public Student(){
	
	}
	public int getNo(){
		return no;
	}
	public String getName(){
		return name;
	}
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMath(){
		return math;
	}
	public void setNo(int no){
		this.no = no;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public void setMath(int math){
		this.math = math;
	}
	public int getTotal(){
		return kor + eng + math;
	}
	public double getAvg(){
		return getTotal()/3.0;
	}
	public String getAverage() {
		DecimalFormat df = new DecimalFormat("##,00");
		return df.format(getAvg());
	}
}