public class ScoreApp3{

	public static void main(String[] args){
		Score s = new Score("������", 30, 40, 50);

		int total = s.total();
		double avg = s.avg();

		System.out.println("�̸� : "+s.name);
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);
	}
}