package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo4 {
	public static void display(ArrayList<String> list, String firstName){
		for(String s : list){
			if(firstName.equals(s.substring(0, firstName.length()))){
				System.out.println(s);
				
			}
		}
		
	}
	//정적메소드 정의하기
	//ArrayList와 "성씨"를 전달받아서 그 "성씨" 에 해당하는 이름을 ArrayList에 담아서 반환하는 메소드
	public static ArrayList<String> display2(ArrayList<String> list, String firstName){
		ArrayList<String> result = new ArrayList<>();
			for(String s : list){
				if(firstName.equals(s.substring(0,  firstName.length()))){
					result.add(s);
				
				}
			}
		return result;
	}
	
	public static void main(String[] args) {
		//정적메소드 정의하기
		//ArrayList의 "성씨"를 전달받아서 그 "성씨" 해당하는 이름을 출력하는 메소드
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
		
		display(names, "이상");
		display2(names, "");
		
	}
}
