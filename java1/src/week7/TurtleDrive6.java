package week7;



public class TurtleDrive6 {
	public static void main(String[]args) {
		Turtle turtle = new Turtle(0.5,0.5,0);
		final double STEP = 0.2;
		final int ANGLE = 90;

		for(int i=1;i<=3;i++) {
			drawSquare(turtle,STEP,ANGLE);
		}
		turtle.pause(500);
	}
	public static void drawSquare(Turtle t,double size,int n) {
		for(int k=1;k<=4;k++) {
			t.pause(500);
			t.goForward(size);
			t.turnLeft(n);
		}
		t.turnLeft(240);
	}

}

