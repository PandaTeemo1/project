public class FinalDemo2App{
	public static void main(String[] args){
		/*
			FinalDemo2��ü�� ��ä���� x���� y���� ���� �ٸ� ���� ���� ��ü��
			������ �� �ִ�.
			������, final�� ������ x���� ������ �� ����.
		*/
		FinalDemo2 d1 = new FinalDemo2(10, 1);
		d1.setY(0);
		System.out.println();
		FinalDemo2 d2 = new FinalDemo2(20, 3);
		d2.setY(5);
		System.out.println();
	}
}