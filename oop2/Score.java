public class Score{
	String name;
	int kor;
	int eng;
	int math;

	/*public Score(){
		//필드 초기화
		name = "홍길동";
		kor = 22;
		eng = 44;
		math = 99;
	}*/
	public Score(String q, int k, int j, int l){
		name = q;
		kor = k;
		eng = j;
		math = l;
	}

	public int total(){
		return kor + eng + math;
	}

	public double avg(){
		return total()/3.0;
	}
}