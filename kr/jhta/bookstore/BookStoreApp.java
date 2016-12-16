package kr.jhta.bookstore;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		BookStore b = new BookStore();
		while(true){
			System.out.println("-----------------------------------------");
			System.out.println("1.로그인 2.가입 3.도서조회 4.대여 5.반납");
			System.out.println("6.대여내역조회 7.로그아웃 0.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 : ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1){
				b.login();
				
			}else if(menu == 2){
				b.register();
				
			}else if(menu == 3){
				b.displayBooks();
			}
			else if(menu == 4){
				b.Rentalbook();
			}
			else if(menu == 5){
				b.RentalOut();
			}
			else if(menu == 6){
				b.RentalList();
			}
			else if(menu == 7){
				b.logout();
			}
			else if(menu == 0){
				System.out.println("프로그램종료");
				break;
			}
		}
	}

}
