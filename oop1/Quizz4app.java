public class Quizz4app{
	public static void main(String[] args){
		Quizz4 qz1 = new Quizz4();
		Quizz4 qz2 = new Quizz4();
		Quizz4 qz3 = new Quizz4();

		qz1.no = 289;
		qz1.name = "ȫ�浿";
		qz1.number = "010-1234-5678";
		qz1.department = "�����μ�";
		qz1.position = "����";
		qz1.money = 300;

		qz2.no = 359;
		qz2.name = "��浿";
		qz2.number = "010-4321-1234";
		qz2.department = "��ȹ�μ�";
		qz2.position = "�븮";
		qz2.money = 200;

		qz3.no = 424;
		qz3.name = "��Ѹ�";
		qz3.number = "010-1234-1234";
		qz3.department = "�繫�μ�";
		qz3.position = "���";
		qz3.money = 150;

		int cal = qz1.cal();
		System.out.println("�� �� : "+cal);
		qz1.data();
		qz2.data();
		qz3.data();
	}
}