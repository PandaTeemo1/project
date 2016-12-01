public class Quizz4app{
	public static void main(String[] args){
		Quizz4 qz1 = new Quizz4();
		Quizz4 qz2 = new Quizz4();
		Quizz4 qz3 = new Quizz4();

		qz1.no = 289;
		qz1.name = "홍길동";
		qz1.number = "010-1234-5678";
		qz1.department = "영업부서";
		qz1.position = "과장";
		qz1.money = 300;

		qz2.no = 359;
		qz2.name = "고길동";
		qz2.number = "010-4321-1234";
		qz2.department = "기획부서";
		qz2.position = "대리";
		qz2.money = 200;

		qz3.no = 424;
		qz3.name = "김둘리";
		qz3.number = "010-1234-1234";
		qz3.department = "재무부서";
		qz3.position = "사원";
		qz3.money = 150;

		int cal = qz1.cal();
		System.out.println("연 봉 : "+cal);
		qz1.data();
		qz2.data();
		qz3.data();
	}
}