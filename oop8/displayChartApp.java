public class displayChartApp{
	public static void main(String[] args){
		// Chart 구현 객체 만들기
		Chart c = new CloudChart();

		//Chart류 객체를 전달해서 dlsplay객체 만들기
		display ChartDisplay = new display(c);

		//그래프 그리기
		ChartDisplay.drawGraph();

	}
}