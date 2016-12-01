public class DesktopApp{
	public static void main(String[] args){
		OpticalMouse m = new OpticalMouse();
		Desktop d = new Desktop();
		BallMouse b = new BallMouse();
		d.setMouse(b);
		d.running();
		d.painting();
		d.cleaning();
	}
}