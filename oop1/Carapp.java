public class Carapp{ 
	public static void main(String[] args){
		
		/* Car c 
			Car ��� ���赵�� ����ؼ� ������ ��ü�� �ּҰ��� ��� ���� c�� �����.
			CarŸ��(class,����)�� ���� c(��������)�� �����.
		  new Car();
			Car ���赵�� �ε��ؼ� ��ü�� �����ϰ�
			������ ��ü�� ���� �� �� �ִ� �ּҰ��� CarŸ���� ���� c�� �����ض�.
			*/
		car c = new car();
		System.out.println(c);

		car c2 = new car();
		System.out.println(c2);
		//������ ��ü�� �ʵ�, ������ ��ü�� �޼ҵ带 ����ϱ�.
		//@<-���� �������ؽ��ڵ�(��ü�� �ø����ȣ��� �����ϸ��)

		System.out.println(c.speed);
		c.speed = 10;
		
		System.out.println(c.speed);
		c.speedUp();
		System.out.println(c.speed);
		c.speedDown();
		System.out.println(c.speed);

	}
}