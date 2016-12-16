package member;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookStore {
	private String userId;
	private int point;
	private Date loginiD;
	
	public void login(){
		userId = "hong";
		point = 1000000;
		loginiD = new Date();
	}
	public void display(){
		BookStoreUtil util = new BookStoreUtil();
		//사용자 아이디, 포인트, 로그인 날짜 표시된다.
		System.out.println("아이디 : "+userId);
		System.out.println("로그인 시간 : "+util.getStringDate());
		System.out.println("적립 포인트 : "+util.getPointWithComma());
	} 
	
	public class BookStoreUtil{
		//로그인 날짜를 지정한 형식에 맞게 변환해서 반환하는 기능
		//Outer객체의 loginiD 필드에 자유롭게 접근할 수 있다.(private 접근제한이라도.)
		public String getStringDate(){
			if(loginiD==null){
				return "";
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			return sdf.format(loginiD);
		}
		//포인트값을 ,가 포함된 텍스트로 변환해서 반환하는 기능
		public String getPointWithComma(){
			DecimalFormat df = new DecimalFormat("#,###");
			return df.format(point);
		}
		
		
		/*
		 * 멤버 내부 클래스
		 * -Outer 객체가 생성된 이후에만 사용가능하다.
		 * -정적변수, 정적메소드를 가질 수 없다.
		 * -Outer 객체와 직접적으로 연관된 기능을 정의할 때 사용
		 * -Outer 객체의 모든 필드/메소드 사용가능
		 */
	}
}
