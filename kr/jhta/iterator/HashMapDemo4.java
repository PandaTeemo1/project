package kr.jhta.iterator;

import java.util.HashMap;
import java.util.Date;

public class HashMapDemo4 {
	public static void main(String[] args) {
		/*
		 	서로 다른 타입의 값을 담는 Map 객체 만들기
		 	값의 타입이 String, Integer, Double, Date, 혹은 기타 객체
		 */
		HashMap<String, Object> adsf = new HashMap<>();
		adsf.put("name","홍길동");		//<String, String>
		adsf.put("age", 30);			//<String, Integer>
		adsf.put("weight", 68.9);		//<String, Double>
		adsf.put("birth", new Date());	//<String, Date>
		
		String value1 = (String) adsf.get("name");
		Integer value2 = (Integer) adsf.get("age");
		int value3 = (Integer) adsf.get("age");				//auto-unboxing
		double value6 = (Double) adsf.get("weight");		//auto-unboxing
		Double value4 = (Double) adsf.get("weight");
		Date value5 = (Date) adsf.get("birth");
		//key에 해당하는 값을 꺼낼때 적합하지않는 데이터명을 저장해도
		//컴파일 과정에서 에러가 표시되지 않는다.
		//String value7 = (String) adsf.get("birth");	ClassCastExcption 발생
	}
}
