package Major;

import java.util.Scanner;

public class CourseApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseMgr coum = new CourseMgr();
		
		while(true){
			System.out.println("-----------------------------------------");
			System.out.println("1.가입 2.로그인 3.로그아웃 0.종료");
			System.out.println("-----------------------------------------");
			System.out.print("메뉴를 선택하세요 : ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1){
				coum.join();
			}else if(menu == 2){
				coum.login();
			}else if(menu == 3){
				coum.logout();
			}else if(menu == 0){
				break;
			}
		}
	}
}
