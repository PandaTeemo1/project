public class Quizz6{
	public static void main(String[] args){

		//�̸� �μ� ���� �޿��� ���� �� �ִ� Employee Ŭ���� �����ϱ�
		//�ʵ� ����, �⺻������ getter/setter
		//^�� �������� ���ڿ� �߶� �迭�� ��� split
		//�迭�� ��������� �ϳ��� �����ؼ�, �� �߶� �迭�� ���
		//Employee ��ü�� ���� ��������� �� �����͸� employee ��ü�� �����ϱ�
		//Employee ��ü�� employee �迭�� �����ϱ�
		// Employee �迭�� ����� ���� ����ϱ�.

		String text = "ȫ�浿,������,����,300^������,������,����,300^������,�ѹ���,�븮,150^�̼���,�ѹ���,����,200^";

		//replace(" ","");

		Employee[] e = new Employee[4];
		
		String a[] = text.split("\\^");

		for(int i = 0; i < a.length; i++){
			e[i] = new Employee();
			int j = a[i].indexOf(",");
			e[i].setDlfma(a[i].substring(0, j));
			a[i] = a[i].substring(j+1,a[i].length());
			
			j = a[i].indexOf(",");
			e[i].setQntj(a[i].substring(0, j));
			a[i] = a[i].substring(j+1,a[i].length());

			j = a[i].indexOf(",");
			e[i].setWlrrmq(a[i].substring(0, j));
			a[i] = a[i].substring(j+1,a[i].length());

			e[i].setRmqdu(Integer.parseInt(a[i].substring(0, a[i].length())));
		}
		for(Employee s : e){
			s.Info();
		}
	}
}