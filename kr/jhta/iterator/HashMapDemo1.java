package kr.jhta.iterator;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap();
		
		map.put("name", "홍길동");
		map.put("phone", "010-1234-5678");
		map.put("email", "hong@naver.com");
		map.put("addr", "서울특별시 종로구 봉익동");

		String value1 = map.get("name");
		System.out.println(value1);
		
		String value2 = map.get("email");
		System.out.println(value2);
		
		//컴파일시 오류발생 하지않고 런타임시 오류발생.
		//코드 어시스던트를 받을수 없다.
	}
}
