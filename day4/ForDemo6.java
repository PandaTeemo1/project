public class ForDemo6{
	public static void main(String[] args){
		//1~100������ ���� ����ϱ�
		//�� �հ谡 300�� �Ѿ�� ������ ���ڸ� �˾Ƴ���
		int total = 0;
		int number = 0;

		for (int a=1;a<=100; a++ ){
			number = a;
			total = total + a;
			if(total >= 3000){
				break;
			}
		}
		System.out.println(total);
		System.out.println(number);
	}
}