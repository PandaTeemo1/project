public class ScoreApp1{
	public static void main(String[] args){
		Score c = new Score();

		c.name = "ȫ�浿";
		c.kor = 87;
		c.eng = 99;
		c.math = 24;

		int total = c.total();
		double avg = c.avg();

		System.out.println("�̸� : "+c.name);
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);
	}
}