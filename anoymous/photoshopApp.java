package anoymous;

public class photoshopApp {
	public static void main(String[] args) {
		photoshop ps = new photoshop();
		
		Pen yellow = new Pen(){
			public void draw() {
				System.out.println("노랑");
			}
		};
		ps.Painting(yellow);
		/*
		 * ps.painting(new Pen());
		 * ps.painting(new Pen() {});
		 * ps.painting(new Pen() {
		 * });
		 * ps.painting(new Pen() {
		 * 	public void draw() {
		 * 	}
		 * });
		 */
		ps.Painting(new Pen(){
			public void draw(){
				System.out.println("빨강");
			}
			
		});
		ps.Painting(() -> {System.out.println("빨강");});
	}
}
