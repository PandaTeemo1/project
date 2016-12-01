public class StringDemo{
	public static void main(String[] args){
		//��ü�� ����� ���ؼ� �����ڸ� ȣ���ؾߵ�
		//�����ڸ� ������ �ʰ� ��ü�� �����Ҽ� �ִ� ������ ����� ��Ʈ��
		/*
			String Ŭ����
				String Ŭ������ ���ڿ��� ǥ���Ѵ�.
				String���� �Һ����̴�. �ѹ� ������� ���Ŀ��� ������ �� ����.
				String�� ��ü�� �����ϴ� Ư���� ����� �����Ѵ�.
					String str = new String("abc");	//�����ڸ� �̿��� String ��ü ����
					String str = "abc";				//���ڿ� ǥ������ �̿��� String ��ü ����

				Employee emp = new Employee();
				emp.setNo(12);

				Ransdom ran = new Random();
				ran.nextInt();

				String str = new String("abc");
				String str = "abc";
				str.toUpperCase();

				"abc".toUpperCase();
		*/
		String str = "";
		//���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ� length;
		int len = str.length();
		System.out.println(len);

		//���ڿ��� ����ִ��� ���θ� ��ȯ�ϴ� �޼ҵ� : boolean isEmpty()
		boolean empty = str.isEmpty();
		System.out.println("�� ���ڿ��ΰ� : "+empty);

		//�ܾ�� �ܾ� ���̿� ������ �ǹ̰� �ִٰ� ������
		//���ڿ����� �ǹ̾��� ������ ������ ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ� : String trim();
		//���ڿ��� ���� ������ ����.
		String str2 = "      ȫ �浿       ";
		String str3 = str2.trim();
		System.out.println(str2);
		System.out.println(str3);

		//���ڿ��� ������ ���ؼ� ������ ������ ���� ���ڿ����� ���θ� ��ȯ�ϴ� �޼ҵ�

		String str4 = "����";
		String str5 = "����";

		boolean equa1 = str4.equals(str5);
		System.out.println("������ ���ڿ� �ΰ� ? "+equa1);

		String str6 = "apple";
		String str7 = "Apple";

		boolean equa2 = str6.equalsIgnoreCase(str7);
		System.out.println("��ҹ��� ���Ф����� ������ �� ������ ���ڿ��ΰ� ? "+equa2);

		//���ڿ��� ������ ���ڿ��� �����ϰ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ� boolean contains(CharSequene s)
		String str8 = "�ڹ� ���α׷��� - �ڹ� ���� �� ����";
		boolean contains = str8.contains("�ڹ�");
		System.out.println("[�ڹ�]��� ���ڿ��� �����ϰ� �ִ��� : "+contains);

		//���ڿ����� ������ ��ġ�� ����(char)�� ��ȯ�ϴ� �޼ҵ� : char charAt(int index);
		char ch = str8.charAt(1);
		System.out.println("1��° ���ڿ��� : " +ch);

		//���ڿ����� ������ ���ڿ��� ó������ �����ϴ� ��ġ�� ��ȯ�ϴ� �޼ҵ� : int indexOf(String str)
		int indexs = str8.indexOf("���α׷�");
		System.out.println("���ڿ����� [���α�]��� ���ڰ� ó������ �����ϴ� ��ġ��: "+indexs);//������ -1 ��ȯ

		//���ڿ��� ������ ������ ���ڿ��� ��ü�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ� : String replace(String target, String str)
		String str9 = str8.replace("�ڹ�", "���̽�");
		System.out.println(str8);
		System.out.println(str9);

		//���ڿ����� ������ ��ġ���� ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ� String substring(int beginIndex)
		String str10 = "abcdefghijklmn";
		String str11 = str10.substring(5);
		System.out.println(str11);

		//���ڿ����� ������ ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ� : String substring(int begin, int end)
		//������ġ�� ����, ����ġ�� �������� �ʴ´�.
		String str12 = str10.substring(0, 4);
		System.out.println(str12);

		String name1 = "ȫ�浿";
		String str13 = name1.substring(0, 1);
		System.out.println(str13);

		//���ڿ��� ������ �����ڸ� �������� �߶� �迭�� ��ȯ�ϴ� �޼ҵ� : String[] split(String delim)
		String text = "����, ���, ��õ, ����, �λ�, ����, ���, �뱸";
		String[] str14 = text.split(", ");
		System.out.println(str14[0]);
		System.out.println(str14[2]);

		//���ڿ��� �ҹ���,�빮�ڷ� ��ȯ�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		//String toUpperCase(), String toLowerCase()
		String str15 = "Pump";
		String str16 = str15.toUpperCase();
		String str17 = str15.toLowerCase();
		System.out.println(str16);
		System.out.println(str17);

		//����, �Ǽ�, �Ҹ�, ��Ÿ ���� ������ ������ ���ڿ��� ��ȯ�ؼ� ��ȯ�ϴ� ���� �޼ҵ�
		//String valueOf(int value) String valueOf(double value) String valueOf(boolean value)
		int number = 102030;
		//���� 102030�� ���ڿ� "102030"���� ��ȯ�ؼ� ��ȯ�Ѵ�.
		String str18 = String.valueOf(number);
		System.out.println(str18);
		
		double number1 = 1.323;
		//�Ǽ� 1.323�� ���ڿ� "1.323"���� ��ȯ�ؼ� ��ȯ�Ѵ�.
		String str19 = String.valueOf(number1);
		System.out.println(str19);
		
		boolean boolean1 = false;
		//������ false�� ���ڿ� "false"�� ��ȯ�ؼ� ��ȯ�Ѵ�.
		String str20 = String.valueOf(boolean1);
		System.out.println(boolean1);

		String str21 = str18.substring(str18.length()-1);
		System.out.println(str21);

		String str22 = 1234 + "";
		System.out.println(str22);

	}
}
//string�� ����� �װ��� ����ٲ����۴´�
