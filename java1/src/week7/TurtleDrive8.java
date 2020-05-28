package week7;



public class TurtleDrive8 {
	public static void main(String[]args) {
		Turtle turtle = new Turtle(0.5,0.5,0);
		final double STEP = 0.2;
		final int n = 4;
		final int HOW_MANY = 9;

		for(int i=1;i<=HOW_MANY;i++) {
			drawSquare(turtle,STEP,n);
			turtle.turnLeft(360-(360/HOW_MANY));
		}
		turtle.pause(10);
	}
	public static void drawSquare(Turtle t,double size,int n) {
		for(int k=1;k<=n;k++) {
			t.pause(10);
			t.goForward(size);
			t.turnLeft(180-(180*(n-2))/n);
		}

	}

}

