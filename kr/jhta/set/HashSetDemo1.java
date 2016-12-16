package kr.jhta.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {
	public static void main(String[] args) {
		//이름을 저장하는 HashSet 객체 생성하기
		Set<String> names = new HashSet<>();
		HashSet<String> name = new HashSet<>();
		
		Iterator<String> it = name.iterator();
		
		name.add("홍길동");
		name.add("정승환");
		name.add("김유신");
		name.add("강감찬");
		name.add("이순신");
		name.add("유관순");
		name.add("김두환");
		
		while(it.hasNext()){
			String name1 = it.next();
			System.out.println(name1);
			
		}
		int len = name.size();
		System.out.println("저장된 요소의 갯수 : "+len);
		
		for(String n : name){
			System.out.println(n);
		}
	}
}
