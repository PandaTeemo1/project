package Major;

import java.util.ArrayList;
import java.util.Scanner;

import kr.jhta.bookstore.Book;
import kr.jhta.bookstore.customer;

public class CourseMgr {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> stua = new ArrayList<>();
	ArrayList<Professor> proa = new ArrayList<>();
	ArrayList<Course> coua = new ArrayList<>();
	private Professor ploginid = null;
	private Student sloginid = null;
	
	private boolean pisExistId(String id){
		boolean isExist =false;
			for(Professor p : proa){
				if(p.getId().equals(id)){
					isExist = true;
					break;
				}
			}
			return isExist;
		}
	private boolean sisExistId(String id){
		boolean isExist =false;
			for(Student s : stua){
				if(s.getId().equals(id)){
					isExist = true;
					break;
				}
			}
			return isExist;
		}
	private boolean pisExistNO(int no){
		boolean isExist =false;
			for(Course c : coua){
				if(c.getNo()==no){
					isExist = true;
					break;
				}
			}
			return isExist;
		}

	public void join(){
		Student stu = new Student();
		Professor pro = new Professor();
		System.out.println("------------------------------------------");
		System.out.println("1.교수가입 2.학생가입 0.종료");
		System.out.println("------------------------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		int menu = Integer.parseInt(sc.nextLine());
		if(menu == 1){
			System.out.println("교수번호를 입력하세요 : ");
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.println("학과를 입력하세요 : ");
			String depart = sc.nextLine();
			System.out.println("직위를 입력하세요 : ");
			String posi = sc.nextLine();
			System.out.println("아이디를 입력하세요 : ");
			String id = sc.nextLine();
			if(pisExistId(id)){
				System.out.println("이미사용중인 아이디입니다");
				return;
			}
			System.out.println("비밀번호를 입력하세요 : ");
			String pwd = sc.nextLine();
			pro.setNo(no);
			pro.setName(name);
			pro.setDepart(depart);
			pro.setPosition(posi);
			pro.setId(id);
			pro.setPwd(pwd);
			proa.add(pro);
		}else if(menu == 2){
			System.out.println("학생번호를 입력하세요");
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.println("학과를 입력하세요 : ");
			String depart = sc.nextLine();
			System.out.println("학년를 입력하세요 : ");
			String grade = sc.nextLine();
			System.out.println("아이디를 입력하세요 : ");
			String id = sc.nextLine();
			if(sisExistId(id)){
				System.out.println("이미사용중인 아이디입니다");
				return;
			}
			System.out.println("비밀번호를 입력하세요 : ");
			String pwd = sc.nextLine();
			stu.setNo(no);
			stu.setName(name);
			stu.setDepart(depart);
			stu.setGread(grade);
			stu.setId(id);
			stu.setPwd(pwd);
			stua.add(stu);
		}
		
	}
	public void login(){
		System.out.println("--------------------------------------------");
		System.out.println("1.교수로그인 2.학생로그인");
		System.out.println("--------------------------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		int menu = Integer.parseInt(sc.nextLine());
		if(menu ==1){
			if(ploginid != null){
				System.out.println("이미 로그인된 사용자가 존재합니다");
				return;
			}
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호를 입력하세요 : ");
			String pwd = sc.nextLine();
			for(Professor p : proa){
				if(id.equals(p.getId()) && pwd.equals(p.getPwd())){
					ploginid = p;
						System.out.println("["+ploginid.getName()+"] 님이 로그인하였습니다.");
						pmenu();
					}
					
				}
			
			}else if(menu ==2){
				if(sloginid != null){
					System.out.println("이미 로그인된 사용자가 존재합니다");
					return;
				}
				System.out.print("아이디를 입력하세요 : ");
				String id = sc.nextLine();
				System.out.print("비밀번호를 입력하세요 : ");
				String pwd = sc.nextLine();
				for(Student s : stua){
					if(id.equals(s.getId()) && pwd.equals(s.getPwd())){
						sloginid = s;
							System.out.println("["+sloginid.getName()+"] 님이 로그인하였습니다.");
							smenu();
						}
						
					}
				}
			
		}
	public void logout(){
		System.out.println("--------------------------------------------");
		System.out.println("1.로그아웃 2.뒤로가기");
		System.out.println("--------------------------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		int menu = Integer.parseInt(sc.nextLine());
		if(menu ==1){
			ploginid = null;
			sloginid = null;
		}else if(menu ==2){
			return;
		}
	}
	public void smenu(){
		System.out.println("--------------------------------------------");
		System.out.println("1.전체 개설 과정 조회 2.수강신청 3.수강내역 0.뒤로가기");
		System.out.println("--------------------------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		int menu = Integer.parseInt(sc.nextLine());
		if(menu == 1){
			for(Course c : coua){
				c.info();
				smenu();
			}
		}else if(menu == 2){
			System.out.println("----------------------------------------");
			System.out.print("수강신청할 제목을 입력하세요 : ");
			String name = sc.nextLine();
			boolean result = true;
			for(Course c : coua){
				if(name.equals(c.getName())){
					result = false;
					c.getStudent().add(sloginid);
					System.out.println("수강신청이 완료되었습니다");
					smenu();
				}
			}
			if(result){
				System.out.println("수강 신청할 제목이 틀리거나 없습니다.");
				return;
			}
		}else if(menu == 3){
			for(Course c : coua){
				c.sinfo();
				smenu();
			}
		}else if(menu == 0){
			return;
		}
	}
	public void pmenu(){
		System.out.println("--------------------------------------------");
		System.out.println("1.과정등록 2.과정조회 3.과정학생조회 0.뒤로가기");
		System.out.println("--------------------------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		int menu = Integer.parseInt(sc.nextLine());
		if(menu == 1){
			Course c = new Course();
			System.out.print("과목의 번호를 입력하세요 : ");
			int no = Integer.parseInt(sc.nextLine());
			if(pisExistNO(no)){
				System.out.println("이미사용중인 번호입니다");
				return;
			}
			System.out.print("과목의 제목을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.print("과목의 정원을 입력하세요 : ");
			int limit = Integer.parseInt(sc.nextLine());
			c.setNo(no);
			c.setName(name);
			c.setLimit(limit);
			coua.add(c);
			pmenu();
		}else if(menu == 2){
			for(Course c : coua){
				c.info();
				
			}
			pmenu();
		}else if(menu == 3){
			for(Course c : coua){
				c.sinfo();
			}
			pmenu();
		}else if(menu == 0){
			return;
		}
	}
}
