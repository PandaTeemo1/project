package kr.jhta.set;

import java.util.TreeSet;

public class TreesetDemo1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(50);
		scores.add(100);
		scores.add(67);
		scores.add(47);
		scores.add(86);
		
		System.out.println(scores);
		
		//가장작은갑 ㅅ찾기
		int minValue =scores.first();
		System.out.println(minValue);
		
		int maxValue = scores.last();
		System.out.println(maxValue);
		
		
	}
}
