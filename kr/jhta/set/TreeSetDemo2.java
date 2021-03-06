package kr.jhta.set;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Student> stu = new TreeSet<>();
		
		stu.add(new Student("홍길동", 100));
		stu.add(new Student("김유신", 70));
		stu.add(new Student("강감찬", 60));
		stu.add(new Student("이순신", 40));
		stu.add(new Student("유관순", 90));
		stu.add(new Student("유병우", 1));
		stu.add(new Student("최순실", 1));//저장되지 않는다.
		System.out.println(stu);
		
		Student winner = stu.last();
		System.out.println(winner);
	}
	public static class Student implements Comparable<Student>{
		private String name;
		private int score;
		
		public Student(String name, int score) {
			super();
			this.name = name;
			this.score = score;
		}
		
		public String getName() {
			return name;
		}
		public int getScore() {
			return score;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", score=" + score + "]";
		}
		@Override
		public int compareTo(Student other){
			int result = score - other.score;
			return result;
		}
		
	}
}
