public class display{
	//chart류 객체가 저장될 변수
	private Chart chart;

	public display(Chart chart){
		this.chart = chart;
	}
	public void drawGraph(){
		chart.draw();
	}
}