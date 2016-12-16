package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		//방문자 이름을 저장하는 ArrayList를 생성하고
		//방문자 이름을 여러 개 입력하기
		//"김"씨 성을 가진 사람만 새로운 ArrayList에 저장하기.
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<String>();
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
			if("김".equals(s.substring(0,1 ))){	
				names2.add(s);
			}
			
		}
		
		
	}
}
