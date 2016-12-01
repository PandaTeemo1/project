/*
//연락처 관리 프로그램
// 1.연락처를 여러개 등록할 수 있다.
// 2.등록된 연락처를 조회할 수 있다.
// 3.

//연락처 정보 (번호, 이름, 전화번호, 이메일)를 저장할 수 있는 객체의 설계도 만들기
//구현할 기능을 선정하기
// 등록기능, 조회기능
// 정보를 전달받아서 담는 기능이 있어야됨  배열에 Contact 객체를 저장하는 것 구현하기
조회기능
	배열에 저장된 모든 Contact 객체의 정보를 표시하는 것 구현하기

필요한 클래스
	Contact 클래스 = Contact 정보를 표현하는 클래스
	contactMgr 클래스 = Contact 정보를 저장,조회하는 기능이 구현된 클래스
	ContactApp 클래스 = Contact 진입점이 되는 클래스*/
public class Contact{
	private int no;
	private String name;
	private String number;
	private String email;

	public Contact(){
	
	}
	public int getNo(){
		return no;
	}
	public String getName(){
		return name;
	}
	public String getNumber(){
		return number;
	}
	public String getEmail(){
		return email;
	}
}