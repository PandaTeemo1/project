package kr.jhta.bookstore;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Date;
/**
 * <p>도서 대여점의 주요 기능을 구현한 클래스
 * 
 * <p>도서 대여점의 회원가입, 로그인, 로그아웃, 대여, 반납, 조회 기능을 구현하였습니다.
 * @author 홍길동
 *
 */
public class BookStore {

	Rental ren = new Rental();
	ArrayList<Rental> renList = new ArrayList<>();
	ArrayList<customer> custom = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	private customer loginid = null;
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	/**
	 * <p> 도서대여점의 기본 생성자
	 * 
	 * <p> 객체 생성시 기본적으로 고객 한명의 정보와 책 10권을 가각 등록한다.
	 */
	public BookStore() {
		customer cus1 = new customer();
		cus1.setId("hwan");
		cus1.setPwd("1234");
		cus1.setName("홍승환");
		cus1.setTel("010-1234-1234");
		cus1.setRegdate(new Date());
		cus1.setPoint(0);
		custom.add(cus1);
		
		bookList.add(new Book(1,"설민석의 조선왕조 실록", 20000));
		bookList.add(new Book(2,"해리포터와 저주받은 아이", 15000));
		bookList.add(new Book(3,"그럴 때 있으시죠", 15000));
		bookList.add(new Book(4,"그릿 GRIT", 16000));
		bookList.add(new Book(5,"대통령의 글쏘기", 17000));
		bookList.add(new Book(6,"트랜드 코리아", 18000));
		bookList.add(new Book(7,"브루클린의 소녀", 13500));
		bookList.add(new Book(8,"강성태 66 공부법", 12500));
		bookList.add(new Book(9,"지대넓얕", 17000));
		bookList.add(new Book(10,"미움받을 용기", 20000));
	}
	private boolean isExistId(String id){
	boolean isExist =false;
		for(customer cus : custom){
			if(cus.getId().equals(id)){
				isExist = true;
				break;
			}
		}
		return isExist;
	}
	/**
	 * <p> 신규 고객을 등록합니다.
	 */
	public void register(){
		customer cus = new customer();
		Date d = new Date();
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		if(isExistId(id)){
			System.out.println("이미사용중인 아이디입니다");
			return;
		}
		cus.setId(id);
		System.out.print("비밀번호를 입력하세요 : ");
		String pwd = sc.nextLine();
		cus.setPwd(pwd);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		cus.setName(name);
		System.out.print("연락처를 입력하세요 : ");
		String tel = sc.nextLine();
		cus.setTel(tel);
		System.out.print("이메일을 입력하세요 : ");
		String email = sc.nextLine();
		cus.setEmail(email);
		cus.setRegdate(d);
		custom.add(cus);
	}
	/**
	 * <p>아이디와 비밀번호를 체크해서 로그인 여부를 결정합니다.
	 */
	public void login(){
		if(loginid != null){
			System.out.println("이미 로그인된 사용자가 존재합니다");
			return;
		}
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String pwd = sc.nextLine();

		for(customer cus : custom){
			if(id.equals(cus.getId())){
				if(id.equals(cus.getId()) && pwd.equals(cus.getPwd())){
					loginid = cus;
					System.out.println("["+loginid.getName()+"] 님이 로그인하였습니다.");
				}
			}
		}	
		
		if (loginid == null) {
			System.out.println("로그인된 아이디가 없습니다.");
		}
	}
	/**
	 * 로그인된 사용자의 정보를 제거합니다.
	 */
	public void logout(){
		if(loginid!=null){
			System.out.println("["+loginid.getName()+"]님이 로그아웃하셨습니다.");
		}		
	}
	/**
	 * 등록된 책의 내용을 화면에 출력합니다.
	 */
	public void displayBooks(){
		System.out.printf("%4s %-30s %-7s\n", "번호", "제목", "가격");
		System.out.println("------------------------------------------------------------");
		for(Book b1 : bookList){
			System.out.printf("%5d %-30s %-7d\n",b1.getNo(),b1.getTitle(),b1.getPrice());
		}
	}
	public void Rentalbook(){
		if(loginid!=null){
			System.out.print("빌리실 책번호를 선택하십시오. : ");
			int book = Integer.parseInt(sc.nextLine());
			for(Book b1 : bookList){
				if(b1.getNo()==book){
					ren.setBook(b1);
					
					System.out.println(b1.getTitle()+"책을 빌립니다.");
				}
			}
			ren.setCus(loginid);
			ren.setIsback(false);
			ren.setRentdate(new Date());
			renList.add(ren);
			
		}
		
	}
	
	public void RentalList(){
		if(loginid!=null){
			for(Rental r : renList){
				System.out.println(r.getCus().getName()+"님이 "+r.getBook().getTitle()+"책을 빌리셨습니다.");
			}
		}
		
	} 
	public void RentalOut(){
		if(loginid!=null){
			int ren = renList.size();
			for(Rental r : renList){
				System.out.println(r.getCus().getName()+"님이 "+r.getBook().getTitle()+"책을 빌리셨습니다.");
			}
			System.out.print("몇번책을 반납하시겠습니까?");
			int num = Integer.parseInt(sc.nextLine());
			for(int i=0; i<=ren; i++){
				if(i==num){
					renList.remove(i-1);
				}
			}
		}
	}
		
		
	/*public void info(){
		for(customer cus : custom){
			System.out.println("이름 : " + cus.getName());
			System.out.println("아이디 : " + cus.getId());
			System.out.println("비밀번호 : " + cus.getPwd());
			System.out.println("전화번호 : " + cus.getTel());
			System.out.println("이메일 : " + cus.getEmail());
			System.out.println("가입일 : " + cus.getRegdate());
			System.out.println("포인트 : " + cus.getPoint());
			System.out.println();
		}
	}*/
}


