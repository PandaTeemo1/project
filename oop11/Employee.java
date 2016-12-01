public class Employee{	
		
		private String dlfma;
		private String qntj;
		private String wlrrmq;
		private int rmqdu;

		public Employee() {}

		public String getDlfma(){
			return dlfma;
		}
		public void setDlfma(String dlfma){
			this.dlfma = dlfma;
		}
		public String getQntj(){
			return qntj;
		}
		public void setQntj(String qntj){
			this.qntj = qntj;
		}
		public String getWlrrmq(){
			return wlrrmq;
		}
		public void setWlrrmq(String wlrrmq){
			this.wlrrmq = wlrrmq;
		}
		public int getRmqdu(){
			return rmqdu;
		}
		public void setRmqdu(int rmqdu){
			this.rmqdu = rmqdu;
		}
		public void Info(){
			System.out.println("이 름 : "+this.getDlfma());
			System.out.println("부 서 : "+this.getQntj());
			System.out.println("직 급 : "+this.getWlrrmq());
			System.out.println("급 여 : "+this.getRmqdu());
			System.out.println("");
		}
}