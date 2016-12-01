import java.util.*;

public class SystemDemo{
	public static void main(String[] args){
		//����ð� �˾Ƴ��� 1/1000�� 
		long time = System.currentTimeMillis();
		System.out.println(time);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);

		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);

		String value2 = System.getenv("PATH");
		System.out.println(value2);

		//�ý����� ���μ����� ��ȸ�ϱ�
		String newLineChar = System.getProperty("line.separator");
		System.out.println("adf"+newLineChar+"asdf");

		//���� �ý����� ��B�� Ȩ ���丮 ��ȸ�ϱ�
		String dir = System.getProperty("user.home");
		System.out.println(dir);

		//���α׷� ����
		//System.exit(0);

		//�迭 �����ϱ�
		String[] names ={"��", "��", "��", "ȫ", "��", "��"}; 
		String[] dest = new String[10];
		//name = ���� �迭
		//namesPosition : ���� �迭���� ������ �и��� ���� ��ġ
		//dust : ���� �迭
		//dustPosition : ���� �迭���� ������ �׸��� �ٿ����� ���� ��ġ
		//length : ���� �迭���� ������ �׺��� ����

		//�迭 �����ϱ�
		System.arraycopy(names, 0, dest, 0, 6);

		System.out.println(Arrays.toString(dest));
		
	}
}

