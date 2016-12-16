package kr.jhta.list;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		// 방문자 이름을 저장하는 ArrayList를 생성하고
		// 방문자 이름을 여러개 입력하기
		// 출력은 "김"씨 성을 가진 사람만 화면에 출력하기.
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("홍길동");
		names.add("김제동");
		names.add("김수로");
		names.add("이상혁");
		names.add("아아아");
		names.add("졸리다");
		names.add("월요일");
		names.add("화요일");
		names.add("수요일");
		names.add("김요일");
		
		for(String s : names){
			if("김".equals(s.substring(0, 1))){
				System.out.println(s);
			}
			
		}
		
		
		
		/*while(true){
			System.out.println("1.등록, 2.성 검색, 0.종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			if(menu == 1){
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				names.add(name);
				
			}
			if(menu == 2){
				i
				
			}
			
		}*/
	}

}
