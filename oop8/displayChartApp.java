public class displayChartApp{
	public static void main(String[] args){
		// Chart ���� ��ü �����
		Chart c = new CloudChart();

		//Chart�� ��ü�� �����ؼ� dlsplay��ü �����
		display ChartDisplay = new display(c);

		//�׷��� �׸���
		ChartDisplay.drawGraph();

	}
}