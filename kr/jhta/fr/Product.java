package kr.jhta.fr;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
	Scanner sc = new Scanner(System.in);
	Fruit fr = new Fruit();
	ArrayList<Fruit> fru = new ArrayList<>();
	Amount am = new Amount();
	ArrayList<Amount> amo = new ArrayList<Amount>();
	
	public Product(){
		am.setName("홍승환");
		am.setAcc("222-22-222");
		am.setPwd("1234");
		am.setBalance(1000000);
		amo.add(am);
		
		fru.add(new Fruit("사과","빨강",3000));
		fru.add(new Fruit("바나나","노랑",4000));
		fru.add(new Fruit("오렌지","주황",6000));
		fru.add(new Fruit("귤","주황",2000));
		fru.add(new Fruit("키위","초록",4500));
		fru.add(new Fruit("망고","노랑",6500));
		fru.add(new Fruit("딸기","빨강",1500));
		
	}
	public void frList(){
		System.out.println("---------------------------------");
		System.out.printf("%s %s %s\n","이름","색","가격");
		for(Fruit f : fru){
			System.out.printf("%s %s %s \n",f.getName(),f.getColor(),f.getPrice());
		}
	}
	public void frPublisher(){
		System.out.print("계좌번호를 입력하세요: ");
		String acc = sc.nextLine();
		System.out.println("비밀번호를 입력하세요: ");
		String pwd = sc.nextLine();
		
		for(Fruit f : fru){
			if(acc.equals(am.getAcc())&&pwd.equals(am.getPwd())){
				
			}
		}
	}
}
