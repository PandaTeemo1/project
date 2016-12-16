package kr.jhta.fr;

import java.util.Scanner;

public class ProductApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		
		while(true){
			System.out.println("---------------------------------");
			System.out.println("1.과일조회 2.과일구매 3.구매내역");
			System.out.println("---------------------------------");
			System.out.print("선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			if(num == 1){
				p.frList();
			}else if(num == 2){
				
			}else if(num == 3){
				
			}else if(num == 4){
				
			}else if(num == 0){
				
			}
		}
	}
}
